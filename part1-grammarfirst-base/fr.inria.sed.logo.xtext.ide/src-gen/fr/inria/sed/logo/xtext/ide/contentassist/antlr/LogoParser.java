/*
 * generated by Xtext 2.14.0
 */
package fr.inria.sed.logo.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.inria.sed.logo.xtext.ide.contentassist.antlr.internal.InternalLogoParser;
import fr.inria.sed.logo.xtext.services.LogoGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LogoParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LogoGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LogoGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getLogoProgramAccess().getGroup(), "rule__LogoProgram__Group__0");
			builder.put(grammarAccess.getProcDeclarationAccess().getGroup(), "rule__ProcDeclaration__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getProcCallAccess().getGroup(), "rule__ProcCall__Group__0");
			builder.put(grammarAccess.getProcCallAccess().getGroup_3(), "rule__ProcCall__Group_3__0");
			builder.put(grammarAccess.getForwardAccess().getGroup(), "rule__Forward__Group__0");
			builder.put(grammarAccess.getLeftAccess().getGroup(), "rule__Left__Group__0");
			builder.put(grammarAccess.getRightAccess().getGroup(), "rule__Right__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getLogoProgramAccess().getInstructionsAssignment_1(), "rule__LogoProgram__InstructionsAssignment_1");
			builder.put(grammarAccess.getLogoProgramAccess().getInstructionsAssignment_2(), "rule__LogoProgram__InstructionsAssignment_2");
			builder.put(grammarAccess.getProcDeclarationAccess().getNameAssignment_2(), "rule__ProcDeclaration__NameAssignment_2");
			builder.put(grammarAccess.getProcDeclarationAccess().getArgsAssignment_3(), "rule__ProcDeclaration__ArgsAssignment_3");
			builder.put(grammarAccess.getProcDeclarationAccess().getInstructionsAssignment_4(), "rule__ProcDeclaration__InstructionsAssignment_4");
			builder.put(grammarAccess.getProcDeclarationAccess().getInstructionsAssignment_5(), "rule__ProcDeclaration__InstructionsAssignment_5");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_2(), "rule__Parameter__NameAssignment_2");
			builder.put(grammarAccess.getProcCallAccess().getDeclarationAssignment_0(), "rule__ProcCall__DeclarationAssignment_0");
			builder.put(grammarAccess.getProcCallAccess().getActualArgsAssignment_2(), "rule__ProcCall__ActualArgsAssignment_2");
			builder.put(grammarAccess.getProcCallAccess().getActualArgsAssignment_3_1(), "rule__ProcCall__ActualArgsAssignment_3_1");
			builder.put(grammarAccess.getForwardAccess().getStepsAssignment_1(), "rule__Forward__StepsAssignment_1");
			builder.put(grammarAccess.getLeftAccess().getAngleAssignment_2(), "rule__Left__AngleAssignment_2");
			builder.put(grammarAccess.getRightAccess().getAngleAssignment_2(), "rule__Right__AngleAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LogoGrammarAccess grammarAccess;

	@Override
	protected InternalLogoParser createParser() {
		InternalLogoParser result = new InternalLogoParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LogoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LogoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}