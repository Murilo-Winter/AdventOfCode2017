package com;

import java.util.ArrayList;
import java.util.List;

public class Exercise7p1 {

    List<Program> programList = new ArrayList<>();

    String input = "yvpwz (50)\n" +
            "vfosh (261) -> aziwd, tubze, dhjrv\n" +
            "xtvawvt (19)\n" +
            "nspsk (24)\n" +
            "sgtfap (19) -> bohjocj, bqvzg\n" +
            "oyuteie (52)\n" +
            "irrpz (226) -> cibfe, hemjsj, upbldz\n" +
            "vtvku (426)\n" +
            "vbsfwqh (6055) -> govhrck, pglpu, rwuflbi, ppgaoz\n" +
            "nupmnv (47) -> cngdg, olgsb, lmvmb\n" +
            "ulndqey (71)\n" +
            "fujgzbt (198) -> fbesgp, hewtnrw\n" +
            "nsbvvsi (39)\n" +
            "ajvtdl (36)\n" +
            "xrgca (85)\n" +
            "mksrqb (45)\n" +
            "ozfsktz (56) -> xzwjii, uhxjy\n" +
            "peretma (15) -> suzsw, ycvvjgc, cdyhvr, jixggay\n" +
            "boplau (77) -> boggvxt, cnyasj\n" +
            "rzqffr (84) -> tbppaj, htyeqf, pgnyu, ruhqn\n" +
            "shkkwp (5)\n" +
            "bpptuqh (68) -> ugxls, zlshut, ltqljtw\n" +
            "bngres (944) -> ktwby, tblhhg, jzgpty, skbprng\n" +
            "tjnyo (55)\n" +
            "ujfeg (13) -> vldxkw, kfbsjv, rlqwaz, dvwsrc, ymxlwf, zvmhx, wfdxfxq\n" +
            "mxplky (35)\n" +
            "ezkqh (91)\n" +
            "kozgi (48)\n" +
            "pgnyu (94)\n" +
            "yhunajf (25)\n" +
            "pvpmt (77)\n" +
            "cvitrpt (88)\n" +
            "zjwih (46) -> cvitrpt, chtamif\n" +
            "mhfnxk (6) -> jddyhz, gvrhj, ctpdk, oprvyxy, luzjys\n" +
            "dbrnqc (77)\n" +
            "iorlbdv (43)\n" +
            "twwzhwf (118) -> ndgupvi, aumbaa\n" +
            "mvngvtg (67)\n" +
            "kwkprrw (187) -> uobxcai, aklrjg\n" +
            "wtvffu (120) -> vzxvex, mtsbrje, slfile\n" +
            "vjwivnq (52)\n" +
            "cbwbdsv (157) -> przuau, atjtgjx\n" +
            "rwuflbi (8) -> lapoix, dkdovw, spgcwtn\n" +
            "upbldz (27)\n" +
            "xgnqi (64)\n" +
            "ksotbs (48) -> cqbvru, tqbvdu\n" +
            "romrjs (55) -> vhilqk, gzxuw\n" +
            "ftmwqqj (76)\n" +
            "kqpvqie (63) -> qomhp, fwvsi\n" +
            "xxrsnzv (39)\n" +
            "trqfblp (85)\n" +
            "rmjktk (28) -> wtkfiw, mlrdsj, pnicdos, woujz, psrzr\n" +
            "lwygknn (96)\n" +
            "ctgbkrb (76) -> iavuhwe, onvkja\n" +
            "iqbrs (67) -> tghoyv, hoheog, kjpzwp, wwvad, ezmjqnt\n" +
            "efuqu (136) -> umljkr, qblnh\n" +
            "egwjjg (85)\n" +
            "dgtvwiy (27)\n" +
            "ndgupvi (28)\n" +
            "zdvai (85)\n" +
            "auhio (82)\n" +
            "dywjt (40)\n" +
            "hhboca (18)\n" +
            "pptbkz (96)\n" +
            "iqsvbk (73)\n" +
            "nwjibjk (31)\n" +
            "veclzy (308) -> dohjma, hbiwkt\n" +
            "repak (139) -> bcjxhps, eyckbl\n" +
            "xguqlvl (74)\n" +
            "rkjmp (59)\n" +
            "eqviuw (171) -> mqlsvih, lrnjjfq, njgkkxo\n" +
            "zogylog (80)\n" +
            "kroqr (38)\n" +
            "onvkja (49)\n" +
            "tedehrz (94) -> ipqjff, dmiqf\n" +
            "lhwyt (287) -> jbwbw, htyyatf, ppvwkei, vtbzq, pynomi, uswsg\n" +
            "mrbqk (64)\n" +
            "aoxtau (64)\n" +
            "gvrhj (59) -> qurrva, xrgca\n" +
            "lfksu (72)\n" +
            "tnwle (49)\n" +
            "dgnpr (93)\n" +
            "ucsxzhl (21) -> tpefei, ntkeax, jvayv, yuobv\n" +
            "wbibf (183) -> pvtat, ygnww, akngdu, swpkkpi\n" +
            "ljaktj (21939) -> seeqikh, mqrfbqc, ihnus\n" +
            "agqkf (69)\n" +
            "tubze (48)\n" +
            "fcapw (105) -> nkhzrd, shkkwp\n" +
            "sdied (47)\n" +
            "zfmeblt (56)\n" +
            "wqyzjzi (41)\n" +
            "zxjeza (185) -> ioumv, pjersb\n" +
            "vecxd (56) -> civozek, qzsypj\n" +
            "dkxebg (73) -> atrmuc, mhfnxk, zwwbw, ryaotx, yqhmb, yztqpc\n" +
            "oqiye (35)\n" +
            "edyqn (60)\n" +
            "fujwzoc (404)\n" +
            "llcbiqi (79)\n" +
            "yejkld (41)\n" +
            "utbev (25) -> hsxru, jfuxeo, zyshq, eznabc, lgsda, uobxonm\n" +
            "ojxyv (79)\n" +
            "vbpde (20)\n" +
            "fyjowg (26)\n" +
            "yfzjc (31)\n" +
            "obwzec (41)\n" +
            "zcanxq (85)\n" +
            "woujz (125) -> qntvn, kwzrzn\n" +
            "adhwzp (305) -> agqkf, yallk\n" +
            "zvcfznz (184) -> rjuhrpu, yzwnh, hikik\n" +
            "dxbrl (66)\n" +
            "appays (423) -> nupmnv, cyppxr, rqoczb\n" +
            "rgndu (81) -> tsbbzu, dtxrjg\n" +
            "jncex (74) -> rrdczem, bhhgpe, gtvnow, vndrx\n" +
            "cfvbuip (53)\n" +
            "vsqfx (29)\n" +
            "zocaag (38)\n" +
            "ppymmsf (19)\n" +
            "amwxj (69) -> pptbkz, kweqtf, jwmbs\n" +
            "svadhfo (99)\n" +
            "xdsbnr (8)\n" +
            "duvrzrl (22)\n" +
            "dfaro (8)\n" +
            "vgugdtt (220) -> nxpakq, fhsecp\n" +
            "fwddmmv (43)\n" +
            "igaww (28)\n" +
            "bbxbrsh (31)\n" +
            "swpkkpi (13)\n" +
            "bkqexxz (77)\n" +
            "ovfduq (16)\n" +
            "rtzce (39)\n" +
            "gmwto (119) -> wbeizj, refgrip\n" +
            "rmdhj (24)\n" +
            "yeref (77)\n" +
            "ifstrgw (23) -> qpixldb, tukirqp, bwcyqb, bzbmt\n" +
            "untdpje (45) -> owimy, yejkld\n" +
            "esiwujq (41)\n" +
            "emvxet (131) -> vecdh, ftgvx\n" +
            "mztuzb (764) -> jgzvrf, eaqiocy, fsagr\n" +
            "bwnabqh (83)\n" +
            "gypsfc (43)\n" +
            "bhemin (44)\n" +
            "imydd (164) -> iabqb, vdpnsak\n" +
            "qajpehv (49)\n" +
            "oxnfnsv (76) -> twwzhwf, uiyyc, gfaamu, umhcrc, bcjpzpk, vrqeade\n" +
            "qfdldyu (231)\n" +
            "dmsmgs (29)\n" +
            "oqady (7) -> mhtzh, cpreh\n" +
            "zbhwrc (759) -> esrilo, dcngdo\n" +
            "cyppxr (272) -> pitmcu, nvlqab\n" +
            "jtzjrke (45)\n" +
            "przuau (59)\n" +
            "eexkce (44)\n" +
            "xsewlv (124) -> fwfpmti, rszjhxn\n" +
            "fbesgp (28)\n" +
            "sxegjbz (297) -> yhycc, gxmry, favzt\n" +
            "nxpakq (17)\n" +
            "hbvvse (98)\n" +
            "ygzwut (83)\n" +
            "cngdg (93)\n" +
            "tfzum (69)\n" +
            "ccghjn (58)\n" +
            "ylbpwah (190) -> htlpx, eduzave, peqgox, fkqkfdu\n" +
            "mobbhp (141) -> clgbo, jtzjrke\n" +
            "icdlpb (62)\n" +
            "wkrtcw (1663) -> qqzhz, ybewhak, mazbb\n" +
            "uswsg (312)\n" +
            "zdvlgn (63) -> rmpryj, qrtdtt\n" +
            "hfcifm (107) -> tpfuxx, wdivd\n" +
            "cltqhc (25)\n" +
            "gnrnwtz (513) -> efxakc, jxlgwb, ksotbs, gvayfu, wqvtdc\n" +
            "rdufpid (25)\n" +
            "kszmj (137) -> eemfgbx, amvjukd\n" +
            "ykuto (662) -> pvuoltd, kcyiwqs, kbjnzw, kszmj\n" +
            "ckswvj (264) -> cleanrs, ntixh\n" +
            "czhsx (51)\n" +
            "luayjsp (47) -> alhjba, qjghc\n" +
            "djnsvq (295) -> nbnqidn, ijjfn\n" +
            "qxzfv (57)\n" +
            "qyzja (94)\n" +
            "rmpryj (96)\n" +
            "eyreht (45)\n" +
            "vzkii (216)\n" +
            "rwheyic (68)\n" +
            "rjmdre (21)\n" +
            "qntvn (71)\n" +
            "lescv (32)\n" +
            "qomhp (32)\n" +
            "oegwh (70)\n" +
            "tukirqp (85)\n" +
            "pumxr (103) -> wvpwez, kiuiq\n" +
            "fjrpc (89)\n" +
            "gmoliax (1327) -> jniisu, cfafhwl\n" +
            "wsrwgvc (80)\n" +
            "zhgzg (62) -> aonfu, vqiqglo\n" +
            "fxcuah (208) -> uofigyp, kfxyzqc\n" +
            "fnjnhmk (76)\n" +
            "zlshut (62)\n" +
            "hsnbry (26)\n" +
            "pjnyxo (30)\n" +
            "luzjys (115) -> kisjb, owsosl\n" +
            "vecdh (14)\n" +
            "vfrqc (13)\n" +
            "udjcwm (18)\n" +
            "twpmx (30)\n" +
            "oiysq (64)\n" +
            "lcazsyd (78)\n" +
            "ryaotx (399) -> lmctbp, imydd, wlkatbq, sikzsc\n" +
            "rbnfwkf (51)\n" +
            "kdtpg (4260) -> lymwlyg, xgqzb, appays\n" +
            "djvps (30)\n" +
            "vjqjwk (76)\n" +
            "pbrdt (66)\n" +
            "rciilr (33)\n" +
            "heumdl (75)\n" +
            "whqvs (146) -> ttxrd, qxuakjr\n" +
            "zvtxa (77)\n" +
            "cpkkq (18) -> romrjs, xmpdevf, nnofr, qgqou, nmkjx, nbvwta\n" +
            "sxada (7) -> dgrwv, irlfj, rmjpia, ciafn\n" +
            "frbmr (67) -> tnwle, nnyqes\n" +
            "tgksxw (53) -> dkffgot, yvpwz\n" +
            "ijvux (77)\n" +
            "tblhhg (44)\n" +
            "xxsivgz (17) -> kkhfzgn, rbqcbvl\n" +
            "ylxxmlt (83) -> qxzfv, dacbtyf, aqhcy\n" +
            "vndrx (248) -> xecqd, tznkdt\n" +
            "jwezuh (57) -> kxrxtq, cijfsu\n" +
            "ztqvzwj (86)\n" +
            "dluyef (1987) -> zcicmp, qkhhg, eivrwbt, iqzdu, rmvry\n" +
            "ybzvav (873) -> agwyte, kawloxz, bmdxyf\n" +
            "pvuoltd (115) -> glgrdm, gfizf, bnehbkl, lkyeyn\n" +
            "ceefghr (21) -> mksrqb, saqjax, llild, qwvvha\n" +
            "khphs (101) -> qwlepd, acgrw\n" +
            "yxvgj (13)\n" +
            "zifogt (85)\n" +
            "wgwlbz (83) -> uwaij, qklota\n" +
            "xlyvge (235) -> zgnoqml, trqfblp\n" +
            "qaxvec (41)\n" +
            "ylkfgx (6)\n" +
            "pzgvdt (37)\n" +
            "vtzdfjg (77)\n" +
            "tyiekxm (24)\n" +
            "jaiqusy (18)\n" +
            "avhkram (73)\n" +
            "akluijb (77)\n" +
            "bohjocj (73)\n" +
            "ofoto (1287) -> sgrcmj, jxykl\n" +
            "qgqou (227)\n" +
            "xtoaq (18)\n" +
            "peqgox (25)\n" +
            "kobcmy (64) -> haeymgy, egwjjg, zcanxq, zifogt\n" +
            "namzy (79)\n" +
            "vldxkw (463) -> gmwto, aflmt, boplau, khphs, qlthpj, epqsj\n" +
            "chtamif (88)\n" +
            "vqsuh (92)\n" +
            "iofsrh (35)\n" +
            "njgkkxo (17)\n" +
            "zsqqhe (94)\n" +
            "xupdam (64)\n" +
            "bqvzg (73)\n" +
            "hmetm (889) -> aklagd, ceefghr, whcxfwf, guztl\n" +
            "hoheog (296)\n" +
            "llsvd (18)\n" +
            "giupn (30)\n" +
            "dfzfwun (64)\n" +
            "nmfvmam (125) -> qxwlhxh, obwzec\n" +
            "ioumv (86)\n" +
            "gxmry (143) -> cyvplfd, wmcusr\n" +
            "ywgvsdb (131) -> fzfxs, yvdkbo, igaww\n" +
            "pwsye (49)\n" +
            "mywezi (407) -> gimkyms, bnxvusb\n" +
            "fzfxs (28)\n" +
            "kurgrkq (76)\n" +
            "txeucf (61)\n" +
            "gjwflt (84) -> xmfzu, gcbjhu, xxnannn, bwnabqh\n" +
            "vrgxe (1226) -> zbfyg, rocbcw, zouml, wbibf\n" +
            "izwze (16)\n" +
            "jwmbs (96)\n" +
            "euvev (46)\n" +
            "dgzvf (30)\n" +
            "iezdimc (82)\n" +
            "zkhll (992) -> bbqtwv, xupdam\n" +
            "jhxxfq (71)\n" +
            "hemjsj (27)\n" +
            "ryxkvxj (124) -> bhemin, apghde\n" +
            "qxuakjr (54)\n" +
            "aonfu (95)\n" +
            "dvopaww (98)\n" +
            "uobwwa (69)\n" +
            "dojvyuv (96)\n" +
            "ezcmm (886) -> ntjmwf, qfdldyu, vokxlx\n" +
            "yzwnh (15)\n" +
            "jfqanu (302) -> dcgarog, tcpqh\n" +
            "gfizf (14)\n" +
            "kvbdsv (46)\n" +
            "qzsypj (98)\n" +
            "vyffcrm (24)\n" +
            "iuoxs (13)\n" +
            "zitfb (23) -> ctagl, ddpgq\n" +
            "yueoma (46)\n" +
            "bbqtwv (64)\n" +
            "hgsng (45)\n" +
            "wgehfu (77) -> lescv, hnjbsg, bxvwe, evmuxia\n" +
            "arwqmho (66)\n" +
            "amvjukd (17)\n" +
            "ntixh (10)\n" +
            "zfzblty (47)\n" +
            "cxzuprb (592) -> texfyi, dvgstr, irhxzg\n" +
            "ekqux (76)\n" +
            "abxalr (697) -> zjwih, gjwuf, eqviuw\n" +
            "choiui (65)\n" +
            "tgjdwlh (24)\n" +
            "glhsr (60)\n" +
            "rtymngs (66)\n" +
            "rocbcw (169) -> djizg, dtnaqds\n" +
            "bjwws (46) -> evgtp, ztqvzwj\n" +
            "gowbiey (78)\n" +
            "yqhmb (497) -> njgrpbo, tedehrz, bjwws\n" +
            "lapoix (240) -> xkizl, dyhate, disan\n" +
            "vckqsrm (30)\n" +
            "sxdljm (66)\n" +
            "frpmd (13)\n" +
            "uwhwsv (86)\n" +
            "wknic (47)\n" +
            "pnicdos (165) -> czhsx, rbnfwkf\n" +
            "wrsik (80)\n" +
            "wbogdd (66) -> eibtll, ppmvpn\n" +
            "fyrqw (28) -> ekqux, zxoqwjv, ipogzy, dhzuvup\n" +
            "uttjzap (22)\n" +
            "gqjkk (41)\n" +
            "gcbjhu (83)\n" +
            "bnxvusb (21)\n" +
            "bxvwe (32)\n" +
            "difjqqd (47)\n" +
            "xxnannn (83)\n" +
            "lxzucvk (94)\n" +
            "ehynj (98) -> ijvuozb, wutdi\n" +
            "vwkbje (25)\n" +
            "ciafn (62)\n" +
            "pyyuj (34)\n" +
            "zofljd (685) -> hfcifm, emvxet, ahrdgu\n" +
            "zyshq (140) -> dpcmm, eosuf\n" +
            "zgslahq (101) -> ximrxj, auvxopo\n" +
            "xszci (72)\n" +
            "fomxzjj (47)\n" +
            "mcduoz (6)\n" +
            "rcltx (73) -> djnsvq, hqmum, ifstrgw\n" +
            "pemna (98)\n" +
            "fgnsyw (39)\n" +
            "tfppg (77) -> uwhwsv, fmapm\n" +
            "tohlady (84)\n" +
            "gzxuw (86)\n" +
            "mkdiuil (96)\n" +
            "qfhkgt (52)\n" +
            "csxwyly (47)\n" +
            "intuzzk (82) -> jqqxv, dlnyi, pbides, qtcqtv\n" +
            "bfxhl (78) -> qvmorke, pazbvum\n" +
            "eduzave (25)\n" +
            "kwbni (74) -> abxalr, bbsuv, gnrnwtz, rmjktk, eqcnl, pdwesa, sunvhgy\n" +
            "hhnvuv (83)\n" +
            "ismgnve (68)\n" +
            "alhjba (84)\n" +
            "mspkmg (94)\n" +
            "rszjhxn (34)\n" +
            "frleu (60)\n" +
            "mewfm (48) -> gowbiey, yevks\n" +
            "mpulnxr (42) -> eziuhsd, xsewlv, tckcxhb, bfxhl\n" +
            "mzksj (68)\n" +
            "shnqfh (1649) -> wnnov, mdtniv, fwpuy\n" +
            "bxpfop (153)\n" +
            "zucsr (26)\n" +
            "gmpqmio (93)\n" +
            "wzjbp (174)\n" +
            "zcicmp (301)\n" +
            "ppvwkei (93) -> eqjfyj, lghygm, grrycy\n" +
            "tcsoaw (239) -> kzfzp, oypzs\n" +
            "nnsial (78)\n" +
            "mazbb (98) -> dsxhhub, fqoqkzk\n" +
            "lclbeiq (81) -> bwxicc, uttjzap\n" +
            "jddyhz (91) -> vmmww, mvalh\n" +
            "umqrwk (132) -> itvhd, jbuxnpr, mxopf\n" +
            "qxfan (34)\n" +
            "cdafdq (26)\n" +
            "drrjnr (80)\n" +
            "kxrxtq (68)\n" +
            "cnyasj (56)\n" +
            "kpdbki (38)\n" +
            "dgzoyx (72)\n" +
            "zwwbw (155) -> eqbvn, qcghv, tfppg, xaanoft\n" +
            "zsxbg (22)\n" +
            "fwvsi (32)\n" +
            "hefgter (6) -> pirieql, hikocbe\n" +
            "mwelezd (81)\n" +
            "eptcqns (16)\n" +
            "jmbiky (96)\n" +
            "gnozwfo (242) -> vqsuh, cxlfgl\n" +
            "wtkfiw (48) -> owresw, grqjew, okbzzwd\n" +
            "ltqljtw (62)\n" +
            "lymwlyg (72) -> snkox, adhwzp, cvdjts\n" +
            "mgeizij (60) -> sbcuc, rqrfl\n" +
            "zghvta (57)\n" +
            "uqcqc (85)\n" +
            "tozwp (19)\n" +
            "nqjrds (81)\n" +
            "cfufhn (11)\n" +
            "yznhjg (60) -> choiui, yhecio, lprpgxe\n" +
            "qtbhnxr (27)\n" +
            "bwdfws (27)\n" +
            "kiuiq (89)\n" +
            "zjfrc (141) -> zghvta, lkqiqa\n" +
            "ooiyeep (80)\n" +
            "xiawjb (38)\n" +
            "wgzdt (216) -> vfrqc, frpmd\n" +
            "lugkrb (36)\n" +
            "mvalh (69)\n" +
            "cruxrmy (52)\n" +
            "azwmkej (33)\n" +
            "tqbvdu (61)\n" +
            "szvlte (21)\n" +
            "bzbmt (85)\n" +
            "gcczhgd (43) -> eecoekq, kwpnxyh\n" +
            "jxlgwb (24) -> pzahn, yadtxl\n" +
            "gfaamu (8) -> ygzwut, hhnvuv\n" +
            "ntjmwf (211) -> owqdo, umvvwsq\n" +
            "rqhrb (19)\n" +
            "jixggay (28)\n" +
            "gavjzk (91)\n" +
            "mbydswv (69)\n" +
            "unqbwiz (10) -> rixge, lkwapf, phvbwg\n" +
            "veycd (62)\n" +
            "lmctbp (106) -> wqyzjzi, gqjkk\n" +
            "jwpjy (94) -> ywlub, rtymngs\n" +
            "febjzqn (46461) -> mwtojre, iqmqju, dkxebg\n" +
            "yvdkbo (28)\n" +
            "iayzdx (7181) -> fakyd, fjwmd, uzicvdh\n" +
            "uobxonm (118) -> wrsik, wsrwgvc\n" +
            "sehxgj (41) -> wpezjoi, dcnuouj, vrpqev, kjwvqdz, vzkii\n" +
            "eziuhsd (192)\n" +
            "gcichoe (79)\n" +
            "jwzmsv (45)\n" +
            "fmapm (86)\n" +
            "rbtvx (53)\n" +
            "sgkksme (94)\n" +
            "zmces (86)\n" +
            "rmjpia (62)\n" +
            "feiki (376) -> oqady, fcymcb, wlleabp\n" +
            "sgrcmj (54)\n" +
            "dohjma (76)\n" +
            "kgzqclo (71)\n" +
            "eqjfyj (73)\n" +
            "zcjrk (1009) -> zdvlgn, sxada, yznhjg, pnoxhe\n" +
            "zhudrmb (78) -> mvngvtg, kvags\n" +
            "iylwxgn (98) -> edebwk, gjwflt, rlapq\n" +
            "beraoor (10) -> pumxr, gasnep, ulznkvm\n" +
            "gxnoomf (185) -> ihrhkj, cfufhn\n" +
            "fhoprd (71)\n" +
            "pbides (59)\n" +
            "xqgjvz (192) -> twpmx, zwofu\n" +
            "mexuge (52)\n" +
            "rbfbf (47)\n" +
            "oprvyxy (125) -> oyuteie, yibxqhs\n" +
            "eqcnl (637) -> kgjcj, wgzdt, rrgffal\n" +
            "kikfs (40)\n" +
            "ntvul (77)\n" +
            "bwxicc (22)\n" +
            "rttwea (55) -> fnjnhmk, kurgrkq\n" +
            "kfxyzqc (9)\n" +
            "ddmrgzp (69)\n" +
            "clgbo (45)\n" +
            "qoapjhr (173)\n" +
            "kkhfzgn (88)\n" +
            "njgrpbo (74) -> dgzoyx, rlywif\n" +
            "bwcyqb (85)\n" +
            "esrilo (47)\n" +
            "blutjw (717) -> fxcuah, efuqu, jwpjy\n" +
            "owimy (41)\n" +
            "oeeqrsd (62)\n" +
            "akoqk (16)\n" +
            "owqdo (10)\n" +
            "fwpuy (26) -> eqnpvwk, lbhxdbr, lqqkjjr, tlvpv\n" +
            "tzqzk (52)\n" +
            "gxobd (91)\n" +
            "npqroe (36)\n" +
            "pstaxvr (761) -> peretma, kqpvqie, untdpje\n" +
            "boggvxt (56)\n" +
            "uobxcai (10)\n" +
            "vmyda (63912) -> rcltx, ajwxaa, yvqasth\n" +
            "jznrci (51) -> mclgebd, emdsyso\n" +
            "ktgfsm (50)\n" +
            "kweqtf (96)\n" +
            "mtsbrje (66)\n" +
            "rjuhrpu (15)\n" +
            "zgnoqml (85)\n" +
            "qlthpj (57) -> arwqmho, yydyjr\n" +
            "cdudjbj (128) -> iofsrh, nuuwbui, mxplky\n" +
            "estwket (94)\n" +
            "adjlg (67)\n" +
            "jbwbw (114) -> dxbrl, lhdhko, fdjhpq\n" +
            "ezfky (71)\n" +
            "rrdczem (71) -> dgrfhvi, adjlg, ajyqxh\n" +
            "xqrmgdk (6543) -> unqbwiz, cxzuprb, rmkhel\n" +
            "nmkjx (213) -> wycesn, gpfipvk\n" +
            "qklota (16)\n" +
            "jbuxnpr (30)\n" +
            "xtzqooh (27)\n" +
            "vbcfe (49938) -> yuepckc, ybzvav, sxapjc, cfvlt, dluyef\n" +
            "drzrtpi (96) -> nuuqqqy, scqutwb\n" +
            "xkfps (7)\n" +
            "nvxlr (49)\n" +
            "hazbs (31)\n" +
            "ajyqxh (67)\n" +
            "guhyk (66)\n" +
            "ipwxws (190) -> difjqqd, wknic\n" +
            "akngdu (13)\n" +
            "evgtp (86)\n" +
            "eznabc (150) -> dvhbwl, xnuoisk\n" +
            "limjm (52)\n" +
            "bykjeka (71) -> sdied, zfzblty, csxwyly, fomxzjj\n" +
            "gpfipvk (7)\n" +
            "cpreh (86)\n" +
            "qurrva (85)\n" +
            "sikzsc (46) -> dpetvw, pridma\n" +
            "vokxlx (69) -> gadnfmt, nqjrds\n" +
            "scbycx (193)\n" +
            "qjghc (84)\n" +
            "ctpjjsh (964) -> thlbs, wgehfu, fetns\n" +
            "uzicvdh (42) -> altsh, xhhhix, calvq, bykjeka, iucuw\n" +
            "tpefei (109) -> qtznzyx, myznok\n" +
            "sizfqfs (116) -> vsqfx, dmsmgs\n" +
            "qumahjn (71)\n" +
            "ctagl (97)\n" +
            "hewtnrw (28)\n" +
            "ocpzltp (67)\n" +
            "ihnus (40) -> vrgxe, shnqfh, auzded, hkhsc, jwddn, mcxki, lhwyt\n" +
            "iuydxn (253) -> fhoaub, kmnjo\n" +
            "evubadn (49)\n" +
            "wpezjoi (112) -> zpxqtrg, tzqzk\n" +
            "qtznzyx (57)\n" +
            "dcnuouj (76) -> oegwh, ztzfled\n" +
            "ddpgq (97)\n" +
            "ktrkhe (67)\n" +
            "podcsx (71)\n" +
            "univhdj (26)\n" +
            "puxaz (60)\n" +
            "jadome (50)\n" +
            "uplbokf (5475) -> vbxqhoy, cpkkq, iqozz\n" +
            "llild (45)\n" +
            "lylaoh (170) -> lomhz, tzjzmmv, cefbp\n" +
            "owsosl (57)\n" +
            "iqozz (681) -> syykbn, mbmzme, cdudjbj\n" +
            "nvdon (345) -> dgzvf, djvps\n" +
            "iigqfh (327)\n" +
            "ctatrbo (279) -> tyiekxm, rmdhj\n" +
            "yevks (78)\n" +
            "cipxwb (85)\n" +
            "edmljb (134) -> ligev, glhsr\n" +
            "yallk (69)\n" +
            "owtxsq (71) -> zxjeza, pzgvsxu, amwxj\n" +
            "pejmc (151) -> fjvoff, esgqip\n" +
            "pridma (71)\n" +
            "vdpnsak (12)\n" +
            "hlfbt (200) -> univhdj, xnxdmdb\n" +
            "wyuwk (315) -> ibcbvy, ztaff\n" +
            "phvbwg (86) -> yachdf, utncpu, tohlady\n" +
            "nbnqidn (34)\n" +
            "tnyjkok (93)\n" +
            "kwpnxyh (41)\n" +
            "yachdf (84)\n" +
            "ximrxj (42)\n" +
            "appok (73)\n" +
            "rrgffal (78) -> trxgpy, zmjfa\n" +
            "uiyyc (126) -> nspsk, plxdglq\n" +
            "rcxtjte (210) -> drrvse, szvlte\n" +
            "ruild (9) -> zqdezgy, cxpoqyu\n" +
            "mqlsvih (17)\n" +
            "xgqzb (451) -> mgeizij, hefgter, ajtjnwp, ljhezx, pwwqvhw\n" +
            "gmdcbyg (214) -> mexuge, limjm\n" +
            "mxopf (30)\n" +
            "wnnov (170)\n" +
            "qgwcfll (95)\n" +
            "smtbsys (49)\n" +
            "jiyuw (40)\n" +
            "sunvhgy (218) -> fmlhgs, clmyzsu, zvcfznz, xrkca, jznrci\n" +
            "wycesn (7)\n" +
            "sbgwln (66)\n" +
            "dkffgot (50)\n" +
            "ximrdyg (217) -> tpbgp, ibmcytl\n" +
            "mvqfvit (38)\n" +
            "spgcwtn (63) -> yeref, itxaax, ntvul\n" +
            "apmpzd (46)\n" +
            "njkeu (67) -> vecxd, rpcoxd, emqoxss, elusirt, hlfbt, xqgjvz\n" +
            "irlfj (62)\n" +
            "zxoqwjv (76)\n" +
            "vjwlck (28)\n" +
            "ezmjqnt (146) -> wdssrl, gwcig\n" +
            "plzfjy (41)\n" +
            "beeeaye (71)\n" +
            "nqkwmyd (254)\n" +
            "hbiwkt (76)\n" +
            "hspol (20)\n" +
            "ntjawca (63)\n" +
            "yuobv (91) -> vtdpkof, basjwp, pfvpb\n" +
            "lqqkjjr (36)\n" +
            "zzqwzy (48) -> cnbzj, vftqnj, mywezi\n" +
            "goyzt (22)\n" +
            "apghde (44)\n" +
            "ahrdgu (23) -> ismgnve, rwheyic\n" +
            "vqiqglo (95)\n" +
            "ruclz (25)\n" +
            "wuqbe (98)\n" +
            "nedbkp (49)\n" +
            "fpmipcr (40)\n" +
            "gadnfmt (81)\n" +
            "kxrfley (55)\n" +
            "thlbs (59) -> iqsvbk, tbyihc\n" +
            "wqvtdc (126) -> uyjre, dvkrlzc\n" +
            "omfvqhv (29) -> iorlbdv, fwddmmv\n" +
            "lihivo (81)\n" +
            "ligev (60)\n" +
            "iabqb (12)\n" +
            "zwjqar (71)\n" +
            "ddsqd (61)\n" +
            "wwvad (23) -> owzybm, gavjzk, gxobd\n" +
            "plhybj (48)\n" +
            "rgyamx (79)\n" +
            "trxgpy (82)\n" +
            "vzxvex (66)\n" +
            "favzt (69) -> qxfan, pyyuj, lhahl\n" +
            "atrmuc (1081) -> qrsgca, bhthbfj\n" +
            "mqrfbqc (9769) -> vbqtd, ykuto, mgktiii, iylwxgn\n" +
            "ihkcni (66)\n" +
            "ttxrd (54)\n" +
            "dvhbwl (64)\n" +
            "nlhxju (31)\n" +
            "kjwvqdz (140) -> zocaag, gszqlv\n" +
            "gulset (80)\n" +
            "vubst (114) -> giupn, vckqsrm\n" +
            "pvejq (52)\n" +
            "lhahl (34)\n" +
            "rqoczb (310) -> ropzx, xdsbnr\n" +
            "xhhhix (259)\n" +
            "ictdnyf (1551) -> ezfky, ckxblyq\n" +
            "jexvtb (15)\n" +
            "fmlhgs (103) -> ntjawca, jwpwt\n" +
            "fcymcb (17) -> mwelezd, jaoiiae\n" +
            "cepddei (195) -> ppymmsf, mcdmpq, tozwp\n" +
            "suzsw (28)\n" +
            "dlnyi (59)\n" +
            "nzrfhb (198) -> xwpwer, vjwlck\n" +
            "kmnjo (35)\n" +
            "itvhd (30)\n" +
            "tpbgp (11)\n" +
            "syykbn (127) -> teastj, ntazqjk\n" +
            "vhilqk (86)\n" +
            "ctpdk (31) -> yzciq, ljlotlp\n" +
            "putpp (92) -> pbrdt, ihkcni, sxdljm\n" +
            "peydhei (737) -> dojvyuv, nnogow, lwygknn, ndajgou\n" +
            "yzciq (99)\n" +
            "xmfzu (83)\n" +
            "plzgfx (98)\n" +
            "qckem (28)\n" +
            "kuakyv (77)\n" +
            "qpixldb (85)\n" +
            "nnjbjm (23) -> cgwnn, veclzy, rzqffr\n" +
            "nrkdm (200) -> dgtvwiy, qtbhnxr\n" +
            "xwkski (59)\n" +
            "mgktiii (827) -> ggbxd, gjfoe, qoapjhr\n" +
            "elusirt (106) -> appok, avhkram\n" +
            "ttkboa (24)\n" +
            "ckxblyq (71)\n" +
            "disan (18)\n" +
            "owresw (73)\n" +
            "pyuuxw (39)\n" +
            "hwsrjah (176) -> pvejq, cruxrmy, vjwivnq\n" +
            "skbprng (44)\n" +
            "lkyeyn (14)\n" +
            "mdtniv (82) -> eexkce, oiiagw\n" +
            "ljhezx (130) -> jpxogsl, pjnyxo\n" +
            "upsiumf (18)\n" +
            "glgrdm (14)\n" +
            "rvcmif (288) -> jdmjou, ddmrgzp\n" +
            "wvsspk (25) -> lqnwffm, edgplu, qyzja\n" +
            "umljkr (45)\n" +
            "ggbxd (67) -> jikpfbk, siqksje\n" +
            "kuujprz (67) -> ctatrbo, xibdlh, wyuwk, siflauk, iigqfh, jhwltnv\n" +
            "aklagd (201)\n" +
            "lprpgxe (65)\n" +
            "auvxopo (42)\n" +
            "uorika (69)\n" +
            "avbgwvm (81)\n" +
            "nnogow (96)\n" +
            "iybvphk (85)\n" +
            "sxapjc (129) -> peydhei, sehxgj, lgtffok\n" +
            "utrdhz (75)\n" +
            "nbvwta (153) -> bbviexo, pzgvdt\n" +
            "jzgpty (44)\n" +
            "qqzhz (32) -> eyreht, xxswgx\n" +
            "ropzx (8)\n" +
            "xaanoft (42) -> cwgrjoh, uorika, uobwwa\n" +
            "ybnpc (307) -> dibqua, ozfsktz, txrxyqh\n" +
            "cfvlt (753) -> rusayd, feiki, ucsxzhl\n" +
            "ruxuw (43)\n" +
            "ywpjusg (64) -> joxmxc, mzksj\n" +
            "qtcqtv (59)\n" +
            "qwddgc (82)\n" +
            "eyckbl (58)\n" +
            "lgsda (44) -> lcazsyd, mwdfwe, nnsial\n" +
            "tlvpv (36)\n" +
            "rlqwaz (901) -> sizfqfs, ehynj, wzjbp, vubst\n" +
            "fgbnlu (66)\n" +
            "zvmhx (105) -> tcsoaw, rtnpvf, lbkvgme, xtttnfp\n" +
            "oiiagw (44)\n" +
            "jpxogsl (30)\n" +
            "lomhz (78)\n" +
            "calvq (85) -> ccghjn, lpascsz, zkecjv\n" +
            "ljlotlp (99)\n" +
            "jqqxv (59)\n" +
            "iqzdu (187) -> itygd, cdvmqs\n" +
            "ugkey (86)\n" +
            "tjjrys (94)\n" +
            "dtjhnzr (85)\n" +
            "tqeeva (214) -> xwkski, rkjmp\n" +
            "tznkdt (12)\n" +
            "daiah (26)\n" +
            "cwgrjoh (69)\n" +
            "dibqua (24) -> rgyamx, gcichoe\n" +
            "scqutwb (94)\n" +
            "yeifw (71)\n" +
            "dyhate (18)\n" +
            "acgrw (44)\n" +
            "fndpz (18)\n" +
            "pynomi (170) -> kgzqclo, ygvkw\n" +
            "kcyiwqs (35) -> givljl, yntnjp\n" +
            "lbkvgme (223) -> jadome, dtwbpl, ktgfsm\n" +
            "ygvkw (71)\n" +
            "dgsutv (25)\n" +
            "rlywif (72)\n" +
            "nevpm (49)\n" +
            "xtttnfp (73) -> heumdl, axgpyq, utrdhz, paeea\n" +
            "ptmqo (284)\n" +
            "ibmcytl (11)\n" +
            "ejwno (80)\n" +
            "mcdmpq (19)\n" +
            "azvke (170) -> wscktm, jexvtb\n" +
            "govhrck (176) -> vuqriq, crfse, eoditdi\n" +
            "tzjzmmv (78)\n" +
            "dhjrv (48)\n" +
            "dlifqat (49)\n" +
            "ruhqn (94)\n" +
            "mhtzh (86)\n" +
            "bhhgpe (124) -> bywwy, xguqlvl\n" +
            "ucicsdu (199) -> itvizjy, wsnqied\n" +
            "agwyte (498) -> gcczhgd, lclbeiq, rgndu\n" +
            "gapjnb (200)\n" +
            "pitmcu (27)\n" +
            "vtdpkof (44)\n" +
            "joxmxc (68)\n" +
            "mclgebd (89)\n" +
            "refgrip (35)\n" +
            "hsxru (30) -> oeeqrsd, icdlpb, veycd, dlrpnot\n" +
            "jikpfbk (53)\n" +
            "usztpox (160) -> goyzt, eagggd\n" +
            "aqhcy (57)\n" +
            "umhcrc (174)\n" +
            "qwvvha (45)\n" +
            "crxnz (10)\n" +
            "mbmzme (37) -> qajpehv, dlifqat, bponwxc, hjzehyw\n" +
            "uyjre (22)\n" +
            "tsbbzu (22)\n" +
            "tenzzu (67)\n" +
            "ijvuozb (38)\n" +
            "oypzs (67)\n" +
            "ymxlwf (327) -> nzrfhb, wbogdd, fujgzbt, nqkwmyd, vgugdtt\n" +
            "dvgstr (87) -> rqhrb, xtvawvt, receu\n" +
            "yzuygum (57) -> oiysq, jibdphs\n" +
            "vuqriq (238)\n" +
            "lsysd (68)\n" +
            "meayff (35)\n" +
            "guztl (73) -> mrbqk, aoxtau\n" +
            "rtnpvf (177) -> pwsye, nevpm, nvxlr, smtbsys\n" +
            "zbqpk (112) -> apmpzd, yueoma\n" +
            "bbviexo (37)\n" +
            "gimkyms (21)\n" +
            "fjwmd (692) -> luayjsp, njqzaxg, ywgvsdb\n" +
            "igfhu (31)\n" +
            "qkhhg (105) -> yknwap, qqqsv\n" +
            "ybewhak (122)\n" +
            "xkizl (18)\n" +
            "siqksje (53)\n" +
            "vtbzq (178) -> tenzzu, ocpzltp\n" +
            "giblwzi (7)\n" +
            "atjtgjx (59)\n" +
            "bjlwfmo (49)\n" +
            "jibdphs (64)\n" +
            "cxlfgl (92)\n" +
            "wltlu (1495) -> swumt, qeosq, guhyk\n" +
            "lkqiqa (57)\n" +
            "qwlepd (44)\n" +
            "rmvry (145) -> ejzfwt, pknjpc, qfhkgt\n" +
            "xmpdevf (185) -> rjmdre, abcyotz\n" +
            "utwzg (10)\n" +
            "lpascsz (58)\n" +
            "abcyotz (21)\n" +
            "grqjew (73)\n" +
            "vindom (25)\n" +
            "tzmes (28)\n" +
            "ktwby (44)\n" +
            "gfsnsdu (38)\n" +
            "ywlub (66)\n" +
            "iryrfjs (31)\n" +
            "fwfpmti (34)\n" +
            "givljl (68)\n" +
            "edebwk (161) -> dtjhnzr, cipxwb, uqcqc\n" +
            "aziwd (48)\n" +
            "ajtjnwp (46) -> clfrs, qdwkxia\n" +
            "nvlqab (27)\n" +
            "dvwsrc (1517) -> jiyuw, dvtdje\n" +
            "basjwp (44)\n" +
            "rhchuf (67) -> sedysm, nedbkp\n" +
            "cdvmqs (57)\n" +
            "dkdovw (262) -> afglbpz, ovfduq\n" +
            "seeqikh (10944) -> mztuzb, zovbvcr, nnjbjm\n" +
            "bgcrdqu (174)\n" +
            "huqpiix (121) -> eptcqns, aiget\n" +
            "bywwy (74)\n" +
            "aujxmm (89)\n" +
            "xecqd (12)\n" +
            "tbppaj (94)\n" +
            "zkecjv (58)\n" +
            "utncpu (84)\n" +
            "grrycy (73)\n" +
            "htlpx (25)\n" +
            "pvtat (13)\n" +
            "dfdlzzt (71)\n" +
            "uwaij (16)\n" +
            "edgplu (94)\n" +
            "aflmt (153) -> puyiail, jaiqusy\n" +
            "eoditdi (10) -> boqtohm, odsrv, iblrer\n" +
            "imshim (39)\n" +
            "nioeugr (38)\n" +
            "eagggd (22)\n" +
            "ulznkvm (211) -> meayff, oqiye\n" +
            "psrzr (213) -> bwdfws, sdrhiyo\n" +
            "vmmww (69)\n" +
            "blofdav (18)\n" +
            "zbfyg (49) -> xoqxrbl, dgnpr\n" +
            "qzhyumq (25)\n" +
            "dpcmm (69)\n" +
            "qvmorke (57)\n" +
            "exuwhfs (89) -> qumahjn, kkvkz\n" +
            "rdqvi (56)\n" +
            "axlgwj (38)\n" +
            "vbxqhoy (744) -> nquonb, zhudrmb, ryxkvxj\n" +
            "rqlaf (67)\n" +
            "mlrdsj (107) -> tzdtm, etmvojh\n" +
            "tnzqj (1057) -> nbpic, ctgbkrb, bgcrdqu\n" +
            "lghygm (73)\n" +
            "wvjjht (60)\n" +
            "wmvht (36)\n" +
            "xibdlh (255) -> tgjdwlh, vyffcrm, ahridq\n" +
            "pjersb (86)\n" +
            "pdwesa (407) -> ximrdyg, xaebyo, qqpsrts, ucicsdu\n" +
            "tflulu (3299) -> ezcmm, tnzqj, njkeu, ctpjjsh\n" +
            "rmkhel (55) -> olkcm, yquqk, iuydxn\n" +
            "odsrv (76)\n" +
            "kfbsjv (73) -> ylxxmlt, whqvs, edmljb, bpptuqh, jwjggy, nrkdm\n" +
            "vywqra (18)\n" +
            "bnehbkl (14)\n" +
            "lkwapf (290) -> ttkboa, xvcikqe\n" +
            "kawloxz (45) -> rttwea, nmfvmam, kwkprrw, gxnoomf\n" +
            "drrvse (21)\n" +
            "tklfj (465) -> fcapw, omfvqhv, wgwlbz\n" +
            "receu (19)\n" +
            "zqdezgy (72)\n" +
            "ntkeax (91) -> sbgwln, fgbnlu\n" +
            "boqtohm (76)\n" +
            "rpcoxd (252)\n" +
            "hiqqg (82)\n" +
            "cdyhvr (28)\n" +
            "snkox (67) -> mspkmg, lxzucvk, zsqqhe, sgkksme\n" +
            "zpxqtrg (52)\n" +
            "olgsb (93)\n" +
            "hikocbe (92)\n" +
            "xwpwer (28)\n" +
            "kzfzp (67)\n" +
            "dfyyjta (33822) -> hvhjh, ujfeg, iayzdx\n" +
            "hvhjh (6551) -> uveybq, iqbrs, zrnnyet\n" +
            "kjpzwp (160) -> fmvyjwj, lsysd\n" +
            "htyyatf (240) -> fndpz, xtoaq, hhboca, llsvd\n" +
            "uveybq (947) -> ywpjusg, gapjnb, azvke\n" +
            "cqbvru (61)\n" +
            "saqjax (45)\n" +
            "emlqbo (18)\n" +
            "jvayv (171) -> daiah, fyjowg\n" +
            "dtnaqds (33)\n" +
            "rxuwet (92)\n" +
            "xnuoisk (64)\n" +
            "etmvojh (80)\n" +
            "eqnpvwk (36)\n" +
            "puyiail (18)\n" +
            "ijrzzr (77)\n" +
            "jfuxeo (150) -> xgnqi, dfzfwun\n" +
            "pzgvsxu (282) -> cltqhc, ruclz, vindom\n" +
            "tqpgc (1018) -> bbxbrsh, uwxbv, nlhxju, hazbs\n" +
            "nadbbgx (258) -> akoqk, izwze\n" +
            "qdwkxia (72)\n" +
            "rbqcbvl (88)\n" +
            "wutdi (38)\n" +
            "mlrjfy (38)\n" +
            "efxakc (154) -> dfaro, lcsqgx\n" +
            "dacbtyf (57)\n" +
            "mevea (303) -> qaxvec, esiwujq, plzfjy\n" +
            "dsxhhub (12)\n" +
            "wjzyxt (252)\n" +
            "pnoxhe (27) -> vjqjwk, enpprra, ftmwqqj\n" +
            "kkvkz (71)\n" +
            "clfrs (72)\n" +
            "zovbvcr (383) -> diyvlug, xhodnx, repak, zjfrc\n" +
            "jwjggy (210) -> duvrzrl, zsxbg\n" +
            "xjfkrjs (33) -> ibzalz, rxuwet\n" +
            "gtvnow (180) -> euvev, kvbdsv\n" +
            "etfuhz (123) -> zoicqbj, ajvtdl, wmvht\n" +
            "afglbpz (16)\n" +
            "nquonb (50) -> avbgwvm, lihivo\n" +
            "nbpic (148) -> iuoxs, yxvgj\n" +
            "eivrwbt (17) -> yeifw, podcsx, fhoprd, beeeaye\n" +
            "gszqlv (38)\n" +
            "yhycc (121) -> vwkbje, qzhyumq\n" +
            "gjzddf (38)\n" +
            "cxpoqyu (72)\n" +
            "emdsyso (89)\n" +
            "qqpsrts (85) -> doudbv, mmzdk\n" +
            "gjwuf (124) -> bjlwfmo, evubadn\n" +
            "hkhsc (171) -> ipwxws, yrdgv, ckswvj, yjlrwzu, ptmqo, ojishwt, drzrtpi\n" +
            "mwtojre (207) -> hmetm, utbev, wltlu, ictdnyf\n" +
            "fqoqkzk (12)\n" +
            "nkhzrd (5)\n" +
            "enpprra (76)\n" +
            "gwcig (75)\n" +
            "uqcpah (91)\n" +
            "koued (75) -> kxrfley, tjnyo\n" +
            "dtxrjg (22)\n" +
            "pnkag (93) -> ofoto, zzqwzy, zobjfxe, blutjw, aisfhs, gmoliax\n" +
            "iucuw (99) -> gulset, drrjnr\n" +
            "fhsecp (17)\n" +
            "dgrwv (62)\n" +
            "ibzalz (92)\n" +
            "tbyihc (73)\n" +
            "cleanrs (10)\n" +
            "cibfe (27)\n" +
            "ycvvjgc (28)\n" +
            "dnphyfm (7185) -> mpulnxr, sxegjbz, tklfj\n" +
            "xnxdmdb (26)\n" +
            "jniisu (34)\n" +
            "eaqiocy (93) -> dywjt, kikfs, fpmipcr\n" +
            "bugtxto (26)\n" +
            "pprkvq (26)\n" +
            "myznok (57)\n" +
            "iblrer (76)\n" +
            "bhmzx (64) -> tgoeoh, ojxyv\n" +
            "yibxqhs (52)\n" +
            "xoqxrbl (93)\n" +
            "hoeqoas (99)\n" +
            "oxvfpna (222)\n" +
            "okbzzwd (73)\n" +
            "yhecio (65)\n" +
            "esgqip (62)\n" +
            "zwofu (30)\n" +
            "nnyqes (49)\n" +
            "yydyjr (66)\n" +
            "ztzfled (70)\n" +
            "yvqasth (1018) -> lfksu, xszci\n" +
            "eqbvn (153) -> plhybj, kozgi\n" +
            "hqmum (79) -> dfdlzzt, ulndqey, zwjqar, jhxxfq\n" +
            "gvayfu (64) -> cfvbuip, rbtvx\n" +
            "fsagr (141) -> lugkrb, npqroe\n" +
            "pfvpb (44)\n" +
            "cvdjts (271) -> zmces, ugkey\n" +
            "bcjpzpk (174)\n" +
            "jxykl (54)\n" +
            "mwdfwe (78)\n" +
            "diyvlug (133) -> ddsqd, txeucf\n" +
            "wbeizj (35)\n" +
            "xxswgx (45)\n" +
            "wfdxfxq (676) -> irrpz, wvsspk, dqtthnn\n" +
            "lcsqgx (8)\n" +
            "lmvmb (93)\n" +
            "cyvplfd (14)\n" +
            "olkcm (131) -> mkdiuil, msbsjpj\n" +
            "kloumi (39)\n" +
            "xzwjii (63)\n" +
            "zmjfa (82)\n" +
            "fakyd (842) -> sgtfap, frbmr, rhchuf\n" +
            "jgzvrf (173) -> hspol, vbpde\n" +
            "slfile (66)\n" +
            "jwpwt (63)\n" +
            "xhodnx (67) -> estwket, tjjrys\n" +
            "ihrhkj (11)\n" +
            "wlkatbq (188)\n" +
            "cijfsu (68)\n" +
            "ipqjff (62)\n" +
            "ztaff (6)\n" +
            "eecoekq (41)\n" +
            "oaxskk (266) -> azwmkej, rciilr\n" +
            "sedysm (49)\n" +
            "jhwltnv (19) -> akluijb, zvtxa, pvpmt, bkqexxz\n" +
            "xhqgsro (6)\n" +
            "bmdxyf (318) -> zgslahq, koued, yzuygum\n" +
            "dmyzfr (18)\n" +
            "rqrfl (65)\n" +
            "clmyzsu (115) -> mlrjfy, xiawjb, kroqr\n" +
            "rusayd (901) -> ylkfgx, lxsurts\n" +
            "tzdtm (80)\n" +
            "dpetvw (71)\n" +
            "eccwi (6)\n" +
            "wdssrl (75)\n" +
            "uofigyp (9)\n" +
            "aisfhs (183) -> lylaoh, fujwzoc, kobcmy\n" +
            "dcgarog (15)\n" +
            "eosuf (69)\n" +
            "qeosq (66)\n" +
            "itxaax (77)\n" +
            "mmzdk (77)\n" +
            "dvtdje (40)\n" +
            "aumbaa (28)\n" +
            "wdivd (26)\n" +
            "eemfgbx (17)\n" +
            "dlrpnot (62)\n" +
            "ugxls (62)\n" +
            "qqqsv (98)\n" +
            "lfhaqdn (27)\n" +
            "qblnh (45)\n" +
            "yknwap (98)\n" +
            "ipogzy (76)\n" +
            "irhxzg (124) -> utwzg, crxnz\n" +
            "dtwbpl (50)\n" +
            "lqnwffm (94)\n" +
            "ygnww (13)\n" +
            "xrkca (217) -> xhqgsro, avymjz\n" +
            "qrsgca (35)\n" +
            "ftgvx (14)\n" +
            "fhoaub (35)\n" +
            "nuuqqqy (94)\n" +
            "ppmvpn (94)\n" +
            "kisjb (57)\n" +
            "owzybm (91)\n" +
            "jwddn (134) -> vfosh, nvdon, kopmae, inhqoxd, xlyvge\n" +
            "cnbzj (141) -> kuakyv, vnsrv, ijrzzr, dbrnqc\n" +
            "wlleabp (179)\n" +
            "lhdhko (66)\n" +
            "bbsuv (439) -> ionnpk, etfuhz, mobbhp, exuwhfs\n" +
            "umvvwsq (10)\n" +
            "eibtll (94)\n" +
            "otuwt (35) -> ejwno, zogylog, ooiyeep\n" +
            "epqsj (137) -> bugtxto, hsnbry\n" +
            "yuepckc (66) -> tqpgc, pstaxvr, owtxsq\n" +
            "dhzuvup (76)\n" +
            "crfse (238)\n" +
            "ibcbvy (6)\n" +
            "cefbp (78)\n" +
            "uhxjy (63)\n" +
            "bponwxc (49)\n" +
            "mcxki (29) -> rvcmif, gnozwfo, mevea, vtvku, dmtzxui\n" +
            "emqoxss (66) -> tnyjkok, gmpqmio\n" +
            "ionnpk (97) -> rqlaf, ktrkhe\n" +
            "gasnep (91) -> qgwcfll, nkcet\n" +
            "avymjz (6)\n" +
            "fetns (37) -> zfmeblt, jtsyj, rdqvi\n" +
            "altsh (89) -> zdvai, iybvphk\n" +
            "kgjcj (242)\n" +
            "bltmlm (93) -> xdlvys, tflulu, xqrmgdk, dnphyfm, kwbni, uplbokf, vbsfwqh\n" +
            "hikik (15)\n" +
            "nnofr (71) -> xxrsnzv, pucsbv, rtzce, kloumi\n" +
            "siflauk (271) -> qckem, tzmes\n" +
            "nkcet (95)\n" +
            "ijjfn (34)\n" +
            "itvizjy (20)\n" +
            "numadl (98)\n" +
            "jkjsi (98)\n" +
            "xaebyo (41) -> svadhfo, hoeqoas\n" +
            "yntnjp (68)\n" +
            "axgpyq (75)\n" +
            "civozek (98)\n" +
            "djizg (33)\n" +
            "qrtdtt (96)\n" +
            "kopmae (13) -> pemna, vuzsg, numadl, wuqbe\n" +
            "yztqpc (572) -> xxsivgz, scbycx, jwezuh\n" +
            "msbsjpj (96)\n" +
            "yjlrwzu (77) -> mbydswv, tfzum, kwhwph\n" +
            "tcpqh (15)\n" +
            "fkqkfdu (25)\n" +
            "vbqtd (86) -> cepddei, rcxtjte, zkibug, wjzyxt, zhgzg\n" +
            "wmcusr (14)\n" +
            "zrnnyet (731) -> zbqpk, tayyz, usztpox, mewfm\n" +
            "yadtxl (73)\n" +
            "eqctwan (511) -> zitfb, xjfkrjs, xddom\n" +
            "evmuxia (32)\n" +
            "lbhxdbr (36)\n" +
            "fjvoff (62)\n" +
            "wsnqied (20)\n" +
            "vftqnj (57) -> dvopaww, hbvvse, plzgfx, jkjsi\n" +
            "pwwqvhw (34) -> fgnsyw, pyuuxw, nsbvvsi, imshim\n" +
            "hnjbsg (32)\n" +
            "pglpu (224) -> oxvfpna, umqrwk, bhmzx\n" +
            "etcces (4977) -> eqctwan, jncex, zofljd\n" +
            "fmvyjwj (68)\n" +
            "lgtffok (509) -> ruild, bxpfop, huqpiix, tgksxw\n" +
            "iqmqju (3619) -> oxnfnsv, bngres, zkhll\n" +
            "xvcikqe (24)\n" +
            "wvpwez (89)\n" +
            "saijc (96)\n" +
            "aiget (16)\n" +
            "fdjhpq (66)\n" +
            "adcbil (47)\n" +
            "lrnjjfq (17)\n" +
            "teastj (53)\n" +
            "csybv (33546) -> kdtpg, wseyo, etcces, pnkag\n" +
            "zkibug (238) -> xkfps, giblwzi\n" +
            "pzahn (73)\n" +
            "auzded (499) -> tqeeva, fyrqw, oaxskk, hwsrjah, jfqanu\n" +
            "bhthbfj (35)\n" +
            "dvkrlzc (22)\n" +
            "dgrfhvi (67)\n" +
            "qcghv (67) -> ezkqh, uqcpah\n" +
            "sdrhiyo (27)\n" +
            "kwhwph (69)\n" +
            "ejzfwt (52)\n" +
            "vuzsg (98)\n" +
            "tgoeoh (79)\n" +
            "vrpqev (64) -> axlgwj, gfsnsdu, kpdbki, mvqfvit\n" +
            "vrydu (43)\n" +
            "vnsrv (77)\n" +
            "gjfoe (161) -> mcduoz, eccwi\n" +
            "ppgaoz (65) -> pejmc, cbwbdsv, otuwt\n" +
            "xddom (39) -> aujxmm, fjrpc\n" +
            "lxsurts (6)\n" +
            "tayyz (50) -> vtzdfjg, ijvux\n" +
            "kwzrzn (71)\n" +
            "doudbv (77)\n" +
            "ahridq (24)\n" +
            "dqtthnn (217) -> hgsng, jwzmsv\n" +
            "haeymgy (85)\n" +
            "zoicqbj (36)\n" +
            "bcjxhps (58)\n" +
            "swumt (66)\n" +
            "iywwyn (43)\n" +
            "pirieql (92)\n" +
            "ntazqjk (53)\n" +
            "ajwxaa (208) -> wtvffu, gmdcbyg, intuzzk\n" +
            "wscktm (15)\n" +
            "itygd (57)\n" +
            "hjzehyw (49)\n" +
            "jdmjou (69)\n" +
            "iavuhwe (49)\n" +
            "tpfuxx (26)\n" +
            "wseyo (5904) -> beraoor, zbhwrc, ybnpc\n" +
            "rlapq (322) -> adcbil, rbfbf\n" +
            "jtsyj (56)\n" +
            "zouml (199) -> dmyzfr, udjcwm\n" +
            "txrxyqh (107) -> rdufpid, yhunajf, dgsutv\n" +
            "zobjfxe (525) -> ylbpwah, nadbbgx, putpp\n" +
            "inhqoxd (327) -> cdafdq, zucsr, pprkvq\n" +
            "ndajgou (96)\n" +
            "paeea (75)\n" +
            "yrdgv (284)\n" +
            "sbcuc (65)\n" +
            "aklrjg (10)\n" +
            "kbjnzw (117) -> xtzqooh, lfhaqdn\n" +
            "cfafhwl (34)\n" +
            "htyeqf (94)\n" +
            "dmiqf (62)\n" +
            "tghoyv (210) -> iywwyn, gypsfc\n" +
            "plxdglq (24)\n" +
            "qxwlhxh (41)\n" +
            "pknjpc (52)\n" +
            "njqzaxg (23) -> saijc, jmbiky\n" +
            "tckcxhb (68) -> yfzjc, nwjibjk, igfhu, iryrfjs\n" +
            "xdlvys (3528) -> zcjrk, wkrtcw, kuujprz\n" +
            "dcngdo (47)\n" +
            "pazbvum (57)\n" +
            "kvags (67)\n" +
            "nuuwbui (35)\n" +
            "whcxfwf (115) -> vrydu, ruxuw\n" +
            "ojishwt (126) -> llcbiqi, namzy\n" +
            "uwxbv (31)\n" +
            "vrqeade (102) -> emlqbo, vywqra, upsiumf, blofdav\n" +
            "rixge (338)\n" +
            "dmtzxui (98) -> auhio, qwddgc, hiqqg, iezdimc\n" +
            "texfyi (144)\n" +
            "cgwnn (384) -> nioeugr, gjzddf\n" +
            "mwzaxaj (59) -> csybv, febjzqn, bltmlm, dfyyjta, ljaktj, vmyda, vbcfe\n" +
            "yquqk (83) -> wvjjht, edyqn, frleu, puxaz\n" +
            "jaoiiae (81)\n" +
            "pucsbv (39)";

    public void execute() {

        buildTree();
        setChildren();
        setParent();
        System.out.print(findParentless());

    }

    private void buildTree() {
        StringBuilder currentElement = new StringBuilder();

        char action = 'n';
        Program program = new Program();

        for (int i = 0; i < input.length(); i++) {
            Character currentCharacter = input.charAt(i);

            switch (action){
                case 'n':

                    if(currentCharacter == ' '){
                        program = new Program();
                        program.name = currentElement.toString();
                        currentElement.delete(0, currentElement.length());
                        i++;
                        action = 'w';
                        break;
                    }
                    currentElement.append(currentCharacter);
                    continue;

                case 'w':

                    if(currentCharacter == ')'){
                        program.weight = Integer.valueOf(currentElement.toString());
                        currentElement.delete(0, currentElement.length());
                        i++;

                        if( i == input.length() || input.charAt(i) == '\n'){
                            programList.add(program);
                            action = 'n';
                        }
                        else{
                            i+=3;
                            action = 'p';
                        }
                        break;
                    }
                    currentElement.append(currentCharacter);
                    continue;

                case 'p':

                    if(i == input.length() || currentCharacter == '\n'){
                        program.childrenName.add(currentElement.toString());
                        currentElement.delete(0, currentElement.length());
                        programList.add(program);
                        action = 'n';
                        continue;
                    }

                    if(currentCharacter == ','){
                        program.childrenName.add(currentElement.toString());
                        currentElement.delete(0, currentElement.length());
                        i++;
                        continue;
                    }

                    currentElement.append(currentCharacter);
            }
        }
    }

    private void setChildren(){
        //For each program
        for(int i = 0; i < programList.size(); i++){
            Program currentProgram = programList.get(i);

            if(currentProgram.hasChildren()){
                //For each children it contains
                for(int j = 0; j < currentProgram.childrenName.size(); j++){
                    String currentChildrenName = currentProgram.childrenName.get(j);

                    //Iterate remaining programs to find the correct one
                    for(int k = 0; k < programList.size(); k++){
                        if(currentChildrenName.equals(programList.get(k).name)) {
                            currentProgram.children.add(programList.get(k));
                            break;
                        }
                    }
                }
            }
        }
    }

    private void setParent() {
        for (int i = 0; i < programList.size(); i++) {
            for( int j = 0; j < programList.get(i).children.size(); j++){
                programList.get(i).children.get(j).parent= programList.get(i);
            }
        }
    }

    private String findParentless(){

        for(Program program : programList){
            if( program.parent == null)
                return program.name;
        }
        return new String();
    }

}
