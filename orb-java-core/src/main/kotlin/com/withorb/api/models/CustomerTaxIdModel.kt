// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

/**
 * Tax IDs are commonly required to be displayed on customer invoices, which are added to the
 * headers of invoices.
 *
 * ### Supported Tax ID Countries and Types
 * |Country             |Type        |Description                                                                                            |
 * |--------------------|------------|-------------------------------------------------------------------------------------------------------|
 * |Andorra             |`ad_nrt`    |Andorran NRT Number                                                                                    |
 * |Argentina           |`ar_cuit`   |Argentinian Tax ID Number                                                                              |
 * |Australia           |`au_abn`    |Australian Business Number (AU ABN)                                                                    |
 * |Australia           |`au_arn`    |Australian Taxation Office Reference Number                                                            |
 * |Austria             |`eu_vat`    |European VAT Number                                                                                    |
 * |Bahrain             |`bh_vat`    |Bahraini VAT Number                                                                                    |
 * |Belgium             |`eu_vat`    |European VAT Number                                                                                    |
 * |Bolivia             |`bo_tin`    |Bolivian Tax ID                                                                                        |
 * |Brazil              |`br_cnpj`   |Brazilian CNPJ Number                                                                                  |
 * |Brazil              |`br_cpf`    |Brazilian CPF Number                                                                                   |
 * |Bulgaria            |`bg_uic`    |Bulgaria Unified Identification Code                                                                   |
 * |Bulgaria            |`eu_vat`    |European VAT Number                                                                                    |
 * |Canada              |`ca_bn`     |Canadian BN                                                                                            |
 * |Canada              |`ca_gst_hst`|Canadian GST/HST Number                                                                                |
 * |Canada              |`ca_pst_bc` |Canadian PST Number (British Columbia)                                                                 |
 * |Canada              |`ca_pst_mb` |Canadian PST Number (Manitoba)                                                                         |
 * |Canada              |`ca_pst_sk` |Canadian PST Number (Saskatchewan)                                                                     |
 * |Canada              |`ca_qst`    |Canadian QST Number (Québec)                                                                           |
 * |Chile               |`cl_tin`    |Chilean TIN                                                                                            |
 * |China               |`cn_tin`    |Chinese Tax ID                                                                                         |
 * |Colombia            |`co_nit`    |Colombian NIT Number                                                                                   |
 * |Costa Rica          |`cr_tin`    |Costa Rican Tax ID                                                                                     |
 * |Croatia             |`eu_vat`    |European VAT Number                                                                                    |
 * |Cyprus              |`eu_vat`    |European VAT Number                                                                                    |
 * |Czech Republic      |`eu_vat`    |European VAT Number                                                                                    |
 * |Denmark             |`eu_vat`    |European VAT Number                                                                                    |
 * |Dominican Republic  |`do_rcn`    |Dominican RCN Number                                                                                   |
 * |Ecuador             |`ec_ruc`    |Ecuadorian RUC Number                                                                                  |
 * |Egypt               |`eg_tin`    |Egyptian Tax Identification Number                                                                     |
 * |El Salvador         |`sv_nit`    |El Salvadorian NIT Number                                                                              |
 * |Estonia             |`eu_vat`    |European VAT Number                                                                                    |
 * |EU                  |`eu_oss_vat`|European One Stop Shop VAT Number for non-Union scheme                                                 |
 * |Finland             |`eu_vat`    |European VAT Number                                                                                    |
 * |France              |`eu_vat`    |European VAT Number                                                                                    |
 * |Georgia             |`ge_vat`    |Georgian VAT                                                                                           |
 * |Germany             |`eu_vat`    |European VAT Number                                                                                    |
 * |Greece              |`eu_vat`    |European VAT Number                                                                                    |
 * |Hong Kong           |`hk_br`     |Hong Kong BR Number                                                                                    |
 * |Hungary             |`eu_vat`    |European VAT Number                                                                                    |
 * |Hungary             |`hu_tin`    |Hungary Tax Number (adószám)                                                                           |
 * |Iceland             |`is_vat`    |Icelandic VAT                                                                                          |
 * |India               |`in_gst`    |Indian GST Number                                                                                      |
 * |Indonesia           |`id_npwp`   |Indonesian NPWP Number                                                                                 |
 * |Ireland             |`eu_vat`    |European VAT Number                                                                                    |
 * |Israel              |`il_vat`    |Israel VAT                                                                                             |
 * |Italy               |`eu_vat`    |European VAT Number                                                                                    |
 * |Japan               |`jp_cn`     |Japanese Corporate Number (_Hōjin Bangō_)                                                              |
 * |Japan               |`jp_rn`     |Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_)|
 * |Japan               |`jp_trn`    |Japanese Tax Registration Number (_Tōroku Bangō_)                                                      |
 * |Kazakhstan          |`kz_bin`    |Kazakhstani Business Identification Number                                                             |
 * |Kenya               |`ke_pin`    |Kenya Revenue Authority Personal Identification Number                                                 |
 * |Latvia              |`eu_vat`    |European VAT Number                                                                                    |
 * |Liechtenstein       |`li_uid`    |Liechtensteinian UID Number                                                                            |
 * |Lithuania           |`eu_vat`    |European VAT Number                                                                                    |
 * |Luxembourg          |`eu_vat`    |European VAT Number                                                                                    |
 * |Malaysia            |`my_frp`    |Malaysian FRP Number                                                                                   |
 * |Malaysia            |`my_itn`    |Malaysian ITN                                                                                          |
 * |Malaysia            |`my_sst`    |Malaysian SST Number                                                                                   |
 * |Malta               |`eu_vat `   |European VAT Number                                                                                    |
 * |Mexico              |`mx_rfc`    |Mexican RFC Number                                                                                     |
 * |Netherlands         |`eu_vat`    |European VAT Number                                                                                    |
 * |New Zealand         |`nz_gst`    |New Zealand GST Number                                                                                 |
 * |Nigeria             |`ng_tin`    |Nigerian Tax Identification Number                                                                     |
 * |Norway              |`no_vat`    |Norwegian VAT Number                                                                                   |
 * |Norway              |`no_voec`   |Norwegian VAT on e-commerce Number                                                                     |
 * |Oman                |`om_vat`    |Omani VAT Number                                                                                       |
 * |Peru                |`pe_ruc`    |Peruvian RUC Number                                                                                    |
 * |Philippines         |`ph_tin `   |Philippines Tax Identification Number                                                                  |
 * |Poland              |`eu_vat`    |European VAT Number                                                                                    |
 * |Portugal            |`eu_vat`    |European VAT Number                                                                                    |
 * |Romania             |`eu_vat`    |European VAT Number                                                                                    |
 * |Romania             |`ro_tin`    |Romanian Tax ID Number                                                                                 |
 * |Russia              |`ru_inn`    |Russian INN                                                                                            |
 * |Russia              |`ru_kpp`    |Russian KPP                                                                                            |
 * |Saudi Arabia        |`sa_vat`    |Saudi Arabia VAT                                                                                       |
 * |Serbia              |`rs_pib`    |Serbian PIB Number                                                                                     |
 * |Singapore           |`sg_gst`    |Singaporean GST                                                                                        |
 * |Singapore           |`sg_uen`    |Singaporean UEN                                                                                        |
 * |Slovakia            |`eu_vat`    |European VAT Number                                                                                    |
 * |Slovenia            |`eu_vat`    |European VAT Number                                                                                    |
 * |Slovenia            |`si_tin`    |Slovenia Tax Number (davčna številka)                                                                  |
 * |South Africa        |`za_vat`    |South African VAT Number                                                                               |
 * |South Korea         |`kr_brn`    |Korean BRN                                                                                             |
 * |Spain               |`es_cif`    |Spanish NIF Number (previously Spanish CIF Number)                                                     |
 * |Spain               |`eu_vat`    |European VAT Number                                                                                    |
 * |Sweden              |`eu_vat`    |European VAT Number                                                                                    |
 * |Switzerland         |`ch_vat`    |Switzerland VAT Number                                                                                 |
 * |Taiwan              |`tw_vat`    |Taiwanese VAT                                                                                          |
 * |Thailand            |`th_vat`    |Thai VAT                                                                                               |
 * |Turkey              |`tr_tin`    |Turkish Tax Identification Number                                                                      |
 * |Ukraine             |`ua_vat`    |Ukrainian VAT                                                                                          |
 * |United Arab Emirates|`ae_trn`    |United Arab Emirates TRN                                                                               |
 * |United Kingdom      |`eu_vat`    |Northern Ireland VAT Number                                                                            |
 * |United Kingdom      |`gb_vat`    |United Kingdom VAT Number                                                                              |
 * |United States       |`us_ein`    |United States EIN                                                                                      |
 * |Uruguay             |`uy_ruc`    |Uruguayan RUC Number                                                                                   |
 * |Venezuela           |`ve_rif`    |Venezuelan RIF Number                                                                                  |
 * |Vietnam             |`vn_tin`    |Vietnamese Tax ID Number                                                                               |
 */
