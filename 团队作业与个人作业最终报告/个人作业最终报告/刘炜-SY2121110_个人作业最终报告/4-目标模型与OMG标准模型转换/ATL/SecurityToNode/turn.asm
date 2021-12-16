<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="UafToLamda"/>
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
		<constant value="A.__matchwbe2Document():V"/>
		<constant value="__exec__"/>
		<constant value="wbe2Document"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applywbe2Document(NTransientLink;):V"/>
		<constant value="__matchwbe2Document"/>
		<constant value="SecuritySource"/>
		<constant value="s"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="SecurityTest"/>
		<constant value="SecuritySafe"/>
		<constant value="3"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="rp"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="ra"/>
		<constant value="sn"/>
		<constant value="dc"/>
		<constant value="Node"/>
		<constant value="d"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="14:3-23:4"/>
		<constant value="__applywbe2Document"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="4"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="5"/>
		<constant value="NodeName"/>
		<constant value="J.rp2ag(J):J"/>
		<constant value="agentname"/>
		<constant value="J.ra2sn(J):J"/>
		<constant value="safenode"/>
		<constant value="J.sn2fn(J):J"/>
		<constant value="filenode"/>
		<constant value="rolenode"/>
		<constant value="exchangenode"/>
		<constant value="resourcenode"/>
		<constant value="operationnode"/>
		<constant value="15:16-15:18"/>
		<constant value="15:16-15:23"/>
		<constant value="15:4-15:23"/>
		<constant value="16:17-16:27"/>
		<constant value="16:34-16:36"/>
		<constant value="16:17-16:37"/>
		<constant value="16:4-16:37"/>
		<constant value="17:16-17:26"/>
		<constant value="17:33-17:35"/>
		<constant value="17:16-17:36"/>
		<constant value="17:4-17:36"/>
		<constant value="18:16-18:26"/>
		<constant value="18:33-18:35"/>
		<constant value="18:16-18:36"/>
		<constant value="18:4-18:36"/>
		<constant value="19:16-19:26"/>
		<constant value="19:33-19:35"/>
		<constant value="19:16-19:36"/>
		<constant value="19:4-19:36"/>
		<constant value="20:20-20:30"/>
		<constant value="20:37-20:39"/>
		<constant value="20:20-20:40"/>
		<constant value="20:4-20:40"/>
		<constant value="21:20-21:30"/>
		<constant value="21:37-21:39"/>
		<constant value="21:20-21:40"/>
		<constant value="21:4-21:40"/>
		<constant value="22:21-22:31"/>
		<constant value="22:38-22:40"/>
		<constant value="22:21-22:41"/>
		<constant value="22:4-22:41"/>
		<constant value="link"/>
		<constant value="rp2ag"/>
		<constant value="Ms!SecuritySource;"/>
		<constant value="ag"/>
		<constant value="AgentName"/>
		<constant value="agent"/>
		<constant value="31:13-31:15"/>
		<constant value="31:13-31:20"/>
		<constant value="31:4-31:20"/>
		<constant value="30:3-32:4"/>
		<constant value="ra2sn"/>
		<constant value="Ms!SecurityTest;"/>
		<constant value="SafeNode"/>
		<constant value="testname"/>
		<constant value="safe"/>
		<constant value="40:12-40:14"/>
		<constant value="40:12-40:23"/>
		<constant value="40:4-40:23"/>
		<constant value="39:3-41:4"/>
		<constant value="sn2fn"/>
		<constant value="Ms!SecuritySafe;"/>
		<constant value="FileNode"/>
		<constant value="saname"/>
		<constant value="file"/>
		<constant value="49:12-49:14"/>
		<constant value="49:12-49:21"/>
		<constant value="49:4-49:21"/>
		<constant value="48:3-50:4"/>
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
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="1"/>
		</localvariabletable>
	</operation>
	<operation name="41">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="42"/>
			<call arg="43"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="44"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="0" name="17" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="45">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="46"/>
			<push arg="47"/>
			<findme/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="19"/>
			<push arg="50"/>
			<push arg="47"/>
			<findme/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="29"/>
			<push arg="51"/>
			<push arg="47"/>
			<findme/>
			<push arg="48"/>
			<call arg="49"/>
			<iterate/>
			<store arg="52"/>
			<getasm/>
			<get arg="1"/>
			<push arg="53"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="42"/>
			<pcall arg="54"/>
			<dup/>
			<push arg="55"/>
			<load arg="19"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="57"/>
			<load arg="29"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="58"/>
			<load arg="52"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="59"/>
			<push arg="60"/>
			<push arg="61"/>
			<new/>
			<pcall arg="62"/>
			<pusht/>
			<pcall arg="63"/>
			<enditerate/>
			<enditerate/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="64" begin="41" end="46"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="55" begin="6" end="48"/>
			<lve slot="2" name="57" begin="13" end="49"/>
			<lve slot="3" name="58" begin="20" end="50"/>
			<lve slot="0" name="17" begin="0" end="51"/>
		</localvariabletable>
	</operation>
	<operation name="65">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="66"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="55"/>
			<call arg="67"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="57"/>
			<call arg="67"/>
			<store arg="52"/>
			<load arg="19"/>
			<push arg="58"/>
			<call arg="67"/>
			<store arg="68"/>
			<load arg="19"/>
			<push arg="59"/>
			<call arg="69"/>
			<store arg="70"/>
			<load arg="70"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="71"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="29"/>
			<call arg="72"/>
			<call arg="30"/>
			<set arg="73"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="52"/>
			<call arg="74"/>
			<call arg="30"/>
			<set arg="75"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="68"/>
			<call arg="76"/>
			<call arg="30"/>
			<set arg="77"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="52"/>
			<call arg="74"/>
			<call arg="30"/>
			<set arg="78"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="68"/>
			<call arg="76"/>
			<call arg="30"/>
			<set arg="79"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="52"/>
			<call arg="74"/>
			<call arg="30"/>
			<set arg="80"/>
			<dup/>
			<getasm/>
			<getasm/>
			<load arg="29"/>
			<call arg="72"/>
			<call arg="30"/>
			<set arg="81"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="82" begin="19" end="19"/>
			<lne id="83" begin="19" end="20"/>
			<lne id="84" begin="17" end="22"/>
			<lne id="85" begin="25" end="25"/>
			<lne id="86" begin="26" end="26"/>
			<lne id="87" begin="25" end="27"/>
			<lne id="88" begin="23" end="29"/>
			<lne id="89" begin="32" end="32"/>
			<lne id="90" begin="33" end="33"/>
			<lne id="91" begin="32" end="34"/>
			<lne id="92" begin="30" end="36"/>
			<lne id="93" begin="39" end="39"/>
			<lne id="94" begin="40" end="40"/>
			<lne id="95" begin="39" end="41"/>
			<lne id="96" begin="37" end="43"/>
			<lne id="97" begin="46" end="46"/>
			<lne id="98" begin="47" end="47"/>
			<lne id="99" begin="46" end="48"/>
			<lne id="100" begin="44" end="50"/>
			<lne id="101" begin="53" end="53"/>
			<lne id="102" begin="54" end="54"/>
			<lne id="103" begin="53" end="55"/>
			<lne id="104" begin="51" end="57"/>
			<lne id="105" begin="60" end="60"/>
			<lne id="106" begin="61" end="61"/>
			<lne id="107" begin="60" end="62"/>
			<lne id="108" begin="58" end="64"/>
			<lne id="109" begin="67" end="67"/>
			<lne id="110" begin="68" end="68"/>
			<lne id="111" begin="67" end="69"/>
			<lne id="112" begin="65" end="71"/>
			<lne id="64" begin="16" end="72"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="5" name="59" begin="15" end="72"/>
			<lve slot="2" name="55" begin="3" end="72"/>
			<lve slot="3" name="57" begin="7" end="72"/>
			<lve slot="4" name="58" begin="11" end="72"/>
			<lve slot="0" name="17" begin="0" end="72"/>
			<lve slot="1" name="113" begin="0" end="72"/>
		</localvariabletable>
	</operation>
	<operation name="114">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="115"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="53"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="114"/>
			<pcall arg="54"/>
			<dup/>
			<push arg="55"/>
			<load arg="19"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="116"/>
			<push arg="117"/>
			<push arg="61"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="62"/>
			<pushf/>
			<pcall arg="63"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="118"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="119" begin="25" end="25"/>
			<lne id="120" begin="25" end="26"/>
			<lne id="121" begin="23" end="28"/>
			<lne id="122" begin="22" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="116" begin="18" end="30"/>
			<lve slot="0" name="17" begin="0" end="30"/>
			<lve slot="1" name="55" begin="0" end="30"/>
		</localvariabletable>
	</operation>
	<operation name="123">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="124"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="53"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="123"/>
			<pcall arg="54"/>
			<dup/>
			<push arg="57"/>
			<load arg="19"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="75"/>
			<push arg="125"/>
			<push arg="61"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="62"/>
			<pushf/>
			<pcall arg="63"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="126"/>
			<call arg="30"/>
			<set arg="127"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="128" begin="25" end="25"/>
			<lne id="129" begin="25" end="26"/>
			<lne id="130" begin="23" end="28"/>
			<lne id="131" begin="22" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="75" begin="18" end="30"/>
			<lve slot="0" name="17" begin="0" end="30"/>
			<lve slot="1" name="57" begin="0" end="30"/>
		</localvariabletable>
	</operation>
	<operation name="132">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="133"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="53"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="132"/>
			<pcall arg="54"/>
			<dup/>
			<push arg="58"/>
			<load arg="19"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="77"/>
			<push arg="134"/>
			<push arg="61"/>
			<new/>
			<dup/>
			<store arg="29"/>
			<pcall arg="62"/>
			<pushf/>
			<pcall arg="63"/>
			<load arg="29"/>
			<dup/>
			<getasm/>
			<load arg="19"/>
			<get arg="135"/>
			<call arg="30"/>
			<set arg="136"/>
			<pop/>
			<load arg="29"/>
		</code>
		<linenumbertable>
			<lne id="137" begin="25" end="25"/>
			<lne id="138" begin="25" end="26"/>
			<lne id="139" begin="23" end="28"/>
			<lne id="140" begin="22" end="29"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="77" begin="18" end="30"/>
			<lve slot="0" name="17" begin="0" end="30"/>
			<lve slot="1" name="58" begin="0" end="30"/>
		</localvariabletable>
	</operation>
</asm>
