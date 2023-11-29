package org.xtext.example.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.example.cv.Model;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CvGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method generateHTML(Model, IFileSystemAccess2) from the type CvGenerator refers to the missing type Object");
  }

  public Object generateHTML(final Model cv, final IFileSystemAccess2 fsa) {
    throw new Error("Unresolved compilation problems:"
      + "\nno viable alternative at input \'» \\r\\n                            <li><strong>\'\'\'\'"
      + "\nno viable alternative at input \'ENDFOR\'"
      + "\nmissing \')\' at \'exp\'"
      + "\nmismatched input \':\' expecting \'}\'"
      + "\nThe method or field edu is undefined"
      + "\nThe method or field edu is undefined"
      + "\nThe method or field edu is undefined"
      + "\nThe method or field exp is undefined"
      + "\ndegree cannot be resolved"
      + "\nuniversity cannot be resolved"
      + "\nyear cannot be resolved");
  }
}
