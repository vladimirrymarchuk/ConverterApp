package com.example.currencies.api.utils

import com.example.currencies.api.models.ConversionRatesDTO
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.decodeStructure


internal object ConversionRatesDTOSerializer : KSerializer<ConversionRatesDTO> {
    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("ConversionRatesDTO")

    override fun serialize(encoder: Encoder, value: ConversionRatesDTO) {
        val composite = encoder.beginStructure(descriptor)
        var index = 0
        composite.encodeDoubleElement(descriptor, index++, value.usd)
        composite.encodeDoubleElement(descriptor, index++, value.aed)
        composite.encodeDoubleElement(descriptor, index++, value.afn)
        composite.encodeDoubleElement(descriptor, index++, value.all)
        composite.encodeDoubleElement(descriptor, index++, value.amd)
        composite.encodeDoubleElement(descriptor, index++, value.ang)
        composite.encodeDoubleElement(descriptor, index++, value.aoa)
        composite.encodeDoubleElement(descriptor, index++, value.ars)
        composite.encodeDoubleElement(descriptor, index++, value.aud)
        composite.encodeDoubleElement(descriptor, index++, value.awg)
        composite.encodeDoubleElement(descriptor, index++, value.azn)
        composite.encodeDoubleElement(descriptor, index++, value.bam)
        composite.encodeDoubleElement(descriptor, index++, value.bbd)
        composite.encodeDoubleElement(descriptor, index++, value.bdt)
        composite.encodeDoubleElement(descriptor, index++, value.bgn)
        composite.encodeDoubleElement(descriptor, index++, value.bhd)
        composite.encodeDoubleElement(descriptor, index++, value.bif)
        composite.encodeDoubleElement(descriptor, index++, value.bmd)
        composite.encodeDoubleElement(descriptor, index++, value.bnd)
        composite.encodeDoubleElement(descriptor, index++, value.bob)
        composite.encodeDoubleElement(descriptor, index++, value.brl)
        composite.encodeDoubleElement(descriptor, index++, value.bsd)
        composite.encodeDoubleElement(descriptor, index++, value.btn)
        composite.encodeDoubleElement(descriptor, index++, value.bwp)
        composite.encodeDoubleElement(descriptor, index++, value.byn)
        composite.encodeDoubleElement(descriptor, index++, value.bzd)
        composite.encodeDoubleElement(descriptor, index++, value.cad)
        composite.encodeDoubleElement(descriptor, index++, value.cdf)
        composite.encodeDoubleElement(descriptor, index++, value.chf)
        composite.encodeDoubleElement(descriptor, index++, value.clp)
        composite.encodeDoubleElement(descriptor, index++, value.cny)
        composite.encodeDoubleElement(descriptor, index++, value.cop)
        composite.encodeDoubleElement(descriptor, index++, value.crc)
        composite.encodeDoubleElement(descriptor, index++, value.cup)
        composite.encodeDoubleElement(descriptor, index++, value.cve)
        composite.encodeDoubleElement(descriptor, index++, value.czk)
        composite.encodeDoubleElement(descriptor, index++, value.djf)
        composite.encodeDoubleElement(descriptor, index++, value.dkk)
        composite.encodeDoubleElement(descriptor, index++, value.dop)
        composite.encodeDoubleElement(descriptor, index++, value.dzd)
        composite.encodeDoubleElement(descriptor, index++, value.egp)
        composite.encodeDoubleElement(descriptor, index++, value.ern)
        composite.encodeDoubleElement(descriptor, index++, value.etb)
        composite.encodeDoubleElement(descriptor, index++, value.eur)
        composite.encodeDoubleElement(descriptor, index++, value.fjd)
        composite.encodeDoubleElement(descriptor, index++, value.fkp)
        composite.encodeDoubleElement(descriptor, index++, value.fok)
        composite.encodeDoubleElement(descriptor, index++, value.gbp)
        composite.encodeDoubleElement(descriptor, index++, value.gel)
        composite.encodeDoubleElement(descriptor, index++, value.ggp)
        composite.encodeDoubleElement(descriptor, index++, value.ghs)
        composite.encodeDoubleElement(descriptor, index++, value.gip)
        composite.encodeDoubleElement(descriptor, index++, value.gmd)
        composite.encodeDoubleElement(descriptor, index++, value.gnf)
        composite.encodeDoubleElement(descriptor, index++, value.gtq)
        composite.encodeDoubleElement(descriptor, index++, value.gyd)
        composite.encodeDoubleElement(descriptor, index++, value.hkd)
        composite.encodeDoubleElement(descriptor, index++, value.hnl)
        composite.encodeDoubleElement(descriptor, index++, value.hrk)
        composite.encodeDoubleElement(descriptor, index++, value.htg)
        composite.encodeDoubleElement(descriptor, index++, value.huf)
        composite.encodeDoubleElement(descriptor, index++, value.idr)
        composite.encodeDoubleElement(descriptor, index++, value.ils)
        composite.encodeDoubleElement(descriptor, index++, value.imp)
        composite.encodeDoubleElement(descriptor, index++, value.inr)
        composite.encodeDoubleElement(descriptor, index++, value.iqd)
        composite.encodeDoubleElement(descriptor, index++, value.irr)
        composite.encodeDoubleElement(descriptor, index++, value.isk)
        composite.encodeDoubleElement(descriptor, index++, value.jep)
        composite.encodeDoubleElement(descriptor, index++, value.jmd)
        composite.encodeDoubleElement(descriptor, index++, value.jod)
        composite.encodeDoubleElement(descriptor, index++, value.jpy)
        composite.encodeDoubleElement(descriptor, index++, value.kes)
        composite.encodeDoubleElement(descriptor, index++, value.kgs)
        composite.encodeDoubleElement(descriptor, index++, value.khr)
        composite.encodeDoubleElement(descriptor, index++, value.kid)
        composite.encodeDoubleElement(descriptor, index++, value.kmf)
        composite.encodeDoubleElement(descriptor, index++, value.krw)
        composite.encodeDoubleElement(descriptor, index++, value.kwd)
        composite.encodeDoubleElement(descriptor, index++, value.kyd)
        composite.encodeDoubleElement(descriptor, index++, value.kzt)
        composite.encodeDoubleElement(descriptor, index++, value.lak)
        composite.encodeDoubleElement(descriptor, index++, value.lbp)
        composite.encodeDoubleElement(descriptor, index++, value.lkr)
        composite.encodeDoubleElement(descriptor, index++, value.lrd)
        composite.encodeDoubleElement(descriptor, index++, value.lsl)
        composite.encodeDoubleElement(descriptor, index++, value.lyd)
        composite.encodeDoubleElement(descriptor, index++, value.mad)
        composite.encodeDoubleElement(descriptor, index++, value.mdl)
        composite.encodeDoubleElement(descriptor, index++, value.mga)
        composite.encodeDoubleElement(descriptor, index++, value.mkd)
        composite.encodeDoubleElement(descriptor, index++, value.mmk)
        composite.encodeDoubleElement(descriptor, index++, value.mnt)
        composite.encodeDoubleElement(descriptor, index++, value.mop)
        composite.encodeDoubleElement(descriptor, index++, value.mru)
        composite.encodeDoubleElement(descriptor, index++, value.mur)
        composite.encodeDoubleElement(descriptor, index++, value.mvr)
        composite.encodeDoubleElement(descriptor, index++, value.mwk)
        composite.encodeDoubleElement(descriptor, index++, value.mxn)
        composite.encodeDoubleElement(descriptor, index++, value.myr)
        composite.encodeDoubleElement(descriptor, index++, value.mzn)
        composite.encodeDoubleElement(descriptor, index++, value.nad)
        composite.encodeDoubleElement(descriptor, index++, value.ngn)
        composite.encodeDoubleElement(descriptor, index++, value.nio)
        composite.encodeDoubleElement(descriptor, index++, value.nok)
        composite.encodeDoubleElement(descriptor, index++, value.npr)
        composite.encodeDoubleElement(descriptor, index++, value.nzd)
        composite.encodeDoubleElement(descriptor, index++, value.omr)
        composite.encodeDoubleElement(descriptor, index++, value.pab)
        composite.encodeDoubleElement(descriptor, index++, value.pen)
        composite.encodeDoubleElement(descriptor, index++, value.pgk)
        composite.encodeDoubleElement(descriptor, index++, value.php)
        composite.encodeDoubleElement(descriptor, index++, value.pkr)
        composite.encodeDoubleElement(descriptor, index++, value.pln)
        composite.encodeDoubleElement(descriptor, index++, value.pyg)
        composite.encodeDoubleElement(descriptor, index++, value.qar)
        composite.encodeDoubleElement(descriptor, index++, value.ron)
        composite.encodeDoubleElement(descriptor, index++, value.rsd)
        composite.encodeDoubleElement(descriptor, index++, value.rub)
        composite.encodeDoubleElement(descriptor, index++, value.rwf)
        composite.encodeDoubleElement(descriptor, index++, value.sar)
        composite.encodeDoubleElement(descriptor, index++, value.sbd)
        composite.encodeDoubleElement(descriptor, index++, value.scr)
        composite.encodeDoubleElement(descriptor, index++, value.sdg)
        composite.encodeDoubleElement(descriptor, index++, value.sek)
        composite.encodeDoubleElement(descriptor, index++, value.sgd)
        composite.encodeDoubleElement(descriptor, index++, value.shp)
        composite.encodeDoubleElement(descriptor, index++, value.sle)
        composite.encodeDoubleElement(descriptor, index++, value.sll)
        composite.encodeDoubleElement(descriptor, index++, value.sos)
        composite.encodeDoubleElement(descriptor, index++, value.srd)
        composite.encodeDoubleElement(descriptor, index++, value.ssp)
        composite.encodeDoubleElement(descriptor, index++, value.stn)
        composite.encodeDoubleElement(descriptor, index++, value.syp)
        composite.encodeDoubleElement(descriptor, index++, value.szl)
        composite.encodeDoubleElement(descriptor, index++, value.thb)
        composite.encodeDoubleElement(descriptor, index++, value.tjs)
        composite.encodeDoubleElement(descriptor, index++, value.tmt)
        composite.encodeDoubleElement(descriptor, index++, value.tnd)
        composite.encodeDoubleElement(descriptor, index++, value.top)
        composite.encodeDoubleElement(descriptor, index++, value.tru)
        composite.encodeDoubleElement(descriptor, index++, value.ttd)
        composite.encodeDoubleElement(descriptor, index++, value.tvd)
        composite.encodeDoubleElement(descriptor, index++, value.twd)
        composite.encodeDoubleElement(descriptor, index++, value.tzs)
        composite.encodeDoubleElement(descriptor, index++, value.uah)
        composite.encodeDoubleElement(descriptor, index++, value.ugx)
        composite.encodeDoubleElement(descriptor, index++, value.uyu)
        composite.encodeDoubleElement(descriptor, index++, value.uzs)
        composite.encodeDoubleElement(descriptor, index++, value.ves)
        composite.encodeDoubleElement(descriptor, index++, value.vnd)
        composite.encodeDoubleElement(descriptor, index++, value.vuv)
        composite.encodeDoubleElement(descriptor, index++, value.wst)
        composite.encodeDoubleElement(descriptor, index++, value.xaf)
        composite.encodeDoubleElement(descriptor, index++, value.xcd)
        composite.encodeDoubleElement(descriptor, index++, value.xdr)
        composite.encodeDoubleElement(descriptor, index++, value.xof)
        composite.encodeDoubleElement(descriptor, index++, value.xpf)
        composite.encodeDoubleElement(descriptor, index++, value.yer)
        composite.encodeDoubleElement(descriptor, index++, value.zar)
        composite.encodeDoubleElement(descriptor, index++, value.zmw)
        composite.encodeDoubleElement(descriptor, index++, value.zwl)
        composite.endStructure(descriptor)
    }

