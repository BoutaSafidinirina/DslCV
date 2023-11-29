package org.xtext.example.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.ecore.EObject
import org.xtext.example.cv.Model
import org.xtext.example.cv.Education
import org.xtext.example.cv.Experience

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CvGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // fsa.generateFile('greetings.txt', 'People to greet: ' + 
        // resource.allContents
        // .filter(Greeting)
        // .map[name]
        // .join(', '))
        for (EObject obj : resource.contents) {
            if (obj instanceof Model) {
                val cv = obj as Model
                generateHTML(cv, fsa)
            }
        }
    }
    

    def generateHTML(Model cv, IFileSystemAccess2 fsa) {
    	
        fsa.generateFile(cv.name + ".html", '''
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>''' + cv.title + '''</title>
                <style>
                    body {
                        font-family: 'Arial', sans-serif;
                        line-height: 1.6;
                        margin: 0;
                        padding: 0;
                        background-color: #f4f4f4;
                        color: #333;
                    }

                    header {
                        background-color: #333;
                        color: #fff;
                        text-align: center;
                        padding: 2em 0;
                    }

                    h1, h2 {
                        color: #333;
                    }

                    section {
                        max-width: 800px;
                        margin: 20px auto;
                        background-color: #fff;
                        padding: 20px;
                        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                        border-radius: 8px;
                    }

                    h2 {
                        border-bottom: 2px solid #333;
                        padding-bottom: 10px;
                        margin-bottom: 20px;
                    }

                    p {
                        margin-bottom: 15px;
                        font-size: 16px;
                        color: #555;
                    }

                    ul {
                        list-style-type: none;
                        padding: 0;
                    }

                    ul li {
                        margin-bottom: 10px;
                    }

                    .education, .experience {
                        margin-bottom: 30px;
                    }

                    footer {
                        text-align: center;
                        padding: 1em 0;
                        background-color: #333;
                        color: #fff;
                    }
                </style>
            </head>
            <body>

                <header>
                    <h1>''' + cv.name + '''</h1>
                    <p>''' + cv.title + '''</p>
                </header>

                <section>
                    <h2>À propos de moi</h2>
                    <p>''' + cv.about + '''</p>
                </section>

                <section class="education">
                    <h2>Éducation</h2>
                    <ul>
                        «FOR edu : cv.education » 
                            <li><strong>''' + edu.degree + '''</strong> - ''' + edu.university + ''', ''' + edu.year + '''</li>
                        «ENDFOR»
                        
                        
                    </ul>
                </section>

                <section class="experience">
                    <h2>Expérience professionnelle</h2>
                    <ul>
                        «FOR exp : cv.experience»
                            <li>
                                <strong>''' + exp.position + '''</strong> - ''' + exp.company + ''', ''' + exp.year + '''
                                <p>''' + exp.description + '''</p>
                            </li>
                        «ENDFOR»
                    </ul>
                </section>

                <footer>
                    <p>Contactez-moi: ''' + cv.contact + '''</p>
                </footer>

            </body>
            </html>
        ''')
    }
}