@NoAutoDetect
class CustomerTaxIdModel
@JsonCreator
private constructor(
    @JsonProperty("country")
    @ExcludeMissing
    private val country: JsonField<Country> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("value") @ExcludeMissing private val value: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun country(): Country = country.getRequired("country")

    fun type(): Type = type.getRequired("type")

    fun value(): String = value.getRequired("value")

    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<Country> = country

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerTaxIdModel = apply {
        if (validated) {
            return@apply
        }

        country()
        type()
        value()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerTaxIdModel].
         *
         * The following fields are required:
         * ```java
         * .country()
         * .type()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerTaxIdModel]. */
    class Builder internal constructor() {

        private var country: JsonField<Country>? = null
        private var type: JsonField<Type>? = null
        private var value: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerTaxIdModel: CustomerTaxIdModel) = apply {
            country = customerTaxIdModel.country
            type = customerTaxIdModel.type
            value = customerTaxIdModel.value
            additionalProperties = customerTaxIdModel.additionalProperties.toMutableMap()
        }

        fun country(country: Country) = country(JsonField.of(country))

        fun country(country: JsonField<Country>) = apply { this.country = country }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun value(value: String) = value(JsonField.of(value))

        fun value(value: JsonField<String>) = apply { this.value = value }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): CustomerTaxIdModel =
            CustomerTaxIdModel(
                checkRequired("country", country),
                checkRequired("type", type),
                checkRequired("value", value),
                additionalProperties.toImmutable(),
            )
    }

    class Country @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AD = of("AD")

            @JvmField val AE = of("AE")

            @JvmField val AR = of("AR")

            @JvmField val AT = of("AT")

            @JvmField val AU = of("AU")

            @JvmField val BE = of("BE")

            @JvmField val BG = of("BG")

            @JvmField val BH = of("BH")

            @JvmField val BO = of("BO")

            @JvmField val BR = of("BR")

            @JvmField val CA = of("CA")

            @JvmField val CH = of("CH")

            @JvmField val CL = of("CL")

            @JvmField val CN = of("CN")

            @JvmField val CO = of("CO")

            @JvmField val CR = of("CR")

            @JvmField val CY = of("CY")

            @JvmField val CZ = of("CZ")

            @JvmField val DE = of("DE")

            @JvmField val DK = of("DK")

            @JvmField val EE = of("EE")

            @JvmField val DO = of("DO")

            @JvmField val EC = of("EC")

            @JvmField val EG = of("EG")

            @JvmField val ES = of("ES")

            @JvmField val EU = of("EU")

            @JvmField val FI = of("FI")

            @JvmField val FR = of("FR")

            @JvmField val GB = of("GB")

            @JvmField val GE = of("GE")

            @JvmField val GR = of("GR")

            @JvmField val HK = of("HK")

            @JvmField val HR = of("HR")

            @JvmField val HU = of("HU")

            @JvmField val ID = of("ID")

            @JvmField val IE = of("IE")

            @JvmField val IL = of("IL")

            @JvmField val IN = of("IN")

            @JvmField val IS = of("IS")

            @JvmField val IT = of("IT")

            @JvmField val JP = of("JP")

            @JvmField val KE = of("KE")

            @JvmField val KR = of("KR")

            @JvmField val KZ = of("KZ")

            @JvmField val LI = of("LI")

            @JvmField val LT = of("LT")

            @JvmField val LU = of("LU")

            @JvmField val LV = of("LV")

            @JvmField val MT = of("MT")

            @JvmField val MX = of("MX")

            @JvmField val MY = of("MY")

            @JvmField val NG = of("NG")

            @JvmField val NL = of("NL")

            @JvmField val NO = of("NO")

            @JvmField val NZ = of("NZ")

            @JvmField val OM = of("OM")

            @JvmField val PE = of("PE")

            @JvmField val PH = of("PH")

            @JvmField val PL = of("PL")

            @JvmField val PT = of("PT")

            @JvmField val RO = of("RO")

            @JvmField val RS = of("RS")

            @JvmField val RU = of("RU")

            @JvmField val SA = of("SA")

            @JvmField val SE = of("SE")

            @JvmField val SG = of("SG")

            @JvmField val SI = of("SI")

            @JvmField val SK = of("SK")

            @JvmField val SV = of("SV")

            @JvmField val TH = of("TH")

            @JvmField val TR = of("TR")

            @JvmField val TW = of("TW")

            @JvmField val UA = of("UA")

            @JvmField val US = of("US")

            @JvmField val UY = of("UY")

            @JvmField val VE = of("VE")

            @JvmField val VN = of("VN")

            @JvmField val ZA = of("ZA")

            @JvmStatic fun of(value: String) = Country(JsonField.of(value))
        }

        /** An enum containing [Country]'s known values. */
        enum class Known {
            AD,
            AE,
            AR,
            AT,
            AU,
            BE,
            BG,
            BH,
            BO,
            BR,
            CA,
            CH,
            CL,
            CN,
            CO,
            CR,
            CY,
            CZ,
            DE,
            DK,
            EE,
            DO,
            EC,
            EG,
            ES,
            EU,
            FI,
            FR,
            GB,
            GE,
            GR,
            HK,
            HR,
            HU,
            ID,
            IE,
            IL,
            IN,
            IS,
            IT,
            JP,
            KE,
            KR,
            KZ,
            LI,
            LT,
            LU,
            LV,
            MT,
            MX,
            MY,
            NG,
            NL,
            NO,
            NZ,
            OM,
            PE,
            PH,
            PL,
            PT,
            RO,
            RS,
            RU,
            SA,
            SE,
            SG,
            SI,
            SK,
            SV,
            TH,
            TR,
            TW,
            UA,
            US,
            UY,
            VE,
            VN,
            ZA,
        }

        /**
         * An enum containing [Country]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Country] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AD,
            AE,
            AR,
            AT,
            AU,
            BE,
            BG,
            BH,
            BO,
            BR,
            CA,
            CH,
            CL,
            CN,
            CO,
            CR,
            CY,
            CZ,
            DE,
            DK,
            EE,
            DO,
            EC,
            EG,
            ES,
            EU,
            FI,
            FR,
            GB,
            GE,
            GR,
            HK,
            HR,
            HU,
            ID,
            IE,
            IL,
            IN,
            IS,
            IT,
            JP,
            KE,
            KR,
            KZ,
            LI,
            LT,
            LU,
            LV,
            MT,
            MX,
            MY,
            NG,
            NL,
            NO,
            NZ,
            OM,
            PE,
            PH,
            PL,
            PT,
            RO,
            RS,
            RU,
            SA,
            SE,
            SG,
            SI,
            SK,
            SV,
            TH,
            TR,
            TW,
            UA,
            US,
            UY,
            VE,
            VN,
            ZA,
            /** An enum member indicating that [Country] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AD -> Value.AD
                AE -> Value.AE
                AR -> Value.AR
                AT -> Value.AT
                AU -> Value.AU
                BE -> Value.BE
                BG -> Value.BG
                BH -> Value.BH
                BO -> Value.BO
                BR -> Value.BR
                CA -> Value.CA
                CH -> Value.CH
                CL -> Value.CL
                CN -> Value.CN
                CO -> Value.CO
                CR -> Value.CR
                CY -> Value.CY
                CZ -> Value.CZ
                DE -> Value.DE
                DK -> Value.DK
                EE -> Value.EE
                DO -> Value.DO
                EC -> Value.EC
                EG -> Value.EG
                ES -> Value.ES
                EU -> Value.EU
                FI -> Value.FI
                FR -> Value.FR
                GB -> Value.GB
                GE -> Value.GE
                GR -> Value.GR
                HK -> Value.HK
                HR -> Value.HR
                HU -> Value.HU
                ID -> Value.ID
                IE -> Value.IE
                IL -> Value.IL
                IN -> Value.IN
                IS -> Value.IS
                IT -> Value.IT
                JP -> Value.JP
                KE -> Value.KE
                KR -> Value.KR
                KZ -> Value.KZ
                LI -> Value.LI
                LT -> Value.LT
                LU -> Value.LU
                LV -> Value.LV
                MT -> Value.MT
                MX -> Value.MX
                MY -> Value.MY
                NG -> Value.NG
                NL -> Value.NL
                NO -> Value.NO
                NZ -> Value.NZ
                OM -> Value.OM
                PE -> Value.PE
                PH -> Value.PH
                PL -> Value.PL
                PT -> Value.PT
                RO -> Value.RO
                RS -> Value.RS
                RU -> Value.RU
                SA -> Value.SA
                SE -> Value.SE
                SG -> Value.SG
                SI -> Value.SI
                SK -> Value.SK
                SV -> Value.SV
                TH -> Value.TH
                TR -> Value.TR
                TW -> Value.TW
                UA -> Value.UA
                US -> Value.US
                UY -> Value.UY
                VE -> Value.VE
                VN -> Value.VN
                ZA -> Value.ZA
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                AD -> Known.AD
                AE -> Known.AE
                AR -> Known.AR
                AT -> Known.AT
                AU -> Known.AU
                BE -> Known.BE
                BG -> Known.BG
                BH -> Known.BH
                BO -> Known.BO
                BR -> Known.BR
                CA -> Known.CA
                CH -> Known.CH
                CL -> Known.CL
                CN -> Known.CN
                CO -> Known.CO
                CR -> Known.CR
                CY -> Known.CY
                CZ -> Known.CZ
                DE -> Known.DE
                DK -> Known.DK
                EE -> Known.EE
                DO -> Known.DO
                EC -> Known.EC
                EG -> Known.EG
                ES -> Known.ES
                EU -> Known.EU
                FI -> Known.FI
                FR -> Known.FR
                GB -> Known.GB
                GE -> Known.GE
                GR -> Known.GR
                HK -> Known.HK
                HR -> Known.HR
                HU -> Known.HU
                ID -> Known.ID
                IE -> Known.IE
                IL -> Known.IL
                IN -> Known.IN
                IS -> Known.IS
                IT -> Known.IT
                JP -> Known.JP
                KE -> Known.KE
                KR -> Known.KR
                KZ -> Known.KZ
                LI -> Known.LI
                LT -> Known.LT
                LU -> Known.LU
                LV -> Known.LV
                MT -> Known.MT
                MX -> Known.MX
                MY -> Known.MY
                NG -> Known.NG
                NL -> Known.NL
                NO -> Known.NO
                NZ -> Known.NZ
                OM -> Known.OM
                PE -> Known.PE
                PH -> Known.PH
                PL -> Known.PL
                PT -> Known.PT
                RO -> Known.RO
                RS -> Known.RS
                RU -> Known.RU
                SA -> Known.SA
                SE -> Known.SE
                SG -> Known.SG
                SI -> Known.SI
                SK -> Known.SK
                SV -> Known.SV
                TH -> Known.TH
                TR -> Known.TR
                TW -> Known.TW
                UA -> Known.UA
                US -> Known.US
                UY -> Known.UY
                VE -> Known.VE
                VN -> Known.VN
                ZA -> Known.ZA
                else -> throw OrbInvalidDataException("Unknown Country: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { OrbInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Country && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AD_NRT = of("ad_nrt")

            @JvmField val AE_TRN = of("ae_trn")

            @JvmField val AR_CUIT = of("ar_cuit")

            @JvmField val EU_VAT = of("eu_vat")

            @JvmField val AU_ABN = of("au_abn")

            @JvmField val AU_ARN = of("au_arn")

            @JvmField val BG_UIC = of("bg_uic")

            @JvmField val BH_VAT = of("bh_vat")

            @JvmField val BO_TIN = of("bo_tin")

            @JvmField val BR_CNPJ = of("br_cnpj")

            @JvmField val BR_CPF = of("br_cpf")

            @JvmField val CA_BN = of("ca_bn")

            @JvmField val CA_GST_HST = of("ca_gst_hst")

            @JvmField val CA_PST_BC = of("ca_pst_bc")

            @JvmField val CA_PST_MB = of("ca_pst_mb")

            @JvmField val CA_PST_SK = of("ca_pst_sk")

            @JvmField val CA_QST = of("ca_qst")

            @JvmField val CH_VAT = of("ch_vat")

            @JvmField val CL_TIN = of("cl_tin")

            @JvmField val CN_TIN = of("cn_tin")

            @JvmField val CO_NIT = of("co_nit")

            @JvmField val CR_TIN = of("cr_tin")

            @JvmField val DO_RCN = of("do_rcn")

            @JvmField val EC_RUC = of("ec_ruc")

            @JvmField val EG_TIN = of("eg_tin")

            @JvmField val ES_CIF = of("es_cif")

            @JvmField val EU_OSS_VAT = of("eu_oss_vat")

            @JvmField val GB_VAT = of("gb_vat")

            @JvmField val GE_VAT = of("ge_vat")

            @JvmField val HK_BR = of("hk_br")

            @JvmField val HU_TIN = of("hu_tin")

            @JvmField val ID_NPWP = of("id_npwp")

            @JvmField val IL_VAT = of("il_vat")

            @JvmField val IN_GST = of("in_gst")

            @JvmField val IS_VAT = of("is_vat")

            @JvmField val JP_CN = of("jp_cn")

            @JvmField val JP_RN = of("jp_rn")

            @JvmField val JP_TRN = of("jp_trn")

            @JvmField val KE_PIN = of("ke_pin")

            @JvmField val KR_BRN = of("kr_brn")

            @JvmField val KZ_BIN = of("kz_bin")

            @JvmField val LI_UID = of("li_uid")

            @JvmField val MX_RFC = of("mx_rfc")

            @JvmField val MY_FRP = of("my_frp")

            @JvmField val MY_ITN = of("my_itn")

            @JvmField val MY_SST = of("my_sst")

            @JvmField val NG_TIN = of("ng_tin")

            @JvmField val NO_VAT = of("no_vat")

            @JvmField val NO_VOEC = of("no_voec")

            @JvmField val NZ_GST = of("nz_gst")

            @JvmField val OM_VAT = of("om_vat")

            @JvmField val PE_RUC = of("pe_ruc")

            @JvmField val PH_TIN = of("ph_tin")

            @JvmField val RO_TIN = of("ro_tin")

            @JvmField val RS_PIB = of("rs_pib")

            @JvmField val RU_INN = of("ru_inn")

            @JvmField val RU_KPP = of("ru_kpp")

            @JvmField val SA_VAT = of("sa_vat")

            @JvmField val SG_GST = of("sg_gst")

            @JvmField val SG_UEN = of("sg_uen")

            @JvmField val SI_TIN = of("si_tin")

            @JvmField val SV_NIT = of("sv_nit")

            @JvmField val TH_VAT = of("th_vat")

            @JvmField val TR_TIN = of("tr_tin")

            @JvmField val TW_VAT = of("tw_vat")

            @JvmField val UA_VAT = of("ua_vat")

            @JvmField val US_EIN = of("us_ein")

            @JvmField val UY_RUC = of("uy_ruc")

            @JvmField val VE_RIF = of("ve_rif")

            @JvmField val VN_TIN = of("vn_tin")

            @JvmField val ZA_VAT = of("za_vat")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            AD_NRT,
            AE_TRN,
            AR_CUIT,
            EU_VAT,
            AU_ABN,
            AU_ARN,
            BG_UIC,
            BH_VAT,
            BO_TIN,
            BR_CNPJ,
            BR_CPF,
            CA_BN,
            CA_GST_HST,
            CA_PST_BC,
            CA_PST_MB,
            CA_PST_SK,
            CA_QST,
            CH_VAT,
            CL_TIN,
            CN_TIN,
            CO_NIT,
            CR_TIN,
            DO_RCN,
            EC_RUC,
            EG_TIN,
            ES_CIF,
            EU_OSS_VAT,
            GB_VAT,
            GE_VAT,
            HK_BR,
            HU_TIN,
            ID_NPWP,
            IL_VAT,
            IN_GST,
            IS_VAT,
            JP_CN,
            JP_RN,
            JP_TRN,
            KE_PIN,
            KR_BRN,
            KZ_BIN,
            LI_UID,
            MX_RFC,
            MY_FRP,
            MY_ITN,
            MY_SST,
            NG_TIN,
            NO_VAT,
            NO_VOEC,
            NZ_GST,
            OM_VAT,
            PE_RUC,
            PH_TIN,
            RO_TIN,
            RS_PIB,
            RU_INN,
            RU_KPP,
            SA_VAT,
            SG_GST,
            SG_UEN,
            SI_TIN,
            SV_NIT,
            TH_VAT,
            TR_TIN,
            TW_VAT,
            UA_VAT,
            US_EIN,
            UY_RUC,
            VE_RIF,
            VN_TIN,
            ZA_VAT,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AD_NRT,
            AE_TRN,
            AR_CUIT,
            EU_VAT,
            AU_ABN,
            AU_ARN,
            BG_UIC,
            BH_VAT,
            BO_TIN,
            BR_CNPJ,
            BR_CPF,
            CA_BN,
            CA_GST_HST,
            CA_PST_BC,
            CA_PST_MB,
            CA_PST_SK,
            CA_QST,
            CH_VAT,
            CL_TIN,
            CN_TIN,
            CO_NIT,
            CR_TIN,
            DO_RCN,
            EC_RUC,
            EG_TIN,
            ES_CIF,
            EU_OSS_VAT,
            GB_VAT,
            GE_VAT,
            HK_BR,
            HU_TIN,
            ID_NPWP,
            IL_VAT,
            IN_GST,
            IS_VAT,
            JP_CN,
            JP_RN,
            JP_TRN,
            KE_PIN,
            KR_BRN,
            KZ_BIN,
            LI_UID,
            MX_RFC,
            MY_FRP,
            MY_ITN,
            MY_SST,
            NG_TIN,
            NO_VAT,
            NO_VOEC,
            NZ_GST,
            OM_VAT,
            PE_RUC,
            PH_TIN,
            RO_TIN,
            RS_PIB,
            RU_INN,
            RU_KPP,
            SA_VAT,
            SG_GST,
            SG_UEN,
            SI_TIN,
            SV_NIT,
            TH_VAT,
            TR_TIN,
            TW_VAT,
            UA_VAT,
            US_EIN,
            UY_RUC,
            VE_RIF,
            VN_TIN,
            ZA_VAT,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AD_NRT -> Value.AD_NRT
                AE_TRN -> Value.AE_TRN
                AR_CUIT -> Value.AR_CUIT
                EU_VAT -> Value.EU_VAT
                AU_ABN -> Value.AU_ABN
                AU_ARN -> Value.AU_ARN
                BG_UIC -> Value.BG_UIC
                BH_VAT -> Value.BH_VAT
                BO_TIN -> Value.BO_TIN
                BR_CNPJ -> Value.BR_CNPJ
                BR_CPF -> Value.BR_CPF
                CA_BN -> Value.CA_BN
                CA_GST_HST -> Value.CA_GST_HST
                CA_PST_BC -> Value.CA_PST_BC
                CA_PST_MB -> Value.CA_PST_MB
                CA_PST_SK -> Value.CA_PST_SK
                CA_QST -> Value.CA_QST
                CH_VAT -> Value.CH_VAT
                CL_TIN -> Value.CL_TIN
                CN_TIN -> Value.CN_TIN
                CO_NIT -> Value.CO_NIT
                CR_TIN -> Value.CR_TIN
                DO_RCN -> Value.DO_RCN
                EC_RUC -> Value.EC_RUC
                EG_TIN -> Value.EG_TIN
                ES_CIF -> Value.ES_CIF
                EU_OSS_VAT -> Value.EU_OSS_VAT
                GB_VAT -> Value.GB_VAT
                GE_VAT -> Value.GE_VAT
                HK_BR -> Value.HK_BR
                HU_TIN -> Value.HU_TIN
                ID_NPWP -> Value.ID_NPWP
                IL_VAT -> Value.IL_VAT
                IN_GST -> Value.IN_GST
                IS_VAT -> Value.IS_VAT
                JP_CN -> Value.JP_CN
                JP_RN -> Value.JP_RN
                JP_TRN -> Value.JP_TRN
                KE_PIN -> Value.KE_PIN
                KR_BRN -> Value.KR_BRN
                KZ_BIN -> Value.KZ_BIN
                LI_UID -> Value.LI_UID
                MX_RFC -> Value.MX_RFC
                MY_FRP -> Value.MY_FRP
                MY_ITN -> Value.MY_ITN
                MY_SST -> Value.MY_SST
                NG_TIN -> Value.NG_TIN
                NO_VAT -> Value.NO_VAT
                NO_VOEC -> Value.NO_VOEC
                NZ_GST -> Value.NZ_GST
                OM_VAT -> Value.OM_VAT
                PE_RUC -> Value.PE_RUC
                PH_TIN -> Value.PH_TIN
                RO_TIN -> Value.RO_TIN
                RS_PIB -> Value.RS_PIB
                RU_INN -> Value.RU_INN
                RU_KPP -> Value.RU_KPP
                SA_VAT -> Value.SA_VAT
                SG_GST -> Value.SG_GST
                SG_UEN -> Value.SG_UEN
                SI_TIN -> Value.SI_TIN
                SV_NIT -> Value.SV_NIT
                TH_VAT -> Value.TH_VAT
                TR_TIN -> Value.TR_TIN
                TW_VAT -> Value.TW_VAT
                UA_VAT -> Value.UA_VAT
                US_EIN -> Value.US_EIN
                UY_RUC -> Value.UY_RUC
                VE_RIF -> Value.VE_RIF
                VN_TIN -> Value.VN_TIN
                ZA_VAT -> Value.ZA_VAT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                AD_NRT -> Known.AD_NRT
                AE_TRN -> Known.AE_TRN
                AR_CUIT -> Known.AR_CUIT
                EU_VAT -> Known.EU_VAT
                AU_ABN -> Known.AU_ABN
                AU_ARN -> Known.AU_ARN
                BG_UIC -> Known.BG_UIC
                BH_VAT -> Known.BH_VAT
                BO_TIN -> Known.BO_TIN
                BR_CNPJ -> Known.BR_CNPJ
                BR_CPF -> Known.BR_CPF
                CA_BN -> Known.CA_BN
                CA_GST_HST -> Known.CA_GST_HST
                CA_PST_BC -> Known.CA_PST_BC
                CA_PST_MB -> Known.CA_PST_MB
                CA_PST_SK -> Known.CA_PST_SK
                CA_QST -> Known.CA_QST
                CH_VAT -> Known.CH_VAT
                CL_TIN -> Known.CL_TIN
                CN_TIN -> Known.CN_TIN
                CO_NIT -> Known.CO_NIT
                CR_TIN -> Known.CR_TIN
                DO_RCN -> Known.DO_RCN
                EC_RUC -> Known.EC_RUC
                EG_TIN -> Known.EG_TIN
                ES_CIF -> Known.ES_CIF
                EU_OSS_VAT -> Known.EU_OSS_VAT
                GB_VAT -> Known.GB_VAT
                GE_VAT -> Known.GE_VAT
                HK_BR -> Known.HK_BR
                HU_TIN -> Known.HU_TIN
                ID_NPWP -> Known.ID_NPWP
                IL_VAT -> Known.IL_VAT
                IN_GST -> Known.IN_GST
                IS_VAT -> Known.IS_VAT
                JP_CN -> Known.JP_CN
                JP_RN -> Known.JP_RN
                JP_TRN -> Known.JP_TRN
                KE_PIN -> Known.KE_PIN
                KR_BRN -> Known.KR_BRN
                KZ_BIN -> Known.KZ_BIN
                LI_UID -> Known.LI_UID
                MX_RFC -> Known.MX_RFC
                MY_FRP -> Known.MY_FRP
                MY_ITN -> Known.MY_ITN
                MY_SST -> Known.MY_SST
                NG_TIN -> Known.NG_TIN
                NO_VAT -> Known.NO_VAT
                NO_VOEC -> Known.NO_VOEC
                NZ_GST -> Known.NZ_GST
                OM_VAT -> Known.OM_VAT
                PE_RUC -> Known.PE_RUC
                PH_TIN -> Known.PH_TIN
                RO_TIN -> Known.RO_TIN
                RS_PIB -> Known.RS_PIB
                RU_INN -> Known.RU_INN
                RU_KPP -> Known.RU_KPP
                SA_VAT -> Known.SA_VAT
                SG_GST -> Known.SG_GST
                SG_UEN -> Known.SG_UEN
                SI_TIN -> Known.SI_TIN
                SV_NIT -> Known.SV_NIT
                TH_VAT -> Known.TH_VAT
                TR_TIN -> Known.TR_TIN
                TW_VAT -> Known.TW_VAT
                UA_VAT -> Known.UA_VAT
                US_EIN -> Known.US_EIN
                UY_RUC -> Known.UY_RUC
                VE_RIF -> Known.VE_RIF
                VN_TIN -> Known.VN_TIN
                ZA_VAT -> Known.ZA_VAT
                else -> throw OrbInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { OrbInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerTaxIdModel && country == other.country && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(country, type, value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerTaxIdModel{country=$country, type=$type, value=$value, additionalProperties=$additionalProperties}"
}
