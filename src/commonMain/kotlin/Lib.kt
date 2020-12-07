package com.github.yona168.mishnah.other

data class Contributor(val name: String)

interface Question {
    val question: String
    val contributor: Contributor
    val answer: Any
}

abstract class AbstractQuestion(override val question: String, override val contributor: Contributor):Question
class BasicQuestion(question: String, contributor: Contributor, override val answer: String) : AbstractQuestion(question, contributor)
class ListQuestion(question: String, contributor: Contributor, override val answer: List<String>):AbstractQuestion(question, contributor)
typealias MishnahQuestions = List<Question>
data class PerekQuestions(val masechet: Masechet, val mishnahQuestions: MishnahQuestions){
    val seder=masechet.seder
}

enum class Seder(vararg masechets: Masechet){
    ZERAIM(Masechet.BRACHOS,Masechet.PEAH,Masechet.DEMAI,
            Masechet.KILAYIM,Masechet.SHEVIIS,Masechet.TERUMOS,
            Masechet.MAASEROS,Masechet.MAASER_SHEINI,Masechet.CHALLAH,
            Masechet.ORALH,Masechet.BIKKURIM),
    MOED(Masechet.SHABBOS,Masechet.ERUVIN,Masechet.PESACHIM,
            Masechet.SHEKALIM,Masechet.ROSH_HASHANAH,Masechet.YOMA,
            Masechet.SUKKAH,Masechet.BEITZA,Masechet.TAANIS,Masechet.MEGILLAH,
            Masechet.MOED_KATAN,Masechet.CHAGIGAH),
    NASHIM(Masechet.YEVAMOS,Masechet.KETUBOS,Masechet.NEDARIM,
            Masechet.NAZIR,Masechet.SOTAH,Masechet.GITTIN,Masechet.KIDDUSHIN),
    NEZIKIN(Masechet.BAVA_KAMMA,Masechet.BAVA_METZIA,Masechet.BAVA_BASRA,
            Masechet.SANHEDRIN,Masechet.MAKKOS,Masechet.SHEVUOS,Masechet.EDYOS,
            Masechet.AVODAH_ZARA,Masechet.PIRKEI_AVOS,Masechet.HORAYOS),
    KODSHIM(Masechet.ZVACHIM,Masechet.MENACHOS,Masechet.CHULLIN,Masechet.BECHOROS,
            Masechet.ARCHIN,Masechet.TEMURAH,Masechet.KERISOS,Masechet.MEILAH,Masechet.TAMID,
            Masechet.MIDDOS,Masechet.KINNIM),
    TAHAROS(Masechet.KEILIM,Masechet.OHOLOS,Masechet.NEGAIM,Masechet.PARAH,
            Masechet.TAHAROS,Masechet.MIKVAOS,Masechet.NIDDAH,Masechet.MACHSHIRIN,Masechet.ZAVIM,
            Masechet.TEVUL_YOM,Masechet.YADAYIM,Masechet.UKTZIM);
    val masechets=masechets
}
enum class Masechet(val seder: Seder, val numPrakim: Int){
    //MOED
    BRACHOS(Seder.ZERAIM, 9),
    PEAH(Seder.ZERAIM, 8),
    DEMAI(Seder.ZERAIM,7),
    KILAYIM(Seder.ZERAIM,9),
    SHEVIIS(Seder.ZERAIM,10),
    TERUMOS(Seder.ZERAIM, 11),
    MAASEROS(Seder.ZERAIM,5),
    MAASER_SHEINI(Seder.ZERAIM,5),
    CHALLAH(Seder.ZERAIM,4),
    ORALH(Seder.ZERAIM,3),
    BIKKURIM(Seder.ZERAIM,4),
    //MOED
    SHABBOS(Seder.MOED,24),
    ERUVIN(Seder.MOED,10),
    PESACHIM(Seder.MOED,10),
    SHEKALIM(Seder.MOED,8),
    ROSH_HASHANAH(Seder.MOED,4),
    YOMA(Seder.MOED,8),
    SUKKAH(Seder.MOED,5),
    BEITZA(Seder.MOED,5),
    TAANIS(Seder.MOED,4),
    MEGILLAH(Seder.MOED,4),
    MOED_KATAN(Seder.MOED,3),
    CHAGIGAH(Seder.MOED,3),
    //NASHIM
    YEVAMOS(Seder.NASHIM,16),
    KETUBOS(Seder.NASHIM,13),
    NEDARIM(Seder.NASHIM,11),
    NAZIR(Seder.NASHIM,9),
    SOTAH(Seder.NASHIM,9),
    GITTIN(Seder.NASHIM,9),
    KIDDUSHIN(Seder.NASHIM,4),
    //NEZIKIN
    BAVA_KAMMA(Seder.NEZIKIN,10),
    BAVA_METZIA(Seder.NEZIKIN,10),
    BAVA_BASRA(Seder.NEZIKIN,10),
    SANHEDRIN(Seder.NEZIKIN,11),
    MAKKOS(Seder.NEZIKIN,3),
    SHEVUOS(Seder.NEZIKIN,8),
    EDYOS(Seder.NEZIKIN,8),
    AVODAH_ZARA(Seder.NEZIKIN,5),
    PIRKEI_AVOS(Seder.NEZIKIN,6),
    HORAYOS(Seder.NEZIKIN,3),
    //KODSHIM
    ZVACHIM(Seder.KODSHIM,14),
    MENACHOS(Seder.KODSHIM,13),
    CHULLIN(Seder.KODSHIM,12),
    BECHOROS(Seder.KODSHIM,9),
    ARCHIN(Seder.KODSHIM,9),
    TEMURAH(Seder.KODSHIM,7),
    KERISOS(Seder.KODSHIM,6),
    MEILAH(Seder.KODSHIM,6),
    TAMID(Seder.KODSHIM,7),
    MIDDOS(Seder.KODSHIM,5),
    KINNIM(Seder.KODSHIM,3),
    //TAHAROS
    KEILIM(Seder.TAHAROS,30),
    OHOLOS(Seder.TAHAROS,18),
    NEGAIM(Seder.TAHAROS,14),
    PARAH(Seder.TAHAROS,12),
    TAHAROS(Seder.TAHAROS,10),
    MIKVAOS(Seder.TAHAROS,10),
    NIDDAH(Seder.TAHAROS,10),
    MACHSHIRIN(Seder.TAHAROS,6),
    ZAVIM(Seder.TAHAROS,5),
    TEVUL_YOM(Seder.TAHAROS,4),
    YADAYIM(Seder.TAHAROS,4),
    UKTZIM(Seder.TAHAROS,3)
}