/*
 * generated by Xtext 2.14.0
 */
package fr.inria.sed.logo.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.inria.sed.logo.xtext.logo.ProcDeclaration
import java.util.List

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LogoGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val List<ProcDeclaration> allProcDecl = resource.allContents.filter(ProcDeclaration).toList
		val content = '''
		<html>
			<body>
				List of procedures declared in «resource.URI.segments.last».
				«FOR procDecl : allProcDecl BEFORE '<UL>' AFTER '</UL>'»
					<LI>«procDecl.name» («FOR arg : procDecl.args SEPARATOR ', '» «arg.name»«ENDFOR»)</LI>
				«ENDFOR»
			</body>
		</html>
		'''
		fsa.generateFile(resource.URI.segments.last+"_summary.html", content)
	}
}
