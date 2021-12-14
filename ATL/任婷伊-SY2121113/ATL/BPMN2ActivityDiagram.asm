<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="BPMN2ActivityDiagram"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchJoin2JoinNode():V"/>
		<constant value="A.__matchFlowObject2ActivityEdge():V"/>
		<constant value="A.__matchDecide2DecisionNode():V"/>
		<constant value="A.__matchProcess2ActivityNode():V"/>
		<constant value="A.__matchStart2InitialNode():V"/>
		<constant value="A.__matchEnd2FinalNode():V"/>
		<constant value="A.__matchFork2ForkNode():V"/>
		<constant value="__exec__"/>
		<constant value="Join2JoinNode"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyJoin2JoinNode(NTransientLink;):V"/>
		<constant value="FlowObject2ActivityEdge"/>
		<constant value="A.__applyFlowObject2ActivityEdge(NTransientLink;):V"/>
		<constant value="Decide2DecisionNode"/>
		<constant value="A.__applyDecide2DecisionNode(NTransientLink;):V"/>
		<constant value="Process2ActivityNode"/>
		<constant value="A.__applyProcess2ActivityNode(NTransientLink;):V"/>
		<constant value="Start2InitialNode"/>
		<constant value="A.__applyStart2InitialNode(NTransientLink;):V"/>
		<constant value="End2FinalNode"/>
		<constant value="A.__applyEnd2FinalNode(NTransientLink;):V"/>
		<constant value="Fork2ForkNode"/>
		<constant value="A.__applyFork2ForkNode(NTransientLink;):V"/>
		<constant value="__matchJoin2JoinNode"/>
		<constant value="Join"/>
		<constant value="BPMN"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="JoinNode"/>
		<constant value="ActivityDiagram"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="12:3-14:4"/>
		<constant value="__applyJoin2JoinNode"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="13:12-13:13"/>
		<constant value="13:12-13:18"/>
		<constant value="13:4-13:18"/>
		<constant value="link"/>
		<constant value="__matchFlowObject2ActivityEdge"/>
		<constant value="FlowObject"/>
		<constant value="ActivityEdge"/>
		<constant value="21:3-23:4"/>
		<constant value="__applyFlowObject2ActivityEdge"/>
		<constant value="22:12-22:13"/>
		<constant value="22:12-22:18"/>
		<constant value="22:4-22:18"/>
		<constant value="__matchDecide2DecisionNode"/>
		<constant value="Decide"/>
		<constant value="DecisionNode"/>
		<constant value="30:3-32:4"/>
		<constant value="__applyDecide2DecisionNode"/>
		<constant value="DecideExpression"/>
		<constant value="31:12-31:13"/>
		<constant value="31:12-31:30"/>
		<constant value="31:4-31:30"/>
		<constant value="__matchProcess2ActivityNode"/>
		<constant value="Process"/>
		<constant value="ActivityNode"/>
		<constant value="39:3-41:4"/>
		<constant value="__applyProcess2ActivityNode"/>
		<constant value="40:12-40:13"/>
		<constant value="40:12-40:18"/>
		<constant value="40:4-40:18"/>
		<constant value="__matchStart2InitialNode"/>
		<constant value="Start"/>
		<constant value="InitialNode"/>
		<constant value="48:3-50:4"/>
		<constant value="__applyStart2InitialNode"/>
		<constant value="startName"/>
		<constant value="49:12-49:13"/>
		<constant value="49:12-49:23"/>
		<constant value="49:4-49:23"/>
		<constant value="__matchEnd2FinalNode"/>
		<constant value="End"/>
		<constant value="FinalNode"/>
		<constant value="57:3-59:4"/>
		<constant value="__applyEnd2FinalNode"/>
		<constant value="endName"/>
		<constant value="58:12-58:13"/>
		<constant value="58:12-58:21"/>
		<constant value="58:4-58:21"/>
		<constant value="__matchFork2ForkNode"/>
		<constant value="Fork"/>
		<constant value="ForkNode"/>
		<constant value="66:3-68:4"/>
		<constant value="__applyFork2ForkNode"/>
		<constant value="67:12-67:13"/>
		<constant value="67:12-67:18"/>
		<constant value="67:4-67:18"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
			<getasm/>
			<pcall arg="43"/>
			<getasm/>
			<pcall arg="44"/>
			<getasm/>
			<pcall arg="45"/>
			<getasm/>
			<pcall arg="46"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="13"/>
		</localvariabletable>
	</operation>
	<operation name="47">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="50"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="51"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="52"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="53"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="54"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="55"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="56"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="57"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="58"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="60"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="61"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="62"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="1" name="33" begin="35" end="38"/>
			<lve slot="1" name="33" begin="45" end="48"/>
			<lve slot="1" name="33" begin="55" end="58"/>
			<lve slot="1" name="33" begin="65" end="68"/>
			<lve slot="0" name="17" begin="0" end="69"/>
		</localvariabletable>
	</operation>
	<operation name="63">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="64"/>
			<push arg="65"/>
			<findme/>
			<push arg="66"/>
			<call arg="67"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="68"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="48"/>
			<pcall arg="69"/>
			<dup/>
			<push arg="70"/>
			<load arg="19"/>
			<pcall arg="71"/>
			<dup/>
			<push arg="72"/>
			<push arg="73"/>
			<push arg="74"/>
			<new/>
			<pcall arg="75"/>
			<pusht/>
			<pcall arg="76"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="77" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="70" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="78">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="79"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="70"/>
			<call arg="80"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="72"/>
			<call arg="81"/>
			<store arg="82"/>
			<load arg="82"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="83" begin="11" end="11"/>
			<lne id="84" begin="11" end="12"/>
			<lne id="85" begin="9" end="14"/>
			<lne id="77" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="72" begin="7" end="15"/>
			<lve slot="2" name="70" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="86" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="87">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="88"/>
			<push arg="65"/>
			<findme/>
			<push arg="66"/>
			<call arg="67"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="68"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="51"/>
			<pcall arg="69"/>
			<dup/>
			<push arg="70"/>
			<load arg="19"/>
			<pcall arg="71"/>
			<dup/>
			<push arg="72"/>
			<push arg="89"/>
			<push arg="74"/>
			<new/>
			<pcall arg="75"/>
			<pusht/>
			<pcall arg="76"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="90" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="70" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="91">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="79"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="70"/>
			<call arg="80"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="72"/>
			<call arg="81"/>
			<store arg="82"/>
			<load arg="82"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="92" begin="11" end="11"/>
			<lne id="93" begin="11" end="12"/>
			<lne id="94" begin="9" end="14"/>
			<lne id="90" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="72" begin="7" end="15"/>
			<lve slot="2" name="70" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="86" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="95">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="96"/>
			<push arg="65"/>
			<findme/>
			<push arg="66"/>
			<call arg="67"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="68"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="53"/>
			<pcall arg="69"/>
			<dup/>
			<push arg="70"/>
			<load arg="19"/>
			<pcall arg="71"/>
			<dup/>
			<push arg="72"/>
			<push arg="97"/>
			<push arg="74"/>
			<new/>
			<pcall arg="75"/>
			<pusht/>
			<pcall arg="76"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="98" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="70" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="99">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="79"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="70"/>
			<call arg="80"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="72"/>
			<call arg="81"/>
			<store arg="82"/>
			<load arg="82"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="100"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="101" begin="11" end="11"/>
			<lne id="102" begin="11" end="12"/>
			<lne id="103" begin="9" end="14"/>
			<lne id="98" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="72" begin="7" end="15"/>
			<lve slot="2" name="70" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="86" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="104">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="105"/>
			<push arg="65"/>
			<findme/>
			<push arg="66"/>
			<call arg="67"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="68"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="55"/>
			<pcall arg="69"/>
			<dup/>
			<push arg="70"/>
			<load arg="19"/>
			<pcall arg="71"/>
			<dup/>
			<push arg="72"/>
			<push arg="106"/>
			<push arg="74"/>
			<new/>
			<pcall arg="75"/>
			<pusht/>
			<pcall arg="76"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="107" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="70" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="108">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="79"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="70"/>
			<call arg="80"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="72"/>
			<call arg="81"/>
			<store arg="82"/>
			<load arg="82"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="109" begin="11" end="11"/>
			<lne id="110" begin="11" end="12"/>
			<lne id="111" begin="9" end="14"/>
			<lne id="107" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="72" begin="7" end="15"/>
			<lve slot="2" name="70" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="86" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="112">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="113"/>
			<push arg="65"/>
			<findme/>
			<push arg="66"/>
			<call arg="67"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="68"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="57"/>
			<pcall arg="69"/>
			<dup/>
			<push arg="70"/>
			<load arg="19"/>
			<pcall arg="71"/>
			<dup/>
			<push arg="72"/>
			<push arg="114"/>
			<push arg="74"/>
			<new/>
			<pcall arg="75"/>
			<pusht/>
			<pcall arg="76"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="115" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="70" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="116">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="79"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="70"/>
			<call arg="80"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="72"/>
			<call arg="81"/>
			<store arg="82"/>
			<load arg="82"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="117"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="118" begin="11" end="11"/>
			<lne id="119" begin="11" end="12"/>
			<lne id="120" begin="9" end="14"/>
			<lne id="115" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="72" begin="7" end="15"/>
			<lve slot="2" name="70" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="86" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="121">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="122"/>
			<push arg="65"/>
			<findme/>
			<push arg="66"/>
			<call arg="67"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="68"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="59"/>
			<pcall arg="69"/>
			<dup/>
			<push arg="70"/>
			<load arg="19"/>
			<pcall arg="71"/>
			<dup/>
			<push arg="72"/>
			<push arg="123"/>
			<push arg="74"/>
			<new/>
			<pcall arg="75"/>
			<pusht/>
			<pcall arg="76"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="124" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="70" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="125">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="79"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="70"/>
			<call arg="80"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="72"/>
			<call arg="81"/>
			<store arg="82"/>
			<load arg="82"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="126"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="127" begin="11" end="11"/>
			<lne id="128" begin="11" end="12"/>
			<lne id="129" begin="9" end="14"/>
			<lne id="124" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="72" begin="7" end="15"/>
			<lve slot="2" name="70" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="86" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="130">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="131"/>
			<push arg="65"/>
			<findme/>
			<push arg="66"/>
			<call arg="67"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="68"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="61"/>
			<pcall arg="69"/>
			<dup/>
			<push arg="70"/>
			<load arg="19"/>
			<pcall arg="71"/>
			<dup/>
			<push arg="72"/>
			<push arg="132"/>
			<push arg="74"/>
			<new/>
			<pcall arg="75"/>
			<pusht/>
			<pcall arg="76"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="133" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="70" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="134">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="79"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="70"/>
			<call arg="80"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="72"/>
			<call arg="81"/>
			<store arg="82"/>
			<load arg="82"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="135" begin="11" end="11"/>
			<lne id="136" begin="11" end="12"/>
			<lne id="137" begin="9" end="14"/>
			<lne id="133" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="72" begin="7" end="15"/>
			<lve slot="2" name="70" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="86" begin="0" end="15"/>
		</localvariabletable>
	</operation>
</asm>
