/*
 * generated by Xtext 2.14.0
 */
package fr.inria.sed.logo.xtext.tests

import com.google.inject.Inject
import fr.inria.sed.logo.LogoProgram
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(LogoInjectorProvider)
class LogoParsingTest {
	@Inject
	ParseHelper<LogoProgram> parseHelper
	
	@Test
	def void canParseCircleProgram() {
		val result = parseHelper.parse('''
			to circle :ne :size 
				repeat :ne 
				[ 
					right  (360 / :ne)  
					forward :size 
				] 
			end 
			
			clear 
			pendown 
			circle ( 36 , 20 ) 
			penup 
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
}