    override fun deserialize(decoder: Decoder): ConversionRatesDTO {
        var usd = 0.0
        var aed = 0.0
        var afn = 0.0
        var all = 0.0
        var amd = 0.0
        var ang = 0.0
        var aoa = 0.0
        var ars = 0.0
        var aud = 0.0
        var awg = 0.0
        var azn = 0.0
        var bam = 0.0
        var bbd = 0.0
        var bdt = 0.0
        var bgn = 0.0
        var bhd = 0.0
        var bif = 0.0
        var bmd = 0.0
        var bnd = 0.0
        var bob = 0.0
        var brl = 0.0
        var bsd = 0.0
        var btn = 0.0
        var bwp = 0.0
        var byn = 0.0
        var bzd = 0.0
        var cad = 0.0
        var cdf = 0.0
        var chf = 0.0
        var clp = 0.0
        var cny = 0.0
        var cop = 0.0
        var crc = 0.0
        var cup = 0.0
        var cve = 0.0
        var czk = 0.0
        var djf = 0.0
        var dkk = 0.0
        var dop = 0.0
        var dzd = 0.0
        var egp = 0.0
        var ern = 0.0
        var etb = 0.0
        var eur = 0.0
        var fjd = 0.0
        var fkp = 0.0
        var fok = 0.0
        var gbp = 0.0
        var gel = 0.0
        var ggp = 0.0
        var ghs = 0.0
        var gip = 0.0
        var gmd = 0.0
        var gnf = 0.0
        var gtq = 0.0
        var gyd = 0.0
        var hkd = 0.0
        var hnl = 0.0
        var hrk = 0.0
        var htg = 0.0
        var huf = 0.0
        var idr = 0.0
        var ils = 0.0
        var imp = 0.0
        var inr = 0.0
        var iqd = 0.0
        var irr = 0.0
        var isk = 0.0
        var jep = 0.0
        var jmd = 0.0
        var jod = 0.0
        var jpy = 0.0
        var kes = 0.0
        var kgs = 0.0
        var khr = 0.0
        var kid = 0.0
        var kmf = 0.0
        var krw = 0.0
        var kwd = 0.0
        var kyd = 0.0
        var kzt = 0.0
        var lak = 0.0
        var lbp = 0.0
        var lkr = 0.0
        var lrd = 0.0
        var lsl = 0.0
        var lyd = 0.0
        var mad = 0.0
        var mdl = 0.0
        var mga = 0.0
        var mkd = 0.0
        var mmk = 0.0
        var mnt = 0.0
        var mop = 0.0
        var mru = 0.0
        var mur = 0.0
        var mvr = 0.0
        var mwk = 0.0
        var mxn = 0.0
        var myr = 0.0
        var mzn = 0.0
        var nad = 0.0
        var ngn = 0.0
        var nio = 0.0
        var nok = 0.0
        var npr = 0.0
        var nzd = 0.0
        var omr = 0.0
        var pab = 0.0
        var pen = 0.0
        var pgk = 0.0
        var php = 0.0
        var pkr = 0.0
        var pln = 0.0
        var pyg = 0.0
        var qar = 0.0
        var ron = 0.0
        var rsd = 0.0
        var rub = 0.0
        var rwf = 0.0
        var sar = 0.0
        var sbd = 0.0
        var scr = 0.0
        var sdg = 0.0
        var sek = 0.0
        var sgd = 0.0
        var shp = 0.0
        var sle = 0.0
        var sll = 0.0
        var sos = 0.0
        var srd = 0.0
        var ssp = 0.0
        var stn = 0.0
        var syp = 0.0
        var szl = 0.0
        var thb = 0.0
        var tjs = 0.0
        var tmt = 0.0
        var tnd = 0.0
        var top = 0.0
        var tru = 0.0
        var ttd = 0.0
        var tvd = 0.0
        var twd = 0.0
        var tzs = 0.0
        var uah = 0.0
        var ugx = 0.0
        var uyu = 0.0
        var uzs = 0.0
        var ves = 0.0
        var vnd = 0.0
        var vuv = 0.0
        var wst = 0.0
        var xaf = 0.0
        var xcd = 0.0
        var xdr = 0.0
        var xof = 0.0
        var xpf = 0.0
        var yer = 0.0
        var zar = 0.0
        var zmw = 0.0
        var zwl = 0.0

        var i = 0
        decoder.decodeStructure(descriptor) {
            loop@ while (true) {
                when (decodeElementIndex(descriptor)) {
                    CompositeDecoder.DECODE_DONE -> break@loop
                    i++ -> usd = decodeDoubleElement(descriptor, i++)
                    i++ -> aed = decodeDoubleElement(descriptor, i++)
                    i++ -> afn = decodeDoubleElement(descriptor, i++)
                    i++ -> all = decodeDoubleElement(descriptor, i++)
                    i++ -> amd = decodeDoubleElement(descriptor, i++)
                    i++ -> ang = decodeDoubleElement(descriptor, i++)
                    i++ -> aoa = decodeDoubleElement(descriptor, i++)
                    i++ -> ars = decodeDoubleElement(descriptor, i++)
                    i++ -> aud = decodeDoubleElement(descriptor, i++)
                    i++ -> awg = decodeDoubleElement(descriptor, i++)
                    i++ -> azn = decodeDoubleElement(descriptor, i++)
                    i++ -> bam = decodeDoubleElement(descriptor, i++)
                    i++ -> bbd = decodeDoubleElement(descriptor, i++)
                    i++ -> bdt = decodeDoubleElement(descriptor, i++)
                    i++ -> bgn = decodeDoubleElement(descriptor, i++)
                    i++ -> bhd = decodeDoubleElement(descriptor, i++)
                    i++ -> bif = decodeDoubleElement(descriptor, i++)
                    i++ -> bmd = decodeDoubleElement(descriptor, i++)
                    i++ -> bnd = decodeDoubleElement(descriptor, i++)
                    i++ -> bob = decodeDoubleElement(descriptor, i++)
                    i++ -> brl = decodeDoubleElement(descriptor, i++)
                    i++ -> bsd = decodeDoubleElement(descriptor, i++)
                    i++ -> btn = decodeDoubleElement(descriptor, i++)
                    i++ -> bwp = decodeDoubleElement(descriptor, i++)
                    i++ -> byn = decodeDoubleElement(descriptor, i++)
                    i++ -> bzd = decodeDoubleElement(descriptor, i++)
                    i++ -> cad = decodeDoubleElement(descriptor, i++)
                    i++ -> cdf = decodeDoubleElement(descriptor, i++)
                    i++ -> chf = decodeDoubleElement(descriptor, i++)
                    i++ -> clp = decodeDoubleElement(descriptor, i++)
                    i++ -> cny = decodeDoubleElement(descriptor, i++)
                    i++ -> cop = decodeDoubleElement(descriptor, i++)
                    i++ -> crc = decodeDoubleElement(descriptor, i++)
                    i++ -> cup = decodeDoubleElement(descriptor, i++)
                    i++ -> cve = decodeDoubleElement(descriptor, i++)
                    i++ -> czk = decodeDoubleElement(descriptor, i++)
                    i++ -> djf = decodeDoubleElement(descriptor, i++)
                    i++ -> dkk = decodeDoubleElement(descriptor, i++)
                    i++ -> dop = decodeDoubleElement(descriptor, i++)
                    i++ -> dzd = decodeDoubleElement(descriptor, i++)
                    i++ -> egp = decodeDoubleElement(descriptor, i++)
                    i++ -> ern = decodeDoubleElement(descriptor, i++)
                    i++ -> etb = decodeDoubleElement(descriptor, i++)
                    i++ -> eur = decodeDoubleElement(descriptor, i++)
                    i++ -> fjd = decodeDoubleElement(descriptor, i++)
                    i++ -> fkp = decodeDoubleElement(descriptor, i++)
                    i++ -> fok = decodeDoubleElement(descriptor, i++)
                    i++ -> gbp = decodeDoubleElement(descriptor, i++)
                    i++ -> gel = decodeDoubleElement(descriptor, i++)
                    i++ -> ggp = decodeDoubleElement(descriptor, i++)
                    i++ -> ghs = decodeDoubleElement(descriptor, i++)
                    i++ -> gip = decodeDoubleElement(descriptor, i++)
                    i++ -> gmd = decodeDoubleElement(descriptor, i++)
                    i++ -> gnf = decodeDoubleElement(descriptor, i++)
                    i++ -> gtq = decodeDoubleElement(descriptor, i++)
                    i++ -> gyd = decodeDoubleElement(descriptor, i++)
                    i++ -> hkd = decodeDoubleElement(descriptor, i++)
                    i++ -> hnl = decodeDoubleElement(descriptor, i++)
                    i++ -> hrk = decodeDoubleElement(descriptor, i++)
                    i++ -> htg = decodeDoubleElement(descriptor, i++)
                    i++ -> huf = decodeDoubleElement(descriptor, i++)
                    i++ -> idr = decodeDoubleElement(descriptor, i++)
                    i++ -> ils = decodeDoubleElement(descriptor, i++)
                    i++ -> imp = decodeDoubleElement(descriptor, i++)
                    i++ -> inr = decodeDoubleElement(descriptor, i++)
                    i++ -> iqd = decodeDoubleElement(descriptor, i++)
                    i++ -> irr = decodeDoubleElement(descriptor, i++)
                    i++ -> isk = decodeDoubleElement(descriptor, i++)
                    i++ -> jep = decodeDoubleElement(descriptor, i++)
                    i++ -> jmd = decodeDoubleElement(descriptor, i++)
                    i++ -> jod = decodeDoubleElement(descriptor, i++)
                    i++ -> jpy = decodeDoubleElement(descriptor, i++)
                    i++ -> kes = decodeDoubleElement(descriptor, i++)
                    i++ -> kgs = decodeDoubleElement(descriptor, i++)
                    i++ -> khr = decodeDoubleElement(descriptor, i++)
                    i++ -> kid = decodeDoubleElement(descriptor, i++)
                    i++ -> kmf = decodeDoubleElement(descriptor, i++)
                    i++ -> krw = decodeDoubleElement(descriptor, i++)
                    i++ -> kwd = decodeDoubleElement(descriptor, i++)
                    i++ -> kyd = decodeDoubleElement(descriptor, i++)
                    i++ -> kzt = decodeDoubleElement(descriptor, i++)
                    i++ -> lak = decodeDoubleElement(descriptor, i++)
                    i++ -> lbp = decodeDoubleElement(descriptor, i++)
                    i++ -> lkr = decodeDoubleElement(descriptor, i++)
                    i++ -> lrd = decodeDoubleElement(descriptor, i++)
                    i++ -> lsl = decodeDoubleElement(descriptor, i++)
                    i++ -> lyd = decodeDoubleElement(descriptor, i++)
                    i++ -> mad = decodeDoubleElement(descriptor, i++)
                    i++ -> mdl = decodeDoubleElement(descriptor, i++)
                    i++ -> mga = decodeDoubleElement(descriptor, i++)
                    i++ -> mkd = decodeDoubleElement(descriptor, i++)
                    i++ -> mmk = decodeDoubleElement(descriptor, i++)
                    i++ -> mnt = decodeDoubleElement(descriptor, i++)
                    i++ -> mop = decodeDoubleElement(descriptor, i++)
                    i++ -> mru = decodeDoubleElement(descriptor, i++)
                    i++ -> mur = decodeDoubleElement(descriptor, i++)
                    i++ -> mvr = decodeDoubleElement(descriptor, i++)
                    i++ -> mwk = decodeDoubleElement(descriptor, i++)
                    i++ -> mxn = decodeDoubleElement(descriptor, i++)
                    i++ -> myr = decodeDoubleElement(descriptor, i++)
                    i++ -> mzn = decodeDoubleElement(descriptor, i++)
                    i++ -> nad = decodeDoubleElement(descriptor, i++)
                    i++ -> ngn = decodeDoubleElement(descriptor, i++)
                    i++ -> nio = decodeDoubleElement(descriptor, i++)
                    i++ -> nok = decodeDoubleElement(descriptor, i++)
                    i++ -> npr = decodeDoubleElement(descriptor, i++)
                    i++ -> nzd = decodeDoubleElement(descriptor, i++)
                    i++ -> omr = decodeDoubleElement(descriptor, i++)
                    i++ -> pab = decodeDoubleElement(descriptor, i++)
                    i++ -> pen = decodeDoubleElement(descriptor, i++)
                    i++ -> pgk = decodeDoubleElement(descriptor, i++)
                    i++ -> php = decodeDoubleElement(descriptor, i++)
                    i++ -> pkr = decodeDoubleElement(descriptor, i++)
                    i++ -> pln = decodeDoubleElement(descriptor, i++)
                    i++ -> pyg = decodeDoubleElement(descriptor, i++)
                    i++ -> qar = decodeDoubleElement(descriptor, i++)
                    i++ -> ron = decodeDoubleElement(descriptor, i++)
                    i++ -> rsd = decodeDoubleElement(descriptor, i++)
                    i++ -> rub = decodeDoubleElement(descriptor, i++)
                    i++ -> rwf = decodeDoubleElement(descriptor, i++)
                    i++ -> sar = decodeDoubleElement(descriptor, i++)
                    i++ -> sbd = decodeDoubleElement(descriptor, i++)
                    i++ -> scr = decodeDoubleElement(descriptor, i++)
                    i++ -> sdg = decodeDoubleElement(descriptor, i++)
                    i++ -> sek = decodeDoubleElement(descriptor, i++)
                    i++ -> sgd = decodeDoubleElement(descriptor, i++)
                    i++ -> shp = decodeDoubleElement(descriptor, i++)
                    i++ -> sle = decodeDoubleElement(descriptor, i++)
                    i++ -> sll = decodeDoubleElement(descriptor, i++)
                    i++ -> sos = decodeDoubleElement(descriptor, i++)
                    i++ -> srd = decodeDoubleElement(descriptor, i++)
                    i++ -> ssp = decodeDoubleElement(descriptor, i++)
                    i++ -> stn = decodeDoubleElement(descriptor, i++)
                    i++ -> syp = decodeDoubleElement(descriptor, i++)
                    i++ -> szl = decodeDoubleElement(descriptor, i++)
                    i++ -> thb = decodeDoubleElement(descriptor, i++)
                    i++ -> tjs = decodeDoubleElement(descriptor, i++)
                    i++ -> tmt = decodeDoubleElement(descriptor, i++)
                    i++ -> tnd = decodeDoubleElement(descriptor, i++)
                    i++ -> top = decodeDoubleElement(descriptor, i++)
                    i++ -> tru = decodeDoubleElement(descriptor, i++)
                    i++ -> ttd = decodeDoubleElement(descriptor, i++)
                    i++ -> tvd = decodeDoubleElement(descriptor, i++)
                    i++ -> twd = decodeDoubleElement(descriptor, i++)
                    i++ -> tzs = decodeDoubleElement(descriptor, i++)
                    i++ -> uah = decodeDoubleElement(descriptor, i++)
                    i++ -> ugx = decodeDoubleElement(descriptor, i++)
                    i++ -> uyu = decodeDoubleElement(descriptor, i++)
                    i++ -> uzs = decodeDoubleElement(descriptor, i++)
                    i++ -> ves = decodeDoubleElement(descriptor, i++)
                    i++ -> vnd = decodeDoubleElement(descriptor, i++)
                    i++ -> vuv = decodeDoubleElement(descriptor, i++)
                    i++ -> wst = decodeDoubleElement(descriptor, i++)
                    i++ -> xaf = decodeDoubleElement(descriptor, i++)
                    i++ -> xcd = decodeDoubleElement(descriptor, i++)
                    i++ -> xdr = decodeDoubleElement(descriptor, i++)
                    i++ -> xof = decodeDoubleElement(descriptor, i++)
                    i++ -> xpf = decodeDoubleElement(descriptor, i++)
                    i++ -> yer = decodeDoubleElement(descriptor, i++)
                    i++ -> zar = decodeDoubleElement(descriptor, i++)
                    i++ -> zmw = decodeDoubleElement(descriptor, i++)
                    i++ -> zwl = decodeDoubleElement(descriptor, i++)
                }
            }
        }
        return ConversionRatesDTO(
            usd,
            aed,
            afn,
            all,
            amd,
            ang,
            aoa,
            ars,
            aud,
            awg,
            azn,
            bam,
            bbd,
            bdt,
            bgn,
            bhd,
            bif,
            bmd,
            bnd,
            bob,
            brl,
            bsd,
            btn,
            bwp,
            byn,
            bzd,
            cad,
            cdf,
            chf,
            clp,
            cny,
            cop,
            crc,
            cup,
            cve,
            czk,
            djf,
            dkk,
            dop,
            dzd,
            egp,
            ern,
            etb,
            eur,
            fjd,
            fkp,
            fok,
            gbp,
            gel,
            ggp,
            ghs,
            gip,
            gmd,
            gnf,
            gtq,
            gyd,
            hkd,
            hnl,
            hrk,
            htg,
            huf,
            idr,
            ils,
            imp,
            inr,
            iqd,
            irr,
            isk,
            jep,
            jmd,
            jod,
            jpy,
            kes,
            kgs,
            khr,
            kid,
            kmf,
            krw,
            kwd,
            kyd,
            kzt,
            lak,
            lbp,
            lkr,
            lrd,
            lsl,
            lyd,
            mad,
            mdl,
            mga,
            mkd,
            mmk,
            mnt,
            mop,
            mru,
            mur,
            mvr,
            mwk,
            mxn,
            myr,
            mzn,
            nad,
            ngn,
            nio,
            nok,
            npr,
            nzd,
            omr,
            pab,
            pen,
            pgk,
            php,
            pkr,
            pln,
            pyg,
            qar,
            ron,
            rsd,
            rub,
            rwf,
            sar,
            sbd,
            scr,
            sdg,
            sek,
            sgd,
            shp,
            sle,
            sll,
            sos,
            srd,
            ssp,
            stn,
            syp,
            szl,
            thb,
            tjs,
            tmt,
            tnd,
            top,
            tru,
            ttd,
            tvd,
            twd,
            tzs,
            uah,
            ugx,
            uyu,
            uzs,
            ves,
            vnd,
            vuv,
            wst,
            xaf,
            xcd,
            xdr,
            xof,
            xpf,
            yer,
            zar,
            zmw,
            zwl,
        )
    }
}