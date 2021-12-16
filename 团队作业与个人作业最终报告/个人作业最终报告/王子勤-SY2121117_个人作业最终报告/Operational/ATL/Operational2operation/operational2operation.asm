<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="operational2operation"/>
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
		<constant value="A.__matchOperational2operation():V"/>
		<constant value="A.__matchOperationalPerformer2performer():V"/>
		<constant value="A.__matchOperationalArchitecture2architecture():V"/>
		<constant value="A.__matchOperationalMethod2method():V"/>
		<constant value="A.__matchOperationalParameter2parameter():V"/>
		<constant value="A.__matchOperationalParameter2role():V"/>
		<constant value="__exec__"/>
		<constant value="Operational2operation"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyOperational2operation(NTransientLink;):V"/>
		<constant value="OperationalPerformer2performer"/>
		<constant value="A.__applyOperationalPerformer2performer(NTransientLink;):V"/>
		<constant value="OperationalArchitecture2architecture"/>
		<constant value="A.__applyOperationalArchitecture2architecture(NTransientLink;):V"/>
		<constant value="OperationalMethod2method"/>
		<constant value="A.__applyOperationalMethod2method(NTransientLink;):V"/>
		<constant value="OperationalParameter2parameter"/>
		<constant value="A.__applyOperationalParameter2parameter(NTransientLink;):V"/>
		<constant value="OperationalParameter2role"/>
		<constant value="A.__applyOperationalParameter2role(NTransientLink;):V"/>
		<constant value="__matchOperational2operation"/>
		<constant value="Operational"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="operation"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="9:3-11:4"/>
		<constant value="__applyOperational2operation"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="10:12-10:13"/>
		<constant value="10:12-10:18"/>
		<constant value="10:4-10:18"/>
		<constant value="link"/>
		<constant value="__matchOperationalPerformer2performer"/>
		<constant value="OperationalPerformer"/>
		<constant value="performer"/>
		<constant value="17:3-19:4"/>
		<constant value="__applyOperationalPerformer2performer"/>
		<constant value="18:12-18:13"/>
		<constant value="18:12-18:18"/>
		<constant value="18:4-18:18"/>
		<constant value="__matchOperationalArchitecture2architecture"/>
		<constant value="OperationalArchitecture"/>
		<constant value="architecture"/>
		<constant value="25:3-27:4"/>
		<constant value="__applyOperationalArchitecture2architecture"/>
		<constant value="26:12-26:13"/>
		<constant value="26:12-26:18"/>
		<constant value="26:4-26:18"/>
		<constant value="__matchOperationalMethod2method"/>
		<constant value="OperationalMethod"/>
		<constant value="method"/>
		<constant value="33:3-35:4"/>
		<constant value="__applyOperationalMethod2method"/>
		<constant value="34:12-34:13"/>
		<constant value="34:12-34:18"/>
		<constant value="34:4-34:18"/>
		<constant value="__matchOperationalParameter2parameter"/>
		<constant value="OperationalParameter"/>
		<constant value="parameter"/>
		<constant value="41:3-43:4"/>
		<constant value="__applyOperationalParameter2parameter"/>
		<constant value="42:12-42:13"/>
		<constant value="42:12-42:18"/>
		<constant value="42:4-42:18"/>
		<constant value="__matchOperationalParameter2role"/>
		<constant value="OperationalRole"/>
		<constant value="role"/>
		<constant value="49:3-51:4"/>
		<constant value="__applyOperationalParameter2role"/>
		<constant value="50:12-50:13"/>
		<constant value="50:12-50:18"/>
		<constant value="50:4-50:18"/>
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
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="11"/>
		</localvariabletable>
	</operation>
	<operation name="46">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="47"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="49"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="51"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="53"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="54"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="55"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="56"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="57"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<call arg="48"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="59"/>
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
			<lve slot="0" name="17" begin="0" end="59"/>
		</localvariabletable>
	</operation>
	<operation name="60">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="61"/>
			<push arg="61"/>
			<findme/>
			<push arg="62"/>
			<call arg="63"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="64"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="47"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="66"/>
			<load arg="19"/>
			<pcall arg="67"/>
			<dup/>
			<push arg="68"/>
			<push arg="69"/>
			<push arg="69"/>
			<new/>
			<pcall arg="70"/>
			<pusht/>
			<pcall arg="71"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="72" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="66" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="73">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="74"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="66"/>
			<call arg="75"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="68"/>
			<call arg="76"/>
			<store arg="77"/>
			<load arg="77"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="78" begin="11" end="11"/>
			<lne id="79" begin="11" end="12"/>
			<lne id="80" begin="9" end="14"/>
			<lne id="72" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="68" begin="7" end="15"/>
			<lve slot="2" name="66" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="81" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="82">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="83"/>
			<push arg="61"/>
			<findme/>
			<push arg="62"/>
			<call arg="63"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="64"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="66"/>
			<load arg="19"/>
			<pcall arg="67"/>
			<dup/>
			<push arg="68"/>
			<push arg="84"/>
			<push arg="69"/>
			<new/>
			<pcall arg="70"/>
			<pusht/>
			<pcall arg="71"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="85" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="66" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="86">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="74"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="66"/>
			<call arg="75"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="68"/>
			<call arg="76"/>
			<store arg="77"/>
			<load arg="77"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="87" begin="11" end="11"/>
			<lne id="88" begin="11" end="12"/>
			<lne id="89" begin="9" end="14"/>
			<lne id="85" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="68" begin="7" end="15"/>
			<lve slot="2" name="66" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="81" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="90">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="91"/>
			<push arg="61"/>
			<findme/>
			<push arg="62"/>
			<call arg="63"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="64"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="52"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="66"/>
			<load arg="19"/>
			<pcall arg="67"/>
			<dup/>
			<push arg="68"/>
			<push arg="92"/>
			<push arg="69"/>
			<new/>
			<pcall arg="70"/>
			<pusht/>
			<pcall arg="71"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="93" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="66" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="94">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="74"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="66"/>
			<call arg="75"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="68"/>
			<call arg="76"/>
			<store arg="77"/>
			<load arg="77"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="95" begin="11" end="11"/>
			<lne id="96" begin="11" end="12"/>
			<lne id="97" begin="9" end="14"/>
			<lne id="93" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="68" begin="7" end="15"/>
			<lve slot="2" name="66" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="81" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="98">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="99"/>
			<push arg="61"/>
			<findme/>
			<push arg="62"/>
			<call arg="63"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="64"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="54"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="66"/>
			<load arg="19"/>
			<pcall arg="67"/>
			<dup/>
			<push arg="68"/>
			<push arg="100"/>
			<push arg="69"/>
			<new/>
			<pcall arg="70"/>
			<pusht/>
			<pcall arg="71"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="101" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="66" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="102">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="74"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="66"/>
			<call arg="75"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="68"/>
			<call arg="76"/>
			<store arg="77"/>
			<load arg="77"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="103" begin="11" end="11"/>
			<lne id="104" begin="11" end="12"/>
			<lne id="105" begin="9" end="14"/>
			<lne id="101" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="68" begin="7" end="15"/>
			<lve slot="2" name="66" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="81" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="106">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="107"/>
			<push arg="61"/>
			<findme/>
			<push arg="62"/>
			<call arg="63"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="64"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="56"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="66"/>
			<load arg="19"/>
			<pcall arg="67"/>
			<dup/>
			<push arg="68"/>
			<push arg="108"/>
			<push arg="69"/>
			<new/>
			<pcall arg="70"/>
			<pusht/>
			<pcall arg="71"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="109" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="66" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="110">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="74"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="66"/>
			<call arg="75"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="68"/>
			<call arg="76"/>
			<store arg="77"/>
			<load arg="77"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="111" begin="11" end="11"/>
			<lne id="112" begin="11" end="12"/>
			<lne id="113" begin="9" end="14"/>
			<lne id="109" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="68" begin="7" end="15"/>
			<lve slot="2" name="66" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="81" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="114">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="115"/>
			<push arg="61"/>
			<findme/>
			<push arg="62"/>
			<call arg="63"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="64"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="58"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="66"/>
			<load arg="19"/>
			<pcall arg="67"/>
			<dup/>
			<push arg="68"/>
			<push arg="116"/>
			<push arg="69"/>
			<new/>
			<pcall arg="70"/>
			<pusht/>
			<pcall arg="71"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="117" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="66" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="118">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="74"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="66"/>
			<call arg="75"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="68"/>
			<call arg="76"/>
			<store arg="77"/>
			<load arg="77"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="119" begin="11" end="11"/>
			<lne id="120" begin="11" end="12"/>
			<lne id="121" begin="9" end="14"/>
			<lne id="117" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="68" begin="7" end="15"/>
			<lve slot="2" name="66" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="81" begin="0" end="15"/>
		</localvariabletable>
	</operation>
</asm>
