<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="personnel2person"/>
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
		<constant value="A.__matchEmployee2Researcher():V"/>
		<constant value="A.__matchEmployee2Developer():V"/>
		<constant value="__exec__"/>
		<constant value="Employee2Researcher"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyEmployee2Researcher(NTransientLink;):V"/>
		<constant value="Employee2Developer"/>
		<constant value="A.__applyEmployee2Developer(NTransientLink;):V"/>
		<constant value="isResearcher"/>
		<constant value="MMMPersonnel!Employee;"/>
		<constant value="0"/>
		<constant value="researchDepartment"/>
		<constant value="J.oclIsUndefined():J"/>
		<constant value="J.not():J"/>
		<constant value="7"/>
		<constant value="8"/>
		<constant value="8:9-8:13"/>
		<constant value="8:9-8:32"/>
		<constant value="8:9-8:49"/>
		<constant value="8:5-8:49"/>
		<constant value="11:3-11:8"/>
		<constant value="9:3-9:7"/>
		<constant value="8:2-12:7"/>
		<constant value="isDeveloper"/>
		<constant value="developDepartment"/>
		<constant value="16:9-16:13"/>
		<constant value="16:9-16:31"/>
		<constant value="16:9-16:48"/>
		<constant value="16:5-16:48"/>
		<constant value="19:3-19:8"/>
		<constant value="17:3-17:7"/>
		<constant value="16:2-20:7"/>
		<constant value="__matchEmployee2Researcher"/>
		<constant value="Personnel"/>
		<constant value="MMPersonnel"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="Employee"/>
		<constant value="J.isResearcher():J"/>
		<constant value="B.not():B"/>
		<constant value="42"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="p"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="r"/>
		<constant value="Researcher"/>
		<constant value="MMPerson"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="26:29-26:30"/>
		<constant value="26:29-26:45"/>
		<constant value="28:4-31:5"/>
		<constant value="__applyEmployee2Researcher"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="3"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="4"/>
		<constant value="departmentName"/>
		<constant value="department"/>
		<constant value="29:19-29:20"/>
		<constant value="29:19-29:35"/>
		<constant value="29:5-29:35"/>
		<constant value="30:13-30:14"/>
		<constant value="30:13-30:19"/>
		<constant value="30:5-30:19"/>
		<constant value="link"/>
		<constant value="__matchEmployee2Developer"/>
		<constant value="J.isDeveloper():J"/>
		<constant value="Developer"/>
		<constant value="37:29-37:30"/>
		<constant value="37:29-37:44"/>
		<constant value="39:4-42:5"/>
		<constant value="__applyEmployee2Developer"/>
		<constant value="40:19-40:20"/>
		<constant value="40:19-40:35"/>
		<constant value="40:5-40:35"/>
		<constant value="41:13-41:14"/>
		<constant value="41:13-41:19"/>
		<constant value="41:5-41:19"/>
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
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="42">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="43"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="45"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="46"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="0" name="17" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="48">
		<context type="49"/>
		<parameters>
		</parameters>
		<code>
			<load arg="50"/>
			<get arg="51"/>
			<call arg="52"/>
			<call arg="53"/>
			<if arg="54"/>
			<pushf/>
			<goto arg="55"/>
			<pusht/>
		</code>
		<linenumbertable>
			<lne id="56" begin="0" end="0"/>
			<lne id="57" begin="0" end="1"/>
			<lne id="58" begin="0" end="2"/>
			<lne id="59" begin="0" end="3"/>
			<lne id="60" begin="5" end="5"/>
			<lne id="61" begin="7" end="7"/>
			<lne id="62" begin="0" end="7"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="7"/>
		</localvariabletable>
	</operation>
	<operation name="63">
		<context type="49"/>
		<parameters>
		</parameters>
		<code>
			<load arg="50"/>
			<get arg="64"/>
			<call arg="52"/>
			<call arg="53"/>
			<if arg="54"/>
			<pushf/>
			<goto arg="55"/>
			<pusht/>
		</code>
		<linenumbertable>
			<lne id="65" begin="0" end="0"/>
			<lne id="66" begin="0" end="1"/>
			<lne id="67" begin="0" end="2"/>
			<lne id="68" begin="0" end="3"/>
			<lne id="69" begin="5" end="5"/>
			<lne id="70" begin="7" end="7"/>
			<lne id="71" begin="0" end="7"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="7"/>
		</localvariabletable>
	</operation>
	<operation name="72">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="73"/>
			<push arg="74"/>
			<findme/>
			<push arg="75"/>
			<call arg="76"/>
			<iterate/>
			<store arg="19"/>
			<push arg="77"/>
			<push arg="74"/>
			<findme/>
			<push arg="75"/>
			<call arg="76"/>
			<iterate/>
			<store arg="29"/>
			<load arg="29"/>
			<call arg="78"/>
			<call arg="79"/>
			<if arg="80"/>
			<getasm/>
			<get arg="1"/>
			<push arg="81"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="43"/>
			<pcall arg="82"/>
			<dup/>
			<push arg="83"/>
			<load arg="19"/>
			<pcall arg="84"/>
			<dup/>
			<push arg="33"/>
			<load arg="29"/>
			<pcall arg="84"/>
			<dup/>
			<push arg="85"/>
			<push arg="86"/>
			<push arg="87"/>
			<new/>
			<pcall arg="88"/>
			<pusht/>
			<pcall arg="89"/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="90" begin="14" end="14"/>
			<lne id="91" begin="14" end="15"/>
			<lne id="92" begin="34" end="39"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="83" begin="6" end="41"/>
			<lve slot="2" name="33" begin="13" end="42"/>
			<lve slot="0" name="17" begin="0" end="43"/>
		</localvariabletable>
	</operation>
	<operation name="93">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="94"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="83"/>
			<call arg="95"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="33"/>
			<call arg="95"/>
			<store arg="96"/>
			<load arg="19"/>
			<push arg="85"/>
			<call arg="97"/>
			<store arg="98"/>
			<load arg="98"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="99"/>
			<call arg="30"/>
			<set arg="100"/>
			<dup/>
			<getasm/>
			<load arg="96"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="101" begin="15" end="15"/>
			<lne id="102" begin="15" end="16"/>
			<lne id="103" begin="13" end="18"/>
			<lne id="104" begin="21" end="21"/>
			<lne id="105" begin="21" end="22"/>
			<lne id="106" begin="19" end="24"/>
			<lne id="92" begin="12" end="25"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="85" begin="11" end="25"/>
			<lve slot="2" name="83" begin="3" end="25"/>
			<lve slot="3" name="33" begin="7" end="25"/>
			<lve slot="0" name="17" begin="0" end="25"/>
			<lve slot="1" name="107" begin="0" end="25"/>
		</localvariabletable>
	</operation>
	<operation name="108">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="73"/>
			<push arg="74"/>
			<findme/>
			<push arg="75"/>
			<call arg="76"/>
			<iterate/>
			<store arg="19"/>
			<push arg="77"/>
			<push arg="74"/>
			<findme/>
			<push arg="75"/>
			<call arg="76"/>
			<iterate/>
			<store arg="29"/>
			<load arg="29"/>
			<call arg="109"/>
			<call arg="79"/>
			<if arg="80"/>
			<getasm/>
			<get arg="1"/>
			<push arg="81"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="46"/>
			<pcall arg="82"/>
			<dup/>
			<push arg="83"/>
			<load arg="19"/>
			<pcall arg="84"/>
			<dup/>
			<push arg="33"/>
			<load arg="29"/>
			<pcall arg="84"/>
			<dup/>
			<push arg="85"/>
			<push arg="110"/>
			<push arg="87"/>
			<new/>
			<pcall arg="88"/>
			<pusht/>
			<pcall arg="89"/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="111" begin="14" end="14"/>
			<lne id="112" begin="14" end="15"/>
			<lne id="113" begin="34" end="39"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="83" begin="6" end="41"/>
			<lve slot="2" name="33" begin="13" end="42"/>
			<lve slot="0" name="17" begin="0" end="43"/>
		</localvariabletable>
	</operation>
	<operation name="114">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="94"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="83"/>
			<call arg="95"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="33"/>
			<call arg="95"/>
			<store arg="96"/>
			<load arg="19"/>
			<push arg="85"/>
			<call arg="97"/>
			<store arg="98"/>
			<load arg="98"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="99"/>
			<call arg="30"/>
			<set arg="100"/>
			<dup/>
			<getasm/>
			<load arg="96"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="115" begin="15" end="15"/>
			<lne id="116" begin="15" end="16"/>
			<lne id="117" begin="13" end="18"/>
			<lne id="118" begin="21" end="21"/>
			<lne id="119" begin="21" end="22"/>
			<lne id="120" begin="19" end="24"/>
			<lne id="113" begin="12" end="25"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="85" begin="11" end="25"/>
			<lve slot="2" name="83" begin="3" end="25"/>
			<lve slot="3" name="33" begin="7" end="25"/>
			<lve slot="0" name="17" begin="0" end="25"/>
			<lve slot="1" name="107" begin="0" end="25"/>
		</localvariabletable>
	</operation>
</asm>
