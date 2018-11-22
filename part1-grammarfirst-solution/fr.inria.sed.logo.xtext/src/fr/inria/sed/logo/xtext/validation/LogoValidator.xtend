/*
 * generated by Xtext 2.14.0
 */
package fr.inria.sed.logo.xtext.validation

import org.eclipse.xtext.validation.Check
import fr.inria.sed.logo.xtext.logo.ProcCall
import fr.inria.sed.logo.xtext.logo.LogoPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class LogoValidator extends AbstractLogoValidator {
	
public static val INVALID_ARGS_NUMBER = 'invalidNumberOfArgs'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					LogoPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	
	@Check
	def checkPassedParameters(ProcCall procCall){
		if(procCall.actualArgs.size != procCall.declaration.args.size){
			warning('invalid number of argument, (expecting '+procCall.declaration.args.size+')',
				procCall,
				LogoPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				INVALID_ARGS_NUMBER
			)
		}
	}
	
}
