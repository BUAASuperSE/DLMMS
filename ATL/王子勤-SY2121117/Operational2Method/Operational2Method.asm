<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="Operational2Method"/>
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
		<constant value="A.__matchMethod2GoodMethod():V"/>
		<constant value="A.__matchMethod2BadMethod():V"/>
		<constant value="__exec__"/>
		<constant value="Method2GoodMethod"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyMethod2GoodMethod(NTransientLink;):V"/>
		<constant value="Method2BadMethod"/>
		<constant value="A.__applyMethod2BadMethod(NTransientLink;):V"/>
		<constant value="isGoodMethod"/>
		<constant value="MOperational!OperationalMethod;"/>
		<constant value="0"/>
		<constant value="goodMethodOf"/>
		<constant value="J.oclIsUndefined():J"/>
		<constant value="J.not():J"/>
		<constant value="7"/>
		<constant value="8"/>
		<constant value="6:9-6:13"/>
		<constant value="6:9-6:26"/>
		<constant value="6:9-6:43"/>
		<constant value="6:5-6:43"/>
		<constant value="9:3-9:8"/>
		<constant value="7:3-7:7"/>
		<constant value="6:2-10:7"/>
		<constant value="__matchMethod2GoodMethod"/>
		<constant value="OperationalMethod"/>
		<constant value="Operational"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="J.isGoodMethod():J"/>
		<constant value="B.not():B"/>
		<constant value="31"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="GoodMethod"/>
		<constant value="Method"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="13:37-13:38"/>
		<constant value="13:37-13:53"/>
		<constant value="15:3-17:4"/>
		<constant value="__applyMethod2GoodMethod"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="goodMethod"/>
		<constant value="method"/>
		<constant value="16:14-16:26"/>
		<constant value="16:4-16:26"/>
		<constant value="link"/>
		<constant value="__matchMethod2BadMethod"/>
		<constant value="32"/>
		<constant value="BadMethod"/>
		<constant value="22:41-22:42"/>
		<constant value="22:41-22:57"/>
		<constant value="22:37-22:57"/>
		<constant value="24:3-26:4"/>
		<constant value="__applyMethod2BadMethod"/>
		<constant value="badMethod"/>
		<constant value="25:14-25:25"/>
		<constant value="25:4-25:25"/>
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
			<load arg="19"/>
			<call arg="68"/>
			<call arg="69"/>
			<if arg="70"/>
			<getasm/>
			<get arg="1"/>
			<push arg="71"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="43"/>
			<pcall arg="72"/>
			<dup/>
			<push arg="73"/>
			<load arg="19"/>
			<pcall arg="74"/>
			<dup/>
			<push arg="75"/>
			<push arg="76"/>
			<push arg="77"/>
			<new/>
			<pcall arg="78"/>
			<pusht/>
			<pcall arg="79"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="80" begin="7" end="7"/>
			<lne id="81" begin="7" end="8"/>
			<lne id="82" begin="23" end="28"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="73" begin="6" end="30"/>
			<lve slot="0" name="17" begin="0" end="31"/>
		</localvariabletable>
	</operation>
	<operation name="83">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="84"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="73"/>
			<call arg="85"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="75"/>
			<call arg="86"/>
			<store arg="87"/>
			<load arg="87"/>
			<dup/>
			<getasm/>
			<push arg="88"/>
			<call arg="30"/>
			<set arg="89"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="90" begin="11" end="11"/>
			<lne id="91" begin="9" end="13"/>
			<lne id="82" begin="8" end="14"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="75" begin="7" end="14"/>
			<lve slot="2" name="73" begin="3" end="14"/>
			<lve slot="0" name="17" begin="0" end="14"/>
			<lve slot="1" name="92" begin="0" end="14"/>
		</localvariabletable>
	</operation>
	<operation name="93">
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
			<load arg="19"/>
			<call arg="68"/>
			<call arg="53"/>
			<call arg="69"/>
			<if arg="94"/>
			<getasm/>
			<get arg="1"/>
			<push arg="71"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="46"/>
			<pcall arg="72"/>
			<dup/>
			<push arg="73"/>
			<load arg="19"/>
			<pcall arg="74"/>
			<dup/>
			<push arg="75"/>
			<push arg="95"/>
			<push arg="77"/>
			<new/>
			<pcall arg="78"/>
			<pusht/>
			<pcall arg="79"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="96" begin="7" end="7"/>
			<lne id="97" begin="7" end="8"/>
			<lne id="98" begin="7" end="9"/>
			<lne id="99" begin="24" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="73" begin="6" end="31"/>
			<lve slot="0" name="17" begin="0" end="32"/>
		</localvariabletable>
	</operation>
	<operation name="100">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="84"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="73"/>
			<call arg="85"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="75"/>
			<call arg="86"/>
			<store arg="87"/>
			<load arg="87"/>
			<dup/>
			<getasm/>
			<push arg="101"/>
			<call arg="30"/>
			<set arg="89"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="102" begin="11" end="11"/>
			<lne id="103" begin="9" end="13"/>
			<lne id="99" begin="8" end="14"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="75" begin="7" end="14"/>
			<lve slot="2" name="73" begin="3" end="14"/>
			<lve slot="0" name="17" begin="0" end="14"/>
			<lve slot="1" name="92" begin="0" end="14"/>
		</localvariabletable>
	</operation>
</asm>
