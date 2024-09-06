package src.characters;

import java.util.List;

import src.controllers.Features;

public class UniversoMarvelPersonagens {
        public static void adicionarPersonagens(List<Features> listaPersonagens) {
                Features homemDeFerro = new Features("Tony Stark (Homem De Ferro)", "masculino", true, false,
                                "", "heroi",
                                "protagonista", false, true, "tecnologia",
                                true, true, true,
                                false, "humano", false, false,
                                true, true, "");

                homemDeFerro.addSpecificAttribute("UniversoMarvel", true);
                homemDeFerro.addSpecificAttribute("vingador", true);
                homemDeFerro.addSpecificAttribute("traje", true);
                homemDeFerro.addSpecificAttribute("wakanda", false);
                homemDeFerro.addSpecificAttribute("xmen", false);
                homemDeFerro.addSpecificAttribute("regeneracao", false);
                homemDeFerro.addSpecificAttribute("controleMetal", false);
                homemDeFerro.addSpecificAttribute("capacete", true);
                homemDeFerro.addSpecificAttribute("telepatia", false);
                homemDeFerro.addSpecificAttribute("telecinese", false);
                homemDeFerro.addSpecificAttribute("voar", true);
                homemDeFerro.addSpecificAttribute("absorverEnergia", true);
                homemDeFerro.addSpecificAttribute("inteligenciaArtificial", true);
                homemDeFerro.addSpecificAttribute("manipulacaoRealidade", false);
                homemDeFerro.addSpecificAttribute("agilidadeAprimorada", false);
                homemDeFerro.addSpecificAttribute("realeza", false);
                homemDeFerro.addSpecificAttribute("raiosGama", false);
                homemDeFerro.addSpecificAttribute("shield", false);
                homemDeFerro.addSpecificAttribute("treinamentoEspecial", true);
                homemDeFerro.addSpecificAttribute("superSoldado", false);
                homemDeFerro.addSpecificAttribute("bilionario", true);
                homemDeFerro.addSpecificAttribute("patriota", true);
                homemDeFerro.addSpecificAttribute("combateCorpoACorpo", false);
                homemDeFerro.addSpecificAttribute("artesMarciais", false);
                homemDeFerro.addSpecificAttribute("forcaDivina", false);
                homemDeFerro.addSpecificAttribute("manipulacaoDeEnergia", true);
                homemDeFerro.addSpecificAttribute("fazerFeitico", false);
                homemDeFerro.addSpecificAttribute("Maguinetismo", false);

                Features capitaoAmerica = new Features("Steve Rogers (Capitão América)", "masculino", false, false,
                                "", "heroi",
                                "protagonista", false, true, "força",
                                true, false, true,
                                false, "humano", false, false,
                                false, false, "");

                capitaoAmerica.addSpecificAttribute("UniversoMarvel", true);
                capitaoAmerica.addSpecificAttribute("vingador", true);
                capitaoAmerica.addSpecificAttribute("traje", true);
                capitaoAmerica.addSpecificAttribute("wakanda", false);
                capitaoAmerica.addSpecificAttribute("xmen", false);
                capitaoAmerica.addSpecificAttribute("regeneracao", true);
                capitaoAmerica.addSpecificAttribute("controleMetal", false);
                capitaoAmerica.addSpecificAttribute("capacete", false);
                capitaoAmerica.addSpecificAttribute("telepatia", false);
                capitaoAmerica.addSpecificAttribute("telecinese", false);
                capitaoAmerica.addSpecificAttribute("voar", false);
                capitaoAmerica.addSpecificAttribute("absorverEnergia", false);
                capitaoAmerica.addSpecificAttribute("inteligenciaArtificial", false);
                capitaoAmerica.addSpecificAttribute("manipulacaoRealidade", false);
                capitaoAmerica.addSpecificAttribute("agilidadeAprimorada", true);
                capitaoAmerica.addSpecificAttribute("realeza", false);
                capitaoAmerica.addSpecificAttribute("raiosGama", false);
                capitaoAmerica.addSpecificAttribute("shield", true);
                capitaoAmerica.addSpecificAttribute("treinamentoEspecial", true);
                capitaoAmerica.addSpecificAttribute("superSoldado", true);
                capitaoAmerica.addSpecificAttribute("bilionario", false);
                capitaoAmerica.addSpecificAttribute("patriota", true);
                capitaoAmerica.addSpecificAttribute("combateCorpoACorpo", true);
                capitaoAmerica.addSpecificAttribute("artesMarciais", true);
                capitaoAmerica.addSpecificAttribute("forcaDivina", false);
                capitaoAmerica.addSpecificAttribute("manipulacaoDeEnergia", false);
                capitaoAmerica.addSpecificAttribute("fazerFeitico", false);
                capitaoAmerica.addSpecificAttribute("Maguinetismo", false);

                Features thor = new Features("Thor", "masculino", false, true, "", "heroi",
                                "protagonista", false, true, "trovão",
                                true, false, false,
                                false, "asgardiano", false, false,
                                true, true, "");

                thor.addSpecificAttribute("UniversoMarvel", true);
                thor.addSpecificAttribute("vingador", true);
                thor.addSpecificAttribute("traje", true);
                thor.addSpecificAttribute("wakanda", false);
                thor.addSpecificAttribute("xmen", false);
                thor.addSpecificAttribute("regeneracao", true);
                thor.addSpecificAttribute("controleMetal", false);
                thor.addSpecificAttribute("capacete", true);
                thor.addSpecificAttribute("telepatia", false);
                thor.addSpecificAttribute("telecinese", false);
                thor.addSpecificAttribute("voar", true);
                thor.addSpecificAttribute("absorverEnergia", true);
                thor.addSpecificAttribute("inteligenciaArtificial", false);
                thor.addSpecificAttribute("manipulacaoRealidade", false);
                thor.addSpecificAttribute("agilidadeAprimorada", true);
                thor.addSpecificAttribute("realeza", true);
                thor.addSpecificAttribute("raiosGama", false);
                thor.addSpecificAttribute("shield", false);
                thor.addSpecificAttribute("treinamentoEspecial", true);
                thor.addSpecificAttribute("superSoldado", false);
                thor.addSpecificAttribute("bilionario", false);
                thor.addSpecificAttribute("patriota", false);
                thor.addSpecificAttribute("combateCorpoACorpo", true);
                thor.addSpecificAttribute("artesMarciais", true);
                thor.addSpecificAttribute("forcaDivina", true);
                thor.addSpecificAttribute("manipulacaoDeEnergia", true);
                thor.addSpecificAttribute("fazerFeitico", false);
                thor.addSpecificAttribute("Maguinetismo", false);

                Features hulk = new Features("Bruce Banner (Hulk)", "masculino", false, false, "", "heroi",
                                "co-protagonista", true, true, "força",
                                true, true, false,
                                false, "humano", false, false,
                                false, false, "");

                hulk.addSpecificAttribute("UniversoMarvel", true);
                hulk.addSpecificAttribute("vingador", true);
                hulk.addSpecificAttribute("traje", false);
                hulk.addSpecificAttribute("wakanda", false);
                hulk.addSpecificAttribute("xmen", false);
                hulk.addSpecificAttribute("regeneracao", true);
                hulk.addSpecificAttribute("controleMetal", false);
                hulk.addSpecificAttribute("capacete", false);
                hulk.addSpecificAttribute("telepatia", false);
                hulk.addSpecificAttribute("telecinese", false);
                hulk.addSpecificAttribute("voar", false);
                hulk.addSpecificAttribute("absorverEnergia", false);
                hulk.addSpecificAttribute("inteligenciaArtificial", false);
                hulk.addSpecificAttribute("manipulacaoRealidade", false);
                hulk.addSpecificAttribute("agilidadeAprimorada", true);
                hulk.addSpecificAttribute("realeza", false);
                hulk.addSpecificAttribute("raiosGama", true);
                hulk.addSpecificAttribute("shield", false);
                hulk.addSpecificAttribute("treinamentoEspecial", false);
                hulk.addSpecificAttribute("superSoldado", true);
                hulk.addSpecificAttribute("bilionario", false);
                hulk.addSpecificAttribute("patriota", false);
                hulk.addSpecificAttribute("combateCorpoACorpo", true);
                hulk.addSpecificAttribute("artesMarciais", false);
                hulk.addSpecificAttribute("forcaDivina", true);
                hulk.addSpecificAttribute("manipulacaoDeEnergia", false);
                hulk.addSpecificAttribute("fazerFeitico", false);
                hulk.addSpecificAttribute("Maguinetismo", false);

                Features viuvaNegra = new Features("Natasha Romanoff (Viúva Negra)", "feminino", false, false, "",
                                "heroi",
                                "co-protagonista", false, true, "habilidades de espionagem",
                                true, true, true,
                                false, "humano", false, false,
                                false, false, "");

                viuvaNegra.addSpecificAttribute("UniversoMarvel", true);
                viuvaNegra.addSpecificAttribute("vingador", true);
                viuvaNegra.addSpecificAttribute("traje", true);
                viuvaNegra.addSpecificAttribute("wakanda", false);
                viuvaNegra.addSpecificAttribute("xmen", false);
                viuvaNegra.addSpecificAttribute("regeneracao", false);
                viuvaNegra.addSpecificAttribute("controleMetal", false);
                viuvaNegra.addSpecificAttribute("capacete", false);
                viuvaNegra.addSpecificAttribute("telepatia", false);
                viuvaNegra.addSpecificAttribute("telecinese", false);
                viuvaNegra.addSpecificAttribute("voar", false);
                viuvaNegra.addSpecificAttribute("absorverEnergia", false);
                viuvaNegra.addSpecificAttribute("inteligenciaArtificial", false);
                viuvaNegra.addSpecificAttribute("manipulacaoRealidade", false);
                viuvaNegra.addSpecificAttribute("agilidadeAprimorada", true);
                viuvaNegra.addSpecificAttribute("realeza", false);
                viuvaNegra.addSpecificAttribute("raiosGama", false);
                viuvaNegra.addSpecificAttribute("shield", true);
                viuvaNegra.addSpecificAttribute("treinamentoEspecial", true);
                viuvaNegra.addSpecificAttribute("superSoldado", false);
                viuvaNegra.addSpecificAttribute("bilionario", false);
                viuvaNegra.addSpecificAttribute("patriota", false);
                viuvaNegra.addSpecificAttribute("combateCorpoACorpo", true);
                viuvaNegra.addSpecificAttribute("artesMarciais", true);
                viuvaNegra.addSpecificAttribute("forcaDivina", false);
                viuvaNegra.addSpecificAttribute("manipulacaoDeEnergia", false);
                viuvaNegra.addSpecificAttribute("fazerFeitico", false);
                viuvaNegra.addSpecificAttribute("Maguinetismo", false);

                Features gaviaoArqueiro = new Features("Clint Barton (Gavião Arqueiro)", "masculino", true, false,
                                "", "heroi",
                                "coadjuvante", false, true, "precisão",
                                true, true, true,
                                false, "humano", false, false,
                                false, false, "");

                gaviaoArqueiro.addSpecificAttribute("UniversoMarvel", true);
                gaviaoArqueiro.addSpecificAttribute("vingador", true);
                gaviaoArqueiro.addSpecificAttribute("traje", true);
                gaviaoArqueiro.addSpecificAttribute("wakanda", false);
                gaviaoArqueiro.addSpecificAttribute("xmen", false);
                gaviaoArqueiro.addSpecificAttribute("regeneracao", false);
                gaviaoArqueiro.addSpecificAttribute("controleMetal", false);
                gaviaoArqueiro.addSpecificAttribute("capacete", false);
                gaviaoArqueiro.addSpecificAttribute("telepatia", false);
                gaviaoArqueiro.addSpecificAttribute("telecinese", false);
                gaviaoArqueiro.addSpecificAttribute("voar", false);
                gaviaoArqueiro.addSpecificAttribute("absorverEnergia", false);
                gaviaoArqueiro.addSpecificAttribute("inteligenciaArtificial", false);
                gaviaoArqueiro.addSpecificAttribute("manipulacaoRealidade", false);
                gaviaoArqueiro.addSpecificAttribute("agilidadeAprimorada", true);
                gaviaoArqueiro.addSpecificAttribute("realeza", false);
                gaviaoArqueiro.addSpecificAttribute("raiosGama", false);
                gaviaoArqueiro.addSpecificAttribute("shield", false);
                gaviaoArqueiro.addSpecificAttribute("treinamentoEspecial", true);
                gaviaoArqueiro.addSpecificAttribute("superSoldado", false);
                gaviaoArqueiro.addSpecificAttribute("bilionario", false);
                gaviaoArqueiro.addSpecificAttribute("patriota", true);
                gaviaoArqueiro.addSpecificAttribute("combateCorpoACorpo", true);
                gaviaoArqueiro.addSpecificAttribute("artesMarciais", true);
                gaviaoArqueiro.addSpecificAttribute("forcaDivina", false);
                gaviaoArqueiro.addSpecificAttribute("manipulacaoDeEnergia", false);
                gaviaoArqueiro.addSpecificAttribute("fazerFeitico", false);
                gaviaoArqueiro.addSpecificAttribute("Maguinetismo", false);

                Features feiticeiraEscarlate = new Features("Wanda Maximoff (Feiticeira Escarlate)", "feminino", false,
                                true, "",
                                "heroi",
                                "co-protagonista", false, true, "magia",
                                true, false, false,
                                false, "mutante", false, false,
                                false, false, "");

                feiticeiraEscarlate.addSpecificAttribute("UniversoMarvel", true);
                feiticeiraEscarlate.addSpecificAttribute("vingador", true);
                feiticeiraEscarlate.addSpecificAttribute("traje", true);
                feiticeiraEscarlate.addSpecificAttribute("wakanda", false);
                feiticeiraEscarlate.addSpecificAttribute("xmen", false);
                feiticeiraEscarlate.addSpecificAttribute("regeneracao", false);
                feiticeiraEscarlate.addSpecificAttribute("controleMetal", false);
                feiticeiraEscarlate.addSpecificAttribute("capacete", false);
                feiticeiraEscarlate.addSpecificAttribute("telepatia", true);
                feiticeiraEscarlate.addSpecificAttribute("telecinese", true);
                feiticeiraEscarlate.addSpecificAttribute("voar", true);
                feiticeiraEscarlate.addSpecificAttribute("absorverEnergia", false);
                feiticeiraEscarlate.addSpecificAttribute("inteligenciaArtificial", false);
                feiticeiraEscarlate.addSpecificAttribute("manipulacaoRealidade", true);
                feiticeiraEscarlate.addSpecificAttribute("agilidadeAprimorada", false);
                feiticeiraEscarlate.addSpecificAttribute("realeza", false);
                feiticeiraEscarlate.addSpecificAttribute("raiosGama", false);
                feiticeiraEscarlate.addSpecificAttribute("shield", false);
                feiticeiraEscarlate.addSpecificAttribute("treinamentoEspecial", false);
                feiticeiraEscarlate.addSpecificAttribute("superSoldado", false);
                feiticeiraEscarlate.addSpecificAttribute("bilionario", false);
                feiticeiraEscarlate.addSpecificAttribute("patriota", false);
                feiticeiraEscarlate.addSpecificAttribute("combateCorpoACorpo", false);
                feiticeiraEscarlate.addSpecificAttribute("artesMarciais", false);
                feiticeiraEscarlate.addSpecificAttribute("forcaDivina", false);
                feiticeiraEscarlate.addSpecificAttribute("manipulacaoDeEnergia", true);
                feiticeiraEscarlate.addSpecificAttribute("fazerFeitico", true);
                feiticeiraEscarlate.addSpecificAttribute("Maguinetismo", false);

                Features visao = new Features("Visao", "masculino", false, false, "", "heroi",
                                "coadjuvante", true, true, "densidade variável",
                                true, true, true,
                                false, "android", false, false,
                                false, false, "");

                visao.addSpecificAttribute("UniversoMarvel", true);
                visao.addSpecificAttribute("vingador", true);
                visao.addSpecificAttribute("traje", false);
                visao.addSpecificAttribute("wakanda", false);
                visao.addSpecificAttribute("xmen", false);
                visao.addSpecificAttribute("regeneracao", true);
                visao.addSpecificAttribute("controleMetal", false);
                visao.addSpecificAttribute("capacete", false);
                visao.addSpecificAttribute("telepatia", true);
                visao.addSpecificAttribute("telecinese", true);
                visao.addSpecificAttribute("voar", true);
                visao.addSpecificAttribute("absorverEnergia", true);
                visao.addSpecificAttribute("inteligenciaArtificial", true);
                visao.addSpecificAttribute("manipulacaoRealidade", false);
                visao.addSpecificAttribute("agilidadeAprimorada", true);
                visao.addSpecificAttribute("realeza", false);
                visao.addSpecificAttribute("raiosGama", false);
                visao.addSpecificAttribute("shield", false);
                visao.addSpecificAttribute("treinamentoEspecial", false);
                visao.addSpecificAttribute("superSoldado", false);
                visao.addSpecificAttribute("bilionario", false);
                visao.addSpecificAttribute("patriota", false);
                visao.addSpecificAttribute("combateCorpoACorpo", true);
                visao.addSpecificAttribute("artesMarciais", true);
                visao.addSpecificAttribute("forcaDivina", false);
                visao.addSpecificAttribute("manipulacaoDeEnergia", true);
                visao.addSpecificAttribute("fazerFeitico", false);
                visao.addSpecificAttribute("Maguinetismo", false);

                Features homemAranha = new Features("Homem aranha", "masculino", false, false, "", "heroi",
                                "protagonista", false, true, "agilidade aracnídea",
                                true, true, false,
                                false, "humano", true, false,
                                false, false, "");

                homemAranha.addSpecificAttribute("UniversoMarvel", true);
                homemAranha.addSpecificAttribute("vingador", true);
                homemAranha.addSpecificAttribute("traje", true);
                homemAranha.addSpecificAttribute("wakanda", false);
                homemAranha.addSpecificAttribute("xmen", false);
                homemAranha.addSpecificAttribute("regeneracao", true);
                homemAranha.addSpecificAttribute("controleMetal", false);
                homemAranha.addSpecificAttribute("capacete", false);
                homemAranha.addSpecificAttribute("telepatia", false);
                homemAranha.addSpecificAttribute("telecinese", false);
                homemAranha.addSpecificAttribute("voar", false);
                homemAranha.addSpecificAttribute("absorverEnergia", false);
                homemAranha.addSpecificAttribute("inteligenciaArtificial", false);
                homemAranha.addSpecificAttribute("manipulacaoRealidade", false);
                homemAranha.addSpecificAttribute("agilidadeAprimorada", true);
                homemAranha.addSpecificAttribute("realeza", false);
                homemAranha.addSpecificAttribute("raiosGama", false);
                homemAranha.addSpecificAttribute("shield", false);
                homemAranha.addSpecificAttribute("treinamentoEspecial", false);
                homemAranha.addSpecificAttribute("superSoldado", false);
                homemAranha.addSpecificAttribute("bilionario", false);
                homemAranha.addSpecificAttribute("patriota", true);
                homemAranha.addSpecificAttribute("combateCorpoACorpo", true);
                homemAranha.addSpecificAttribute("artesMarciais", true);
                homemAranha.addSpecificAttribute("forcaDivina", false);
                homemAranha.addSpecificAttribute("manipulacaoDeEnergia", false);
                homemAranha.addSpecificAttribute("fazerFeitico", false);
                homemAranha.addSpecificAttribute("Maguinetismo", false);

                Features panteraNegra = new Features("T'Challa (Pantera Negra)", "masculino", false, true, "",
                                "heroi",
                                "protagonista", false, true, "habilidades aprimoradas",
                                true, true, true,
                                false, "humano", false, false,
                                false, true, "");

                panteraNegra.addSpecificAttribute("UniversoMarvel", true);
                panteraNegra.addSpecificAttribute("vingador", true);
                panteraNegra.addSpecificAttribute("traje", true);
                panteraNegra.addSpecificAttribute("wakanda", true);
                panteraNegra.addSpecificAttribute("xmen", false);
                panteraNegra.addSpecificAttribute("UniversoMarvel", true);
                panteraNegra.addSpecificAttribute("vingador", true);
                panteraNegra.addSpecificAttribute("traje", true);
                panteraNegra.addSpecificAttribute("wakanda", true);
                panteraNegra.addSpecificAttribute("xmen", false);
                panteraNegra.addSpecificAttribute("regeneracao", true);
                panteraNegra.addSpecificAttribute("controleMetal", false);
                panteraNegra.addSpecificAttribute("capacete", true);
                panteraNegra.addSpecificAttribute("telepatia", false);
                panteraNegra.addSpecificAttribute("telecinese", false);
                panteraNegra.addSpecificAttribute("voar", false);
                panteraNegra.addSpecificAttribute("absorverEnergia", true);
                panteraNegra.addSpecificAttribute("inteligenciaArtificial", true);
                panteraNegra.addSpecificAttribute("manipulacaoRealidade", false);
                panteraNegra.addSpecificAttribute("agilidadeAprimorada", true);
                panteraNegra.addSpecificAttribute("realeza", true);
                panteraNegra.addSpecificAttribute("raiosGama", false);
                panteraNegra.addSpecificAttribute("shield", false);
                panteraNegra.addSpecificAttribute("treinamentoEspecial", true);
                panteraNegra.addSpecificAttribute("superSoldado", true);
                panteraNegra.addSpecificAttribute("bilionario", true);
                panteraNegra.addSpecificAttribute("patriota", true);
                panteraNegra.addSpecificAttribute("combateCorpoACorpo", true);
                panteraNegra.addSpecificAttribute("artesMarciais", true);
                panteraNegra.addSpecificAttribute("forcaDivina", false);
                panteraNegra.addSpecificAttribute("manipulacaoDeEnergia", true);
                panteraNegra.addSpecificAttribute("fazerFeitico", false);
                panteraNegra.addSpecificAttribute("Maguinetismo", false);

                Features capitaMarvel = new Features("Capita Marvel", "feminino", false, false, "", "heroi",
                                "protagonista", true, true, "absorção de energia",
                                true, true, false,
                                false, "humano", false, false,
                                false, false, "");

                capitaMarvel.addSpecificAttribute("UniversoMarvel", true);
                capitaMarvel.addSpecificAttribute("vingador", true);
                capitaMarvel.addSpecificAttribute("traje", true);
                capitaMarvel.addSpecificAttribute("wakanda", false);
                capitaMarvel.addSpecificAttribute("xmen", false);
                capitaMarvel.addSpecificAttribute("regeneracao", true);
                capitaMarvel.addSpecificAttribute("controleMetal", false);
                capitaMarvel.addSpecificAttribute("capacete", true);
                capitaMarvel.addSpecificAttribute("telepatia", false);
                capitaMarvel.addSpecificAttribute("telecinese", false);
                capitaMarvel.addSpecificAttribute("voar", true);
                capitaMarvel.addSpecificAttribute("absorverEnergia", true);
                capitaMarvel.addSpecificAttribute("inteligenciaArtificial", false);
                capitaMarvel.addSpecificAttribute("manipulacaoRealidade", false);
                capitaMarvel.addSpecificAttribute("agilidadeAprimorada", true);
                capitaMarvel.addSpecificAttribute("realeza", false);
                capitaMarvel.addSpecificAttribute("raiosGama", false);
                capitaMarvel.addSpecificAttribute("shield", false);
                capitaMarvel.addSpecificAttribute("treinamentoEspecial", true);
                capitaMarvel.addSpecificAttribute("superSoldado", false);
                capitaMarvel.addSpecificAttribute("bilionario", false);
                capitaMarvel.addSpecificAttribute("patriota", true);
                capitaMarvel.addSpecificAttribute("combateCorpoACorpo", true);
                capitaMarvel.addSpecificAttribute("artesMarciais", true);
                capitaMarvel.addSpecificAttribute("forcaDivina", true);
                capitaMarvel.addSpecificAttribute("manipulacaoDeEnergia", true);
                capitaMarvel.addSpecificAttribute("fazerFeitico", false);
                capitaMarvel.addSpecificAttribute("Maguinetismo", false);

                Features maquinaDeCombate = new Features("James Rhodes (Maquina De Combate)", "masculino", false, false,
                                "", "heroi",
                                "coadjuvante", true, true, "tecnologia",
                                true, false, true,
                                false, "humano", false, false,
                                false, true, "");

                maquinaDeCombate.addSpecificAttribute("UniversoMarvel", true);
                maquinaDeCombate.addSpecificAttribute("vingador", true);
                maquinaDeCombate.addSpecificAttribute("traje", true);
                maquinaDeCombate.addSpecificAttribute("wakanda", false);
                maquinaDeCombate.addSpecificAttribute("xmen", false);
                maquinaDeCombate.addSpecificAttribute("regeneracao", false);
                maquinaDeCombate.addSpecificAttribute("controleMetal", false);
                maquinaDeCombate.addSpecificAttribute("capacete", true);
                maquinaDeCombate.addSpecificAttribute("telepatia", false);
                maquinaDeCombate.addSpecificAttribute("telecinese", false);
                maquinaDeCombate.addSpecificAttribute("voar", true);
                maquinaDeCombate.addSpecificAttribute("absorverEnergia", false);
                maquinaDeCombate.addSpecificAttribute("inteligenciaArtificial", true);
                maquinaDeCombate.addSpecificAttribute("manipulacaoRealidade", false);
                maquinaDeCombate.addSpecificAttribute("agilidadeAprimorada", false);
                maquinaDeCombate.addSpecificAttribute("realeza", false);
                maquinaDeCombate.addSpecificAttribute("raiosGama", false);
                maquinaDeCombate.addSpecificAttribute("shield", false);
                maquinaDeCombate.addSpecificAttribute("treinamentoEspecial", true);
                maquinaDeCombate.addSpecificAttribute("superSoldado", false);
                maquinaDeCombate.addSpecificAttribute("bilionario", false);
                maquinaDeCombate.addSpecificAttribute("patriota", true);
                maquinaDeCombate.addSpecificAttribute("combateCorpoACorpo", true);
                maquinaDeCombate.addSpecificAttribute("artesMarciais", true);
                maquinaDeCombate.addSpecificAttribute("forcaDivina", false);
                maquinaDeCombate.addSpecificAttribute("manipulacaoDeEnergia", true);
                maquinaDeCombate.addSpecificAttribute("fazerFeitico", false);
                maquinaDeCombate.addSpecificAttribute("Maguinetismo", false);

                Features falcao = new Features("Falcão", "masculino", false, false, "", "heroi",
                                "coadjuvante", false, false, "",
                                true, false, true,
                                false, "humano", false, false,
                                false, false, "");

                falcao.addSpecificAttribute("UniversoMarvel", true);
                falcao.addSpecificAttribute("vingador", true);
                falcao.addSpecificAttribute("traje", true);
                falcao.addSpecificAttribute("wakanda", false);
                falcao.addSpecificAttribute("xmen", false);
                falcao.addSpecificAttribute("regeneracao", false);
                falcao.addSpecificAttribute("controleMetal", false);
                falcao.addSpecificAttribute("capacete", true);
                falcao.addSpecificAttribute("telepatia", false);
                falcao.addSpecificAttribute("telecinese", false);
                falcao.addSpecificAttribute("voar", true);
                falcao.addSpecificAttribute("absorverEnergia", false);
                falcao.addSpecificAttribute("inteligenciaArtificial", true);
                falcao.addSpecificAttribute("manipulacaoRealidade", false);
                falcao.addSpecificAttribute("agilidadeAprimorada", true);
                falcao.addSpecificAttribute("realeza", false);
                falcao.addSpecificAttribute("raiosGama", false);
                falcao.addSpecificAttribute("shield", true);
                falcao.addSpecificAttribute("treinamentoEspecial", true);
                falcao.addSpecificAttribute("superSoldado", false);
                falcao.addSpecificAttribute("bilionario", false);
                falcao.addSpecificAttribute("patriota", true);
                falcao.addSpecificAttribute("combateCorpoACorpo", true);
                falcao.addSpecificAttribute("artesMarciais", true);
                falcao.addSpecificAttribute("forcaDivina", false);
                falcao.addSpecificAttribute("manipulacaoDeEnergia", false);
                falcao.addSpecificAttribute("fazerFeitico", false);
                falcao.addSpecificAttribute("Maguinetismo", false);

                Features soldadoInvernal = new Features("Bucky Barnes (Soldado Invernal)", "masculino", false, true,
                                "",
                                "anti-heroi",
                                "coadjuvante", false, true, "força",
                                true, false, true,
                                false, "humano", false, true,
                                false, false, "");

                soldadoInvernal.addSpecificAttribute("UniversoMarvel", true);
                soldadoInvernal.addSpecificAttribute("vingador", true);
                soldadoInvernal.addSpecificAttribute("traje", true);
                soldadoInvernal.addSpecificAttribute("wakanda", true);
                soldadoInvernal.addSpecificAttribute("xmen", false);
                soldadoInvernal.addSpecificAttribute("regeneracao", true);
                soldadoInvernal.addSpecificAttribute("controleMetal", false);
                soldadoInvernal.addSpecificAttribute("capacete", false);
                soldadoInvernal.addSpecificAttribute("telepatia", false);
                soldadoInvernal.addSpecificAttribute("telecinese", false);
                soldadoInvernal.addSpecificAttribute("voar", false);
                soldadoInvernal.addSpecificAttribute("absorverEnergia", false);
                soldadoInvernal.addSpecificAttribute("inteligenciaArtificial", false);
                soldadoInvernal.addSpecificAttribute("manipulacaoRealidade", false);
                soldadoInvernal.addSpecificAttribute("agilidadeAprimorada", true);
                soldadoInvernal.addSpecificAttribute("realeza", false);
                soldadoInvernal.addSpecificAttribute("raiosGama", false);
                soldadoInvernal.addSpecificAttribute("shield", false);
                soldadoInvernal.addSpecificAttribute("treinamentoEspecial", true);
                soldadoInvernal.addSpecificAttribute("superSoldado", true);
                soldadoInvernal.addSpecificAttribute("bilionario", false);
                soldadoInvernal.addSpecificAttribute("patriota", false);
                soldadoInvernal.addSpecificAttribute("combateCorpoACorpo", true);
                soldadoInvernal.addSpecificAttribute("artesMarciais", true);
                soldadoInvernal.addSpecificAttribute("forcaDivina", false);
                soldadoInvernal.addSpecificAttribute("manipulacaoDeEnergia", false);
                soldadoInvernal.addSpecificAttribute("fazerFeitico", false);
                soldadoInvernal.addSpecificAttribute("Maguinetismo", false);

                Features homemFormiga = new Features("Scott Lang (Homem Formiga)", "masculino", true, false,
                                "", "heroi",
                                "coadjuvante", true, true, "mudança de tamanho",
                                true, false, false,
                                false, "humano", true, false,
                                false, false, "");

                homemFormiga.addSpecificAttribute("UniversoMarvel", true);
                homemFormiga.addSpecificAttribute("vingador", true);
                homemFormiga.addSpecificAttribute("traje", true);
                homemFormiga.addSpecificAttribute("wakanda", false);
                homemFormiga.addSpecificAttribute("xmen", false);
                homemFormiga.addSpecificAttribute("regeneracao", false);
                homemFormiga.addSpecificAttribute("controleMetal", false);
                homemFormiga.addSpecificAttribute("capacete", true);
                homemFormiga.addSpecificAttribute("telepatia", false);
                homemFormiga.addSpecificAttribute("telecinese", false);
                homemFormiga.addSpecificAttribute("voar", false);
                homemFormiga.addSpecificAttribute("absorverEnergia", false);
                homemFormiga.addSpecificAttribute("inteligenciaArtificial", true);
                homemFormiga.addSpecificAttribute("manipulacaoRealidade", false);
                homemFormiga.addSpecificAttribute("agilidadeAprimorada", true);
                homemFormiga.addSpecificAttribute("realeza", false);
                homemFormiga.addSpecificAttribute("raiosGama", false);
                homemFormiga.addSpecificAttribute("shield", false);
                homemFormiga.addSpecificAttribute("treinamentoEspecial", false);
                homemFormiga.addSpecificAttribute("superSoldado", false);
                homemFormiga.addSpecificAttribute("bilionario", false);
                homemFormiga.addSpecificAttribute("patriota", false);
                homemFormiga.addSpecificAttribute("combateCorpoACorpo", true);
                homemFormiga.addSpecificAttribute("artesMarciais", true);
                homemFormiga.addSpecificAttribute("forcaDivina", false);
                homemFormiga.addSpecificAttribute("manipulacaoDeEnergia", false);
                homemFormiga.addSpecificAttribute("fazerFeitico", false);
                homemFormiga.addSpecificAttribute("Maguinetismo", false);

                Features vespa = new Features("Vespa", "feminino", false, true, "", "heroi",
                                "coadjuvante", true, true, "mudança de tamanho e voar",
                                true, true, true,
                                false, "humano", false, false,
                                false, false, "");

                vespa.addSpecificAttribute("UniversoMarvel", true);
                vespa.addSpecificAttribute("vingador", true);
                vespa.addSpecificAttribute("traje", true);
                vespa.addSpecificAttribute("wakanda", false);
                vespa.addSpecificAttribute("xmen", false);
                vespa.addSpecificAttribute("regeneracao", false);
                vespa.addSpecificAttribute("controleMetal", false);
                vespa.addSpecificAttribute("capacete", true);
                vespa.addSpecificAttribute("telepatia", false);
                vespa.addSpecificAttribute("telecinese", false);
                vespa.addSpecificAttribute("voar", true);
                vespa.addSpecificAttribute("absorverEnergia", false);
                vespa.addSpecificAttribute("inteligenciaArtificial", true);
                vespa.addSpecificAttribute("manipulacaoRealidade", false);
                vespa.addSpecificAttribute("agilidadeAprimorada", true);
                vespa.addSpecificAttribute("realeza", false);
                vespa.addSpecificAttribute("raiosGama", false);
                vespa.addSpecificAttribute("shield", false);
                vespa.addSpecificAttribute("treinamentoEspecial", true);
                vespa.addSpecificAttribute("superSoldado", false);
                vespa.addSpecificAttribute("bilionario", true);
                vespa.addSpecificAttribute("patriota", false);
                vespa.addSpecificAttribute("combateCorpoACorpo", true);
                vespa.addSpecificAttribute("artesMarciais", true);
                vespa.addSpecificAttribute("forcaDivina", false);
                vespa.addSpecificAttribute("manipulacaoDeEnergia", true);
                vespa.addSpecificAttribute("fazerFeitico", false);
                vespa.addSpecificAttribute("Maguinetismo", false);

                Features doutorEstranho = new Features("Stephen Strange (Doutor Estranho)", "masculino", false, false,
                                "",
                                "heroi",
                                "protagonista", false, true, "magia",
                                true, true, true,
                                false, "humano", false, true,
                                true, false, "");

                doutorEstranho.addSpecificAttribute("UniversoMarvel", true);
                doutorEstranho.addSpecificAttribute("vingador", true);
                doutorEstranho.addSpecificAttribute("traje", true);
                doutorEstranho.addSpecificAttribute("wakanda", false);
                doutorEstranho.addSpecificAttribute("xmen", false);
                doutorEstranho.addSpecificAttribute("regeneracao", false);
                doutorEstranho.addSpecificAttribute("controleMetal", false);
                doutorEstranho.addSpecificAttribute("capacete", false);
                doutorEstranho.addSpecificAttribute("telepatia", true);
                doutorEstranho.addSpecificAttribute("telecinese", true);
                doutorEstranho.addSpecificAttribute("voar", true);
                doutorEstranho.addSpecificAttribute("absorverEnergia", false);
                doutorEstranho.addSpecificAttribute("inteligenciaArtificial", false);
                doutorEstranho.addSpecificAttribute("manipulacaoRealidade", true);
                doutorEstranho.addSpecificAttribute("agilidadeAprimorada", false);
                doutorEstranho.addSpecificAttribute("realeza", false);
                doutorEstranho.addSpecificAttribute("raiosGama", false);
                doutorEstranho.addSpecificAttribute("shield", false);
                doutorEstranho.addSpecificAttribute("treinamentoEspecial", true);
                doutorEstranho.addSpecificAttribute("superSoldado", false);
                doutorEstranho.addSpecificAttribute("bilionario", false);
                doutorEstranho.addSpecificAttribute("patriota", false);
                doutorEstranho.addSpecificAttribute("combateCorpoACorpo", false);
                doutorEstranho.addSpecificAttribute("artesMarciais", false);
                doutorEstranho.addSpecificAttribute("forcaDivina", false);
                doutorEstranho.addSpecificAttribute("manipulacaoDeEnergia", true);
                doutorEstranho.addSpecificAttribute("fazerFeitico", true);
                doutorEstranho.addSpecificAttribute("Maguinetismo", false);

                Features cavaleiroNegro = new Features("Cavaleiro Negro", "masculino", false, false,
                                "", "heroi",
                                "coadjuvante", false, true, "espada mística",
                                true, false, true,
                                false, "humano", false, false,
                                false, false, "");

                cavaleiroNegro.addSpecificAttribute("UniversoMarvel", true);
                cavaleiroNegro.addSpecificAttribute("vingador", true);
                cavaleiroNegro.addSpecificAttribute("traje", true);
                cavaleiroNegro.addSpecificAttribute("wakanda", false);
                cavaleiroNegro.addSpecificAttribute("xmen", false);
                cavaleiroNegro.addSpecificAttribute("regeneracao", false);
                cavaleiroNegro.addSpecificAttribute("controleMetal", false);
                cavaleiroNegro.addSpecificAttribute("capacete", true);
                cavaleiroNegro.addSpecificAttribute("telepatia", false);
                cavaleiroNegro.addSpecificAttribute("telecinese", false);
                cavaleiroNegro.addSpecificAttribute("voar", false);
                cavaleiroNegro.addSpecificAttribute("absorverEnergia", false);
                cavaleiroNegro.addSpecificAttribute("inteligenciaArtificial", false);
                cavaleiroNegro.addSpecificAttribute("manipulacaoRealidade", false);
                cavaleiroNegro.addSpecificAttribute("agilidadeAprimorada", true);
                cavaleiroNegro.addSpecificAttribute("realeza", false);
                cavaleiroNegro.addSpecificAttribute("raiosGama", false);
                cavaleiroNegro.addSpecificAttribute("shield", false);
                cavaleiroNegro.addSpecificAttribute("treinamentoEspecial", true);
                cavaleiroNegro.addSpecificAttribute("superSoldado", false);
                cavaleiroNegro.addSpecificAttribute("bilionario", false);
                cavaleiroNegro.addSpecificAttribute("patriota", true);
                cavaleiroNegro.addSpecificAttribute("combateCorpoACorpo", true);
                cavaleiroNegro.addSpecificAttribute("artesMarciais", true);
                cavaleiroNegro.addSpecificAttribute("forcaDivina", false);
                cavaleiroNegro.addSpecificAttribute("manipulacaoDeEnergia", false);
                cavaleiroNegro.addSpecificAttribute("fazerFeitico", false);
                cavaleiroNegro.addSpecificAttribute("Maguinetismo", false);

                Features sheHulk = new Features("She hulk", "feminino", false, true, "", "heroi",
                                "coadjuvante", true, true, "força",
                                true, true, false,
                                false, "humano", false, false,
                                false, false, "");

                sheHulk.addSpecificAttribute("UniversoMarvel", true);
                sheHulk.addSpecificAttribute("vingador", true);
                sheHulk.addSpecificAttribute("traje", false);
                sheHulk.addSpecificAttribute("wakanda", false);
                sheHulk.addSpecificAttribute("xmen", false);
                sheHulk.addSpecificAttribute("regeneracao", true);
                sheHulk.addSpecificAttribute("controleMetal", false);
                sheHulk.addSpecificAttribute("capacete", false);
                sheHulk.addSpecificAttribute("telepatia", false);
                sheHulk.addSpecificAttribute("telecinese", false);
                sheHulk.addSpecificAttribute("voar", false);
                sheHulk.addSpecificAttribute("absorverEnergia", false);
                sheHulk.addSpecificAttribute("inteligenciaArtificial", false);
                sheHulk.addSpecificAttribute("manipulacaoRealidade", false);
                sheHulk.addSpecificAttribute("agilidadeAprimorada", true);
                sheHulk.addSpecificAttribute("realeza", false);
                sheHulk.addSpecificAttribute("raiosGama", true);
                sheHulk.addSpecificAttribute("shield", false);
                sheHulk.addSpecificAttribute("treinamentoEspecial", false);
                sheHulk.addSpecificAttribute("superSoldado", true);
                sheHulk.addSpecificAttribute("bilionario", false);
                sheHulk.addSpecificAttribute("patriota", true);
                sheHulk.addSpecificAttribute("combateCorpoACorpo", true);
                sheHulk.addSpecificAttribute("artesMarciais", true);
                sheHulk.addSpecificAttribute("forcaDivina", false);
                sheHulk.addSpecificAttribute("manipulacaoDeEnergia", false);
                sheHulk.addSpecificAttribute("fazerFeitico", false);
                sheHulk.addSpecificAttribute("Maguinetismo", false);

                Features mercurio = new Features("Pietro Maximoff (Mercúrio)", "masculino", false, true, "",
                                "heroi",
                                "coadjuvante", false, true, "super velocidade",
                                true, false, false,
                                false, "mutante", true, false,
                                false, false, "");

                mercurio.addSpecificAttribute("UniversoMarvel", true);
                mercurio.addSpecificAttribute("vingador", true);
                mercurio.addSpecificAttribute("traje", true);
                mercurio.addSpecificAttribute("wakanda", false);
                mercurio.addSpecificAttribute("xmen", false);
                mercurio.addSpecificAttribute("regeneracao", true);
                mercurio.addSpecificAttribute("controleMetal", false);
                mercurio.addSpecificAttribute("capacete", false);
                mercurio.addSpecificAttribute("telepatia", false);
                mercurio.addSpecificAttribute("telecinese", false);
                mercurio.addSpecificAttribute("voar", false);
                mercurio.addSpecificAttribute("absorverEnergia", false);
                mercurio.addSpecificAttribute("inteligenciaArtificial", false);
                mercurio.addSpecificAttribute("manipulacaoRealidade", false);
                mercurio.addSpecificAttribute("agilidadeAprimorada", true);
                mercurio.addSpecificAttribute("realeza", false);
                mercurio.addSpecificAttribute("raiosGama", false);
                mercurio.addSpecificAttribute("shield", false);
                mercurio.addSpecificAttribute("treinamentoEspecial", true);
                mercurio.addSpecificAttribute("superSoldado", false);
                mercurio.addSpecificAttribute("bilionario", false);
                mercurio.addSpecificAttribute("patriota", false);
                mercurio.addSpecificAttribute("combateCorpoACorpo", true);
                mercurio.addSpecificAttribute("artesMarciais", true);
                mercurio.addSpecificAttribute("forcaDivina", false);

                Features ciclope = new Features("Scott Summers (ciclope)", "masculino", true, true, "",
                                "heroi",
                                "protagonista", false, true, "raios ópticos",
                                true, true, true,
                                false, "mutante", false, false,
                                false, false, "");

                ciclope.addSpecificAttribute("UniversoMarvel", true);
                ciclope.addSpecificAttribute("vingador", false);
                ciclope.addSpecificAttribute("traje", true);
                ciclope.addSpecificAttribute("wakanda", false);
                ciclope.addSpecificAttribute("xmen", true);
                ciclope.addSpecificAttribute("regeneracao", false);
                ciclope.addSpecificAttribute("controleMetal", false);
                ciclope.addSpecificAttribute("capacete", false);
                ciclope.addSpecificAttribute("telepatia", false);
                ciclope.addSpecificAttribute("telecinese", false);
                ciclope.addSpecificAttribute("voar", false);
                ciclope.addSpecificAttribute("absorverEnergia", true);
                ciclope.addSpecificAttribute("inteligenciaArtificial", false);
                ciclope.addSpecificAttribute("manipulacaoRealidade", false);
                ciclope.addSpecificAttribute("agilidadeAprimorada", false);
                ciclope.addSpecificAttribute("realeza", false);
                ciclope.addSpecificAttribute("raiosGama", false);
                ciclope.addSpecificAttribute("shield", false);
                ciclope.addSpecificAttribute("treinamentoEspecial", true);
                ciclope.addSpecificAttribute("superSoldado", false);
                ciclope.addSpecificAttribute("bilionario", false);
                ciclope.addSpecificAttribute("patriota", true);
                ciclope.addSpecificAttribute("combateCorpoACorpo", true);
                ciclope.addSpecificAttribute("artesMarciais", true);
                ciclope.addSpecificAttribute("forcaDivina", false);
                ciclope.addSpecificAttribute("manipulacaoDeEnergia", true);
                ciclope.addSpecificAttribute("fazerFeitico", false);
                ciclope.addSpecificAttribute("Maguinetismo", false);

                Features jeanGrey = new Features("Jean Grey", "feminino", true, false, "", "heroi",
                                "protagonista", true, true, "telecinese e telepatia",
                                true, true, true,
                                false, "mutante", false, false,
                                false, false, "");

                jeanGrey.addSpecificAttribute("UniversoMarvel", true);
                jeanGrey.addSpecificAttribute("vingador", false);
                jeanGrey.addSpecificAttribute("traje", true);
                jeanGrey.addSpecificAttribute("wakanda", false);
                jeanGrey.addSpecificAttribute("xmen", true);
                jeanGrey.addSpecificAttribute("regeneracao", false);
                jeanGrey.addSpecificAttribute("controleMetal", false);
                jeanGrey.addSpecificAttribute("capacete", false);
                jeanGrey.addSpecificAttribute("telepatia", true);
                jeanGrey.addSpecificAttribute("telecinese", true);
                jeanGrey.addSpecificAttribute("voar", true);
                jeanGrey.addSpecificAttribute("absorverEnergia", false);
                jeanGrey.addSpecificAttribute("inteligenciaArtificial", false);
                jeanGrey.addSpecificAttribute("manipulacaoRealidade", true);
                jeanGrey.addSpecificAttribute("agilidadeAprimorada", false);
                jeanGrey.addSpecificAttribute("realeza", false);
                jeanGrey.addSpecificAttribute("raiosGama", false);
                jeanGrey.addSpecificAttribute("shield", false);
                jeanGrey.addSpecificAttribute("treinamentoEspecial", true);
                jeanGrey.addSpecificAttribute("superSoldado", false);
                jeanGrey.addSpecificAttribute("bilionario", false);
                jeanGrey.addSpecificAttribute("patriota", false);
                jeanGrey.addSpecificAttribute("combateCorpoACorpo", false);
                jeanGrey.addSpecificAttribute("artesMarciais", false);
                jeanGrey.addSpecificAttribute("forcaDivina", true);
                jeanGrey.addSpecificAttribute("manipulacaoDeEnergia", true);
                jeanGrey.addSpecificAttribute("fazerFeitico", false);
                jeanGrey.addSpecificAttribute("Maguinetismo", false);

                Features wolverine = new Features("Wolverine", "masculino", true, false, "", "anti-heroi",
                                "protagonista", false, true, "fator de cura",
                                true, false, false,
                                false, "mutante", false, true,
                                false, false, "");

                wolverine.addSpecificAttribute("UniversoMarvel", true);
                wolverine.addSpecificAttribute("vingador", true);
                wolverine.addSpecificAttribute("traje", true);
                wolverine.addSpecificAttribute("wakanda", false);
                wolverine.addSpecificAttribute("xmen", true);
                wolverine.addSpecificAttribute("regeneracao", true);
                wolverine.addSpecificAttribute("controleMetal", false);
                wolverine.addSpecificAttribute("capacete", false);
                wolverine.addSpecificAttribute("telepatia", false);
                wolverine.addSpecificAttribute("telecinese", false);
                wolverine.addSpecificAttribute("voar", false);
                wolverine.addSpecificAttribute("absorverEnergia", false);
                wolverine.addSpecificAttribute("inteligenciaArtificial", false);
                wolverine.addSpecificAttribute("manipulacaoRealidade", false);
                wolverine.addSpecificAttribute("agilidadeAprimorada", true);
                wolverine.addSpecificAttribute("realeza", false);
                wolverine.addSpecificAttribute("raiosGama", false);
                wolverine.addSpecificAttribute("shield", false);
                wolverine.addSpecificAttribute("treinamentoEspecial", true);
                wolverine.addSpecificAttribute("superSoldado", true);
                wolverine.addSpecificAttribute("bilionario", false);
                wolverine.addSpecificAttribute("patriota", false);
                wolverine.addSpecificAttribute("combateCorpoACorpo", true);
                wolverine.addSpecificAttribute("artesMarciais", true);
                wolverine.addSpecificAttribute("forcaDivina", false);
                wolverine.addSpecificAttribute("manipulacaoDeEnergia", false);
                wolverine.addSpecificAttribute("fazerFeitico", false);
                wolverine.addSpecificAttribute("Maguinetismo", false);

                Features tempestade = new Features("Ororo Munroe (tempestade)", "feminino", true, false, "",
                                "heroi",
                                "protagonista", false, true, "controle do clima",
                                true, true, true,
                                false, "mutante", false, false,
                                false, true, "");

                tempestade.addSpecificAttribute("UniversoMarvel", true);
                tempestade.addSpecificAttribute("vingador", true);
                tempestade.addSpecificAttribute("traje", true);
                tempestade.addSpecificAttribute("wakanda", true);
                tempestade.addSpecificAttribute("xmen", true);
                tempestade.addSpecificAttribute("regeneracao", false);
                tempestade.addSpecificAttribute("controleMetal", false);
                tempestade.addSpecificAttribute("capacete", false);
                tempestade.addSpecificAttribute("telepatia", false);
                tempestade.addSpecificAttribute("telecinese", false);
                tempestade.addSpecificAttribute("voar", true);
                tempestade.addSpecificAttribute("absorverEnergia", false);
                tempestade.addSpecificAttribute("inteligenciaArtificial", false);
                tempestade.addSpecificAttribute("manipulacaoRealidade", false);
                tempestade.addSpecificAttribute("agilidadeAprimorada", false);
                tempestade.addSpecificAttribute("realeza", true);
                tempestade.addSpecificAttribute("raiosGama", false);
                tempestade.addSpecificAttribute("shield", false);
                tempestade.addSpecificAttribute("treinamentoEspecial", true);
                tempestade.addSpecificAttribute("superSoldado", false);
                tempestade.addSpecificAttribute("bilionario", false);
                tempestade.addSpecificAttribute("patriota", false);
                tempestade.addSpecificAttribute("combateCorpoACorpo", true);
                tempestade.addSpecificAttribute("artesMarciais", true);
                tempestade.addSpecificAttribute("forcaDivina", false);
                tempestade.addSpecificAttribute("manipulacaoDeEnergia", true);
                tempestade.addSpecificAttribute("fazerFeitico", false);
                tempestade.addSpecificAttribute("Maguinetismo", false);

                Features fera = new Features("Fera", "masculino", false, false, "", "heroi",
                                "coadjuvante", true, true, "agilidade e força sobre-humanas",
                                true, true, true,
                                false, "mutante", false, false,
                                false, false, "");

                fera.addSpecificAttribute("UniversoMarvel", true);
                fera.addSpecificAttribute("vingador", true);
                fera.addSpecificAttribute("traje", false);
                fera.addSpecificAttribute("wakanda", false);
                fera.addSpecificAttribute("xmen", true);
                fera.addSpecificAttribute("regeneracao", true);
                fera.addSpecificAttribute("controleMetal", false);
                fera.addSpecificAttribute("capacete", false);
                fera.addSpecificAttribute("telepatia", false);
                fera.addSpecificAttribute("telecinese", false);
                fera.addSpecificAttribute("voar", false);
                fera.addSpecificAttribute("absorverEnergia", false);
                fera.addSpecificAttribute("inteligenciaArtificial", false);
                fera.addSpecificAttribute("manipulacaoRealidade", false);
                fera.addSpecificAttribute("agilidadeAprimorada", true);
                fera.addSpecificAttribute("realeza", false);
                fera.addSpecificAttribute("raiosGama", false);
                fera.addSpecificAttribute("shield", false);
                fera.addSpecificAttribute("treinamentoEspecial", true);
                fera.addSpecificAttribute("superSoldado", false);
                fera.addSpecificAttribute("bilionario", false);
                fera.addSpecificAttribute("patriota", true);
                fera.addSpecificAttribute("combateCorpoACorpo", true);
                fera.addSpecificAttribute("artesMarciais", true);
                fera.addSpecificAttribute("forcaDivina", false);
                fera.addSpecificAttribute("manipulacaoDeEnergia", false);
                fera.addSpecificAttribute("fazerFeitico", false);
                fera.addSpecificAttribute("Maguinetismo", false);

                Features magneto = new Features("Erik Lehnsherr (Magneto)", "masculino", true, false, "",
                                "anti-heroi",
                                "antagonista", false, true, "controle do magnetismo",
                                false, true, true,
                                true, "mutante", false, true,
                                false, false, "");

                magneto.addSpecificAttribute("UniversoMarvel", true);
                magneto.addSpecificAttribute("vingador", false);
                magneto.addSpecificAttribute("traje", true);
                magneto.addSpecificAttribute("wakanda", false);
                magneto.addSpecificAttribute("xmen", false);
                magneto.addSpecificAttribute("regeneracao", false);
                magneto.addSpecificAttribute("controleMetal", true);
                magneto.addSpecificAttribute("capacete", true);
                magneto.addSpecificAttribute("telepatia", false);
                magneto.addSpecificAttribute("telecinese", false);
                magneto.addSpecificAttribute("voar", true);
                magneto.addSpecificAttribute("absorverEnergia", false);
                magneto.addSpecificAttribute("inteligenciaArtificial", false);
                magneto.addSpecificAttribute("manipulacaoRealidade", false);
                magneto.addSpecificAttribute("agilidadeAprimorada", false);
                magneto.addSpecificAttribute("realeza", false);
                magneto.addSpecificAttribute("raiosGama", false);
                magneto.addSpecificAttribute("shield", false);
                magneto.addSpecificAttribute("treinamentoEspecial", true);
                magneto.addSpecificAttribute("superSoldado", false);
                magneto.addSpecificAttribute("bilionario", false);
                magneto.addSpecificAttribute("patriota", false);
                magneto.addSpecificAttribute("combateCorpoACorpo", true);
                magneto.addSpecificAttribute("artesMarciais", true);
                magneto.addSpecificAttribute("forcaDivina", false);
                magneto.addSpecificAttribute("manipulacaoDeEnergia", true);
                magneto.addSpecificAttribute("fazerFeitico", false);
                magneto.addSpecificAttribute("Maguinetismo", true);
                magneto.addSpecificAttribute("manipulacaoDeEnergia", true);
                magneto.addSpecificAttribute("fazerFeitico", false);
                magneto.addSpecificAttribute("Maguinetismo", true);

                Features vampira = new Features("Vampira", "feminino", false, false, "", "heroi",
                                "coadjuvante", false, true, "absorção de poderes",
                                true, false, false,
                                false, "mutante", false, false,
                                false, false, "");

                vampira.addSpecificAttribute("UniversoMarvel", true);
                vampira.addSpecificAttribute("vingador", false);
                vampira.addSpecificAttribute("traje", true);
                vampira.addSpecificAttribute("wakanda", false);
                vampira.addSpecificAttribute("xmen", true);
                vampira.addSpecificAttribute("regeneracao", true);
                vampira.addSpecificAttribute("controleMetal", false);
                vampira.addSpecificAttribute("capacete", false);
                vampira.addSpecificAttribute("telepatia", false);
                vampira.addSpecificAttribute("telecinese", false);
                vampira.addSpecificAttribute("voar", true);
                vampira.addSpecificAttribute("absorverEnergia", true);
                vampira.addSpecificAttribute("inteligenciaArtificial", false);
                vampira.addSpecificAttribute("manipulacaoRealidade", false);
                vampira.addSpecificAttribute("agilidadeAprimorada", true);
                vampira.addSpecificAttribute("realeza", false);
                vampira.addSpecificAttribute("raiosGama", false);
                vampira.addSpecificAttribute("shield", false);
                vampira.addSpecificAttribute("treinamentoEspecial", true);
                vampira.addSpecificAttribute("superSoldado", false);
                vampira.addSpecificAttribute("bilionario", false);
                vampira.addSpecificAttribute("patriota", false);
                vampira.addSpecificAttribute("combateCorpoACorpo", true);
                vampira.addSpecificAttribute("artesMarciais", true);
                vampira.addSpecificAttribute("forcaDivina", false);
                vampira.addSpecificAttribute("manipulacaoDeEnergia", true);
                vampira.addSpecificAttribute("fazerFeitico", false);
                vampira.addSpecificAttribute("Maguinetismo", false);

                Features gambit = new Features("Gambit", "masculino", false, false, "", "heroi",
                                "coadjuvante", false, true, "manipulação de energia cinética",
                                true, false, true,
                                false, "mutante", true, false,
                                false, false, "");

                gambit.addSpecificAttribute("UniversoMarvel", true);
                gambit.addSpecificAttribute("vingador", false);
                gambit.addSpecificAttribute("traje", true);
                gambit.addSpecificAttribute("wakanda", false);
                gambit.addSpecificAttribute("xmen", true);
                gambit.addSpecificAttribute("regeneracao", false);
                gambit.addSpecificAttribute("controleMetal", false);
                gambit.addSpecificAttribute("capacete", false);
                gambit.addSpecificAttribute("telepatia", false);
                gambit.addSpecificAttribute("telecinese", false);
                gambit.addSpecificAttribute("voar", false);
                gambit.addSpecificAttribute("absorverEnergia", true);
                gambit.addSpecificAttribute("inteligenciaArtificial", false);
                gambit.addSpecificAttribute("manipulacaoRealidade", false);
                gambit.addSpecificAttribute("agilidadeAprimorada", true);
                gambit.addSpecificAttribute("realeza", false);
                gambit.addSpecificAttribute("raiosGama", false);
                gambit.addSpecificAttribute("shield", false);
                gambit.addSpecificAttribute("treinamentoEspecial", true);
                gambit.addSpecificAttribute("superSoldado", false);
                gambit.addSpecificAttribute("bilionario", false);
                gambit.addSpecificAttribute("patriota", false);
                gambit.addSpecificAttribute("combateCorpoACorpo", true);
                gambit.addSpecificAttribute("artesMarciais", true);
                gambit.addSpecificAttribute("forcaDivina", false);
                gambit.addSpecificAttribute("manipulacaoDeEnergia", true);
                gambit.addSpecificAttribute("fazerFeitico", false);
                gambit.addSpecificAttribute("Maguinetismo", false);

                Features noturno = new Features("Noturno", "masculino", false, false, "", "heroi",
                                "coadjuvante", false, true, "teletransporte",
                                true, false, false,
                                false, "mutante", false, false,
                                false, false, "");

                noturno.addSpecificAttribute("UniversoMarvel", true);
                noturno.addSpecificAttribute("vingador", false);
                noturno.addSpecificAttribute("traje", true);
                noturno.addSpecificAttribute("wakanda", false);
                noturno.addSpecificAttribute("xmen", true);
                noturno.addSpecificAttribute("regeneracao", false);
                noturno.addSpecificAttribute("controleMetal", false);
                noturno.addSpecificAttribute("capacete", false);
                noturno.addSpecificAttribute("telepatia", false);
                noturno.addSpecificAttribute("telecinese", false);
                noturno.addSpecificAttribute("voar", false);
                noturno.addSpecificAttribute("absorverEnergia", false);
                noturno.addSpecificAttribute("inteligenciaArtificial", false);
                noturno.addSpecificAttribute("manipulacaoRealidade", false);
                noturno.addSpecificAttribute("agilidadeAprimorada", true);
                noturno.addSpecificAttribute("realeza", false);
                noturno.addSpecificAttribute("raiosGama", false);
                noturno.addSpecificAttribute("shield", false);
                noturno.addSpecificAttribute("treinamentoEspecial", true);
                noturno.addSpecificAttribute("superSoldado", false);
                noturno.addSpecificAttribute("bilionario", false);
                noturno.addSpecificAttribute("patriota", false);
                noturno.addSpecificAttribute("combateCorpoACorpo", true);
                noturno.addSpecificAttribute("artesMarciais", true);
                noturno.addSpecificAttribute("forcaDivina", false);
                noturno.addSpecificAttribute("manipulacaoDeEnergia", false);
                noturno.addSpecificAttribute("fazerFeitico", false);
                noturno.addSpecificAttribute("Maguinetismo", false);

                Features colossus = new Features("Piotr Rasputin (Colossus)", "masculino", false, true, "",
                                "heroi",
                                "coadjuvante", true, true, "pele metálica",
                                true, false, false,
                                false, "mutante", false, false,
                                false, false, "");

                colossus.addSpecificAttribute("UniversoMarvel", true);
                colossus.addSpecificAttribute("vingador", false);
                colossus.addSpecificAttribute("traje", true);
                colossus.addSpecificAttribute("wakanda", false);
                colossus.addSpecificAttribute("xmen", true);
                colossus.addSpecificAttribute("regeneracao", false);
                colossus.addSpecificAttribute("controleMetal", false);
                colossus.addSpecificAttribute("capacete", false);
                colossus.addSpecificAttribute("telepatia", false);
                colossus.addSpecificAttribute("telecinese", false);
                colossus.addSpecificAttribute("voar", false);
                colossus.addSpecificAttribute("absorverEnergia", false);
                colossus.addSpecificAttribute("inteligenciaArtificial", false);
                colossus.addSpecificAttribute("manipulacaoRealidade", false);
                colossus.addSpecificAttribute("agilidadeAprimorada", false);
                colossus.addSpecificAttribute("realeza", false);
                colossus.addSpecificAttribute("raiosGama", false);
                colossus.addSpecificAttribute("shield", false);
                colossus.addSpecificAttribute("treinamentoEspecial", true);
                colossus.addSpecificAttribute("superSoldado", false);
                colossus.addSpecificAttribute("bilionario", false);
                colossus.addSpecificAttribute("patriota", true);
                colossus.addSpecificAttribute("combateCorpoACorpo", true);
                colossus.addSpecificAttribute("artesMarciais", true);
                colossus.addSpecificAttribute("forcaDivina", false);
                colossus.addSpecificAttribute("manipulacaoDeEnergia", false);
                colossus.addSpecificAttribute("fazerFeitico", false);
                colossus.addSpecificAttribute("Maguinetismo", false);

                Features kittyPryde = new Features("Kitty Pryde", "feminino", false, false, "", "heroi",
                                "coadjuvante", false, true, "intangibilidade",
                                true, true, false,
                                false, "mutante", false, false,
                                false, false, "");

                kittyPryde.addSpecificAttribute("UniversoMarvel", true);
                kittyPryde.addSpecificAttribute("vingador", false);
                kittyPryde.addSpecificAttribute("traje", true);
                kittyPryde.addSpecificAttribute("wakanda", false);
                kittyPryde.addSpecificAttribute("xmen", true);
                kittyPryde.addSpecificAttribute("regeneracao", false);
                kittyPryde.addSpecificAttribute("controleMetal", false);
                kittyPryde.addSpecificAttribute("capacete", false);
                kittyPryde.addSpecificAttribute("telepatia", false);
                kittyPryde.addSpecificAttribute("telecinese", false);
                kittyPryde.addSpecificAttribute("voar", false);
                kittyPryde.addSpecificAttribute("absorverEnergia", false);
                kittyPryde.addSpecificAttribute("inteligenciaArtificial", false);
                kittyPryde.addSpecificAttribute("manipulacaoRealidade", false);
                kittyPryde.addSpecificAttribute("agilidadeAprimorada", true);
                kittyPryde.addSpecificAttribute("realeza", false);
                kittyPryde.addSpecificAttribute("raiosGama", false);
                kittyPryde.addSpecificAttribute("shield", false);
                kittyPryde.addSpecificAttribute("treinamentoEspecial", true);
                kittyPryde.addSpecificAttribute("superSoldado", false);
                kittyPryde.addSpecificAttribute("bilionario", false);
                kittyPryde.addSpecificAttribute("patriota", false);
                kittyPryde.addSpecificAttribute("combateCorpoACorpo", true);
                kittyPryde.addSpecificAttribute("artesMarciais", true);
                kittyPryde.addSpecificAttribute("forcaDivina", false);
                kittyPryde.addSpecificAttribute("manipulacaoDeEnergia", false);
                kittyPryde.addSpecificAttribute("fazerFeitico", false);
                kittyPryde.addSpecificAttribute("Maguinetismo", false);

                Features homemDeGelo = new Features("Bobby Drake (Homem De Gelo)", "masculino", false, false,
                                "", "heroi",
                                "coadjuvante", false, true, "criogênese",
                                true, false, true,
                                false, "mutante", true, false,
                                false, false, "");

                homemDeGelo.addSpecificAttribute("UniversoMarvel", true);
                homemDeGelo.addSpecificAttribute("vingador", false);
                homemDeGelo.addSpecificAttribute("traje", true);
                homemDeGelo.addSpecificAttribute("wakanda", false);
                homemDeGelo.addSpecificAttribute("xmen", true);
                homemDeGelo.addSpecificAttribute("regeneracao", true);
                homemDeGelo.addSpecificAttribute("controleMetal", false);
                homemDeGelo.addSpecificAttribute("capacete", false);
                homemDeGelo.addSpecificAttribute("telepatia", false);
                homemDeGelo.addSpecificAttribute("telecinese", false);
                homemDeGelo.addSpecificAttribute("voar", false);
                homemDeGelo.addSpecificAttribute("absorverEnergia", false);
                homemDeGelo.addSpecificAttribute("inteligenciaArtificial", false);
                homemDeGelo.addSpecificAttribute("manipulacaoRealidade", false);
                homemDeGelo.addSpecificAttribute("agilidadeAprimorada", true);
                homemDeGelo.addSpecificAttribute("realeza", false);
                homemDeGelo.addSpecificAttribute("raiosGama", false);
                homemDeGelo.addSpecificAttribute("shield", false);
                homemDeGelo.addSpecificAttribute("treinamentoEspecial", true);
                homemDeGelo.addSpecificAttribute("superSoldado", false);
                homemDeGelo.addSpecificAttribute("bilionario", false);
                homemDeGelo.addSpecificAttribute("patriota", false);
                homemDeGelo.addSpecificAttribute("combateCorpoACorpo", true);
                homemDeGelo.addSpecificAttribute("artesMarciais", false);
                homemDeGelo.addSpecificAttribute("forcaDivina", false);
                homemDeGelo.addSpecificAttribute("manipulacaoDeEnergia", true);
                homemDeGelo.addSpecificAttribute("fazerFeitico", false);
                homemDeGelo.addSpecificAttribute("Maguinetismo", false);

                Features angel = new Features("Warren Worthington III (Anjo)", "masculino", false, false, "",
                                "heroi",
                                "coadjuvante", true, true, "voar com asas",
                                true, false, false,
                                false, "mutante", false, false,
                                false, false, "");

                angel.addSpecificAttribute("UniversoMarvel", true);
                angel.addSpecificAttribute("vingador", false);
                angel.addSpecificAttribute("traje", true);
                angel.addSpecificAttribute("wakanda", false);
                angel.addSpecificAttribute("xmen", true);
                angel.addSpecificAttribute("regeneracao", true);
                angel.addSpecificAttribute("controleMetal", false);
                angel.addSpecificAttribute("capacete", false);
                angel.addSpecificAttribute("telepatia", false);
                angel.addSpecificAttribute("telecinese", false);
                angel.addSpecificAttribute("voar", true);
                angel.addSpecificAttribute("absorverEnergia", false);
                angel.addSpecificAttribute("inteligenciaArtificial", false);
                angel.addSpecificAttribute("manipulacaoRealidade", false);
                angel.addSpecificAttribute("agilidadeAprimorada", true);
                angel.addSpecificAttribute("realeza", false);
                angel.addSpecificAttribute("raiosGama", false);
                angel.addSpecificAttribute("shield", false);
                angel.addSpecificAttribute("treinamentoEspecial", true);
                angel.addSpecificAttribute("superSoldado", false);
                angel.addSpecificAttribute("bilionario", true);
                angel.addSpecificAttribute("patriota", false);
                angel.addSpecificAttribute("combateCorpoACorpo", true);
                angel.addSpecificAttribute("artesMarciais", false);
                angel.addSpecificAttribute("forcaDivina", false);
                angel.addSpecificAttribute("manipulacaoDeEnergia", false);
                angel.addSpecificAttribute("fazerFeitico", false);
                angel.addSpecificAttribute("Maguinetismo", false);

                Features professorX = new Features("Charles Xavier", "masculino", true, false, "", "heroi",
                                "protagonista", false, true, "telepatia",
                                true, true, true,
                                false, "mutante", false, false,
                                false, false, "");

                professorX.addSpecificAttribute("UniversoMarvel", true);
                professorX.addSpecificAttribute("vingador", false);
                professorX.addSpecificAttribute("traje", false);
                professorX.addSpecificAttribute("wakanda", false);
                professorX.addSpecificAttribute("xmen", true);
                professorX.addSpecificAttribute("regeneracao", false);
                professorX.addSpecificAttribute("controleMetal", false);
                professorX.addSpecificAttribute("capacete", true);
                professorX.addSpecificAttribute("telepatia", true);
                professorX.addSpecificAttribute("telecinese", false);
                professorX.addSpecificAttribute("voar", false);
                professorX.addSpecificAttribute("absorverEnergia", false);
                professorX.addSpecificAttribute("inteligenciaArtificial", false);
                professorX.addSpecificAttribute("manipulacaoRealidade", false);
                professorX.addSpecificAttribute("agilidadeAprimorada", false);
                professorX.addSpecificAttribute("realeza", false);
                professorX.addSpecificAttribute("raiosGama", false);
                professorX.addSpecificAttribute("shield", false);
                professorX.addSpecificAttribute("treinamentoEspecial", true);
                professorX.addSpecificAttribute("superSoldado", false);
                professorX.addSpecificAttribute("bilionario", true);
                professorX.addSpecificAttribute("patriota", true);
                professorX.addSpecificAttribute("combateCorpoACorpo", false);
                professorX.addSpecificAttribute("artesMarciais", false);
                professorX.addSpecificAttribute("forcaDivina", false);
                professorX.addSpecificAttribute("manipulacaoDeEnergia", false);
                professorX.addSpecificAttribute("fazerFeitico", false);
                professorX.addSpecificAttribute("Maguinetismo", false);

                Features jubilee = new Features("Jubilation Lee", "feminino", false, false, "", "heroi",
                                "coadjuvante", false, true, "geração de energia plasmática",
                                true, false, false,
                                false, "mutante", true, false,
                                false, false, "");

                jubilee.addSpecificAttribute("UniversoMarvel", true);
                jubilee.addSpecificAttribute("vingador", false);
                jubilee.addSpecificAttribute("traje", true);
                jubilee.addSpecificAttribute("wakanda", false);
                jubilee.addSpecificAttribute("xmen", true);
                jubilee.addSpecificAttribute("regeneracao", false);
                jubilee.addSpecificAttribute("controleMetal", false);
                jubilee.addSpecificAttribute("capacete", false);
                jubilee.addSpecificAttribute("telepatia", false);
                jubilee.addSpecificAttribute("telecinese", false);
                jubilee.addSpecificAttribute("voar", false);
                jubilee.addSpecificAttribute("absorverEnergia", true);
                jubilee.addSpecificAttribute("inteligenciaArtificial", false);
                jubilee.addSpecificAttribute("manipulacaoRealidade", false);
                jubilee.addSpecificAttribute("agilidadeAprimorada", true);
                jubilee.addSpecificAttribute("realeza", false);
                jubilee.addSpecificAttribute("raiosGama", false);
                jubilee.addSpecificAttribute("shield", false);
                jubilee.addSpecificAttribute("treinamentoEspecial", true);
                jubilee.addSpecificAttribute("superSoldado", false);
                jubilee.addSpecificAttribute("bilionario", false);
                jubilee.addSpecificAttribute("patriota", false);
                jubilee.addSpecificAttribute("combateCorpoACorpo", true);
                jubilee.addSpecificAttribute("artesMarciais", true);
                jubilee.addSpecificAttribute("forcaDivina", false);
                jubilee.addSpecificAttribute("manipulacaoDeEnergia", true);
                jubilee.addSpecificAttribute("fazerFeitico", false);
                jubilee.addSpecificAttribute("Maguinetismo", false);

                Features psylocke = new Features("Elizabeth Braddock (psylocke)", "feminino", false, true, "",
                                "heroi",
                                "coadjuvante", false, true, "telepatia e telecinese",
                                true, true, true,
                                false, "mutante", false, false,
                                false, false, "");

                psylocke.addSpecificAttribute("UniversoMarvel", true);
                psylocke.addSpecificAttribute("vingador", false);
                psylocke.addSpecificAttribute("traje", true);
                psylocke.addSpecificAttribute("wakanda", false);
                psylocke.addSpecificAttribute("xmen", true);
                psylocke.addSpecificAttribute("regeneracao", false);
                psylocke.addSpecificAttribute("controleMetal", false);
                psylocke.addSpecificAttribute("capacete", false);
                psylocke.addSpecificAttribute("telepatia", true);
                psylocke.addSpecificAttribute("telecinese", true);
                psylocke.addSpecificAttribute("voar", false);
                psylocke.addSpecificAttribute("absorverEnergia", false);
                psylocke.addSpecificAttribute("inteligenciaArtificial", false);
                psylocke.addSpecificAttribute("manipulacaoRealidade", false);
                psylocke.addSpecificAttribute("agilidadeAprimorada", true);
                psylocke.addSpecificAttribute("realeza", false);
                psylocke.addSpecificAttribute("raiosGama", false);
                psylocke.addSpecificAttribute("shield", false);
                psylocke.addSpecificAttribute("treinamentoEspecial", true);
                psylocke.addSpecificAttribute("superSoldado", false);
                psylocke.addSpecificAttribute("bilionario", false);
                psylocke.addSpecificAttribute("patriota", false);
                psylocke.addSpecificAttribute("combateCorpoACorpo", true);
                psylocke.addSpecificAttribute("artesMarciais", true);
                psylocke.addSpecificAttribute("forcaDivina", false);
                psylocke.addSpecificAttribute("manipulacaoDeEnergia", true);
                psylocke.addSpecificAttribute("fazerFeitico", false);
                psylocke.addSpecificAttribute("Maguinetismo", false);

                Features deadpool = new Features("Deadpool", "masculino", false, false, "", "anti-heroi",
                                "protagonista", true, true, "fator de cura acelerado",
                                false, false, false,
                                false, "mutante", true, true,
                                false, false, "");

                deadpool.addSpecificAttribute("UniversoMarvel", true);
                deadpool.addSpecificAttribute("vingador", false);
                deadpool.addSpecificAttribute("traje", true);
                deadpool.addSpecificAttribute("wakanda", false);
                deadpool.addSpecificAttribute("xmen", false);
                deadpool.addSpecificAttribute("regeneracao", true);
                deadpool.addSpecificAttribute("controleMetal", false);
                deadpool.addSpecificAttribute("capacete", false);
                deadpool.addSpecificAttribute("telepatia", false);
                deadpool.addSpecificAttribute("telecinese", false);
                deadpool.addSpecificAttribute("voar", false);
                deadpool.addSpecificAttribute("absorverEnergia", false);
                deadpool.addSpecificAttribute("inteligenciaArtificial", false);
                deadpool.addSpecificAttribute("manipulacaoRealidade", false);
                deadpool.addSpecificAttribute("agilidadeAprimorada", true);
                deadpool.addSpecificAttribute("realeza", false);
                deadpool.addSpecificAttribute("raiosGama", false);
                deadpool.addSpecificAttribute("shield", false);
                deadpool.addSpecificAttribute("treinamentoEspecial", true);
                deadpool.addSpecificAttribute("superSoldado", true);
                deadpool.addSpecificAttribute("bilionario", false);
                deadpool.addSpecificAttribute("patriota", false);
                deadpool.addSpecificAttribute("combateCorpoACorpo", true);
                deadpool.addSpecificAttribute("artesMarciais", true);
                deadpool.addSpecificAttribute("forcaDivina", false);
                deadpool.addSpecificAttribute("manipulacaoDeEnergia", false);
                deadpool.addSpecificAttribute("fazerFeitico", false);
                deadpool.addSpecificAttribute("Maguinetismo", false);

                Features x23 = new Features("Laura Kinney (x23)", "feminino", false, false, "", "anti-heroi",
                                "coadjuvante", false, true, "fator de cura e garras",
                                true, false, false,
                                false, "mutante", false, true,
                                false, false, "");

                x23.addSpecificAttribute("UniversoMarvel", true);
                x23.addSpecificAttribute("vingador", false);
                x23.addSpecificAttribute("traje", true);
                x23.addSpecificAttribute("wakanda", false);
                x23.addSpecificAttribute("xmen", true);
                x23.addSpecificAttribute("regeneracao", true);
                x23.addSpecificAttribute("controleMetal", false);
                x23.addSpecificAttribute("capacete", false);
                x23.addSpecificAttribute("telepatia", false);
                x23.addSpecificAttribute("telecinese", false);
                x23.addSpecificAttribute("voar", false);
                x23.addSpecificAttribute("absorverEnergia", false);
                x23.addSpecificAttribute("inteligenciaArtificial", false);
                x23.addSpecificAttribute("manipulacaoRealidade", false);
                x23.addSpecificAttribute("agilidadeAprimorada", true);
                x23.addSpecificAttribute("realeza", false);
                x23.addSpecificAttribute("raiosGama", false);
                x23.addSpecificAttribute("shield", false);
                x23.addSpecificAttribute("treinamentoEspecial", true);
                x23.addSpecificAttribute("superSoldado", true);
                x23.addSpecificAttribute("bilionario", false);
                x23.addSpecificAttribute("patriota", false);
                x23.addSpecificAttribute("combateCorpoACorpo", true);
                x23.addSpecificAttribute("artesMarciais", true);
                x23.addSpecificAttribute("forcaDivina", false);
                x23.addSpecificAttribute("manipulacaoDeEnergia", false);
                x23.addSpecificAttribute("fazerFeitico", false);
                x23.addSpecificAttribute("Maguinetismo", false);

                Features emmaFrost = new Features("Emma Frost (Rainha Branca)", "feminino", false, false, "",
                                "anti-heroi",
                                "coadjuvante", true, true, "telepatia",
                                false, true, true,
                                true, "mutante", false, false,
                                false, false, "");

                emmaFrost.addSpecificAttribute("UniversoMarvel", true);
                emmaFrost.addSpecificAttribute("vingador", false);
                emmaFrost.addSpecificAttribute("traje", true);
                emmaFrost.addSpecificAttribute("wakanda", false);
                emmaFrost.addSpecificAttribute("xmen", true);
                emmaFrost.addSpecificAttribute("regeneracao", false);
                emmaFrost.addSpecificAttribute("controleMetal", false);
                emmaFrost.addSpecificAttribute("capacete", false);
                emmaFrost.addSpecificAttribute("telepatia", true);
                emmaFrost.addSpecificAttribute("telecinese", false);
                emmaFrost.addSpecificAttribute("voar", false);
                emmaFrost.addSpecificAttribute("absorverEnergia", false);
                emmaFrost.addSpecificAttribute("inteligenciaArtificial", false);
                emmaFrost.addSpecificAttribute("manipulacaoRealidade", false);
                emmaFrost.addSpecificAttribute("agilidadeAprimorada", false);
                emmaFrost.addSpecificAttribute("realeza", false);
                emmaFrost.addSpecificAttribute("raiosGama", false);
                emmaFrost.addSpecificAttribute("shield", false);
                emmaFrost.addSpecificAttribute("treinamentoEspecial", true);
                emmaFrost.addSpecificAttribute("superSoldado", false);
                emmaFrost.addSpecificAttribute("bilionario", true);
                emmaFrost.addSpecificAttribute("patriota", false);
                emmaFrost.addSpecificAttribute("combateCorpoACorpo", false);
                emmaFrost.addSpecificAttribute("artesMarciais", false);
                emmaFrost.addSpecificAttribute("forcaDivina", false);
                emmaFrost.addSpecificAttribute("manipulacaoDeEnergia", false);
                emmaFrost.addSpecificAttribute("fazerFeitico", false);
                emmaFrost.addSpecificAttribute("Maguinetismo", false);

                Features daken = new Features("Daken", "masculino", false, true, "", "vilao",
                                "antagonista", false, true, "fator de cura e garras",
                                false, false, true,
                                true, "mutante", true, true,
                                false, false, "");

                daken.addSpecificAttribute("UniversoMarvel", true);
                daken.addSpecificAttribute("vingador", false);
                daken.addSpecificAttribute("traje", false);
                daken.addSpecificAttribute("wakanda", false);
                daken.addSpecificAttribute("xmen", false);
                daken.addSpecificAttribute("regeneracao", true);
                daken.addSpecificAttribute("controleMetal", false);
                daken.addSpecificAttribute("capacete", false);
                daken.addSpecificAttribute("telepatia", false);
                daken.addSpecificAttribute("telecinese", false);
                daken.addSpecificAttribute("voar", false);
                daken.addSpecificAttribute("absorverEnergia", false);
                daken.addSpecificAttribute("inteligenciaArtificial", false);
                daken.addSpecificAttribute("manipulacaoRealidade", false);
                daken.addSpecificAttribute("agilidadeAprimorada", true);
                daken.addSpecificAttribute("realeza", false);
                daken.addSpecificAttribute("raiosGama", false);
                daken.addSpecificAttribute("shield", false);
                daken.addSpecificAttribute("treinamentoEspecial", true);
                daken.addSpecificAttribute("superSoldado", false);
                daken.addSpecificAttribute("bilionario", false);
                daken.addSpecificAttribute("patriota", false);
                daken.addSpecificAttribute("combateCorpoACorpo", true);
                daken.addSpecificAttribute("artesMarciais", true);
                daken.addSpecificAttribute("forcaDivina", false);
                daken.addSpecificAttribute("manipulacaoDeEnergia", false);
                daken.addSpecificAttribute("fazerFeitico", false);
                daken.addSpecificAttribute("Maguinetismo", false);

                Features havok = new Features("Alexander Summers (havok)", "masculino", false, true, "",
                                "heroi",
                                "coadjuvante", false, true, "emissão de plasma",
                                true, false, true,
                                false, "mutante", false, false,
                                false, false, "");

                havok.addSpecificAttribute("UniversoMarvel", true);
                havok.addSpecificAttribute("vingador", true);
                havok.addSpecificAttribute("traje", true);
                havok.addSpecificAttribute("wakanda", false);
                havok.addSpecificAttribute("xmen", true);
                havok.addSpecificAttribute("regeneracao", false);
                havok.addSpecificAttribute("controleMetal", false);
                havok.addSpecificAttribute("capacete", true);
                havok.addSpecificAttribute("telepatia", false);
                havok.addSpecificAttribute("telecinese", false);
                havok.addSpecificAttribute("voar", false);
                havok.addSpecificAttribute("absorverEnergia", true);
                havok.addSpecificAttribute("inteligenciaArtificial", false);
                havok.addSpecificAttribute("manipulacaoRealidade", false);
                havok.addSpecificAttribute("agilidadeAprimorada", false);
                havok.addSpecificAttribute("realeza", false);
                havok.addSpecificAttribute("raiosGama", false);
                havok.addSpecificAttribute("shield", false);
                havok.addSpecificAttribute("treinamentoEspecial", true);
                havok.addSpecificAttribute("superSoldado", false);
                havok.addSpecificAttribute("bilionario", false);
                havok.addSpecificAttribute("patriota", true);
                havok.addSpecificAttribute("combateCorpoACorpo", true);
                havok.addSpecificAttribute("artesMarciais", true);
                havok.addSpecificAttribute("forcaDivina", false);
                havok.addSpecificAttribute("manipulacaoDeEnergia", true);
                havok.addSpecificAttribute("fazerFeitico", false);
                havok.addSpecificAttribute("Maguinetismo", false);

                Features polaris = new Features("polaris", "feminino", false, false, "", "heroi",
                                "coadjuvante", false, true, "controle do magnetismo",
                                true, false, true,
                                false, "mutante", false, false,
                                false, false, "");

                polaris.addSpecificAttribute("UniversoMarvel", true);
                polaris.addSpecificAttribute("vingador", false);
                polaris.addSpecificAttribute("traje", true);
                polaris.addSpecificAttribute("wakanda", false);
                polaris.addSpecificAttribute("xmen", true);
                polaris.addSpecificAttribute("regeneracao", false);
                polaris.addSpecificAttribute("controleMetal", true);
                polaris.addSpecificAttribute("capacete", false);
                polaris.addSpecificAttribute("telepatia", false);
                polaris.addSpecificAttribute("telecinese", false);
                polaris.addSpecificAttribute("voar", true);
                polaris.addSpecificAttribute("absorverEnergia", false);
                polaris.addSpecificAttribute("inteligenciaArtificial", false);
                polaris.addSpecificAttribute("manipulacaoRealidade", false);
                polaris.addSpecificAttribute("agilidadeAprimorada", false);
                polaris.addSpecificAttribute("realeza", false);
                polaris.addSpecificAttribute("raiosGama", false);
                polaris.addSpecificAttribute("shield", false);
                polaris.addSpecificAttribute("treinamentoEspecial", true);
                polaris.addSpecificAttribute("superSoldado", false);
                polaris.addSpecificAttribute("bilionario", false);
                polaris.addSpecificAttribute("patriota", false);
                polaris.addSpecificAttribute("combateCorpoACorpo", true);
                polaris.addSpecificAttribute("artesMarciais", true);
                polaris.addSpecificAttribute("forcaDivina", false);
                polaris.addSpecificAttribute("manipulacaoDeEnergia", true);
                polaris.addSpecificAttribute("fazerFeitico", false);
                polaris.addSpecificAttribute("Maguinetismo", true);

                Features bishop = new Features("Lucas Bishop", "masculino", false, false, "", "heroi",
                                "coadjuvante", false, true, "absorção e redirecionamento de energia",
                                true, false, true,
                                false, "mutante", false, true,
                                false, false, "");

                bishop.addSpecificAttribute("UniversoMarvel", true);
                bishop.addSpecificAttribute("vingador", false);
                bishop.addSpecificAttribute("traje", true);
                bishop.addSpecificAttribute("wakanda", false);
                bishop.addSpecificAttribute("xmen", true);
                bishop.addSpecificAttribute("regeneracao", false);
                bishop.addSpecificAttribute("controleMetal", false);
                bishop.addSpecificAttribute("capacete", false);
                bishop.addSpecificAttribute("telepatia", false);
                bishop.addSpecificAttribute("telecinese", false);
                bishop.addSpecificAttribute("voar", false);
                bishop.addSpecificAttribute("absorverEnergia", true);
                bishop.addSpecificAttribute("inteligenciaArtificial", false);
                bishop.addSpecificAttribute("manipulacaoRealidade", false);
                bishop.addSpecificAttribute("agilidadeAprimorada", true);
                bishop.addSpecificAttribute("realeza", false);
                bishop.addSpecificAttribute("raiosGama", false);
                bishop.addSpecificAttribute("shield", false);
                bishop.addSpecificAttribute("treinamentoEspecial", true);
                bishop.addSpecificAttribute("superSoldado", false);
                bishop.addSpecificAttribute("bilionario", false);
                bishop.addSpecificAttribute("patriota", true);
                bishop.addSpecificAttribute("combateCorpoACorpo", true);
                bishop.addSpecificAttribute("artesMarciais", true);
                bishop.addSpecificAttribute("forcaDivina", false);
                bishop.addSpecificAttribute("manipulacaoDeEnergia", true);
                bishop.addSpecificAttribute("fazerFeitico", false);
                bishop.addSpecificAttribute("Maguinetismo", false);

                Features forge = new Features("Forge", "masculino", false, false, "", "heroi",
                                "coadjuvante", false, true, "intuição tecnológica",
                                true, true, true,
                                false, "mutante", false, false,
                                false, false, "");

                forge.addSpecificAttribute("UniversoMarvel", true);
                forge.addSpecificAttribute("vingador", false);
                forge.addSpecificAttribute("traje", true);
                forge.addSpecificAttribute("wakanda", false);
                forge.addSpecificAttribute("xmen", true);
                forge.addSpecificAttribute("regeneracao", false);
                forge.addSpecificAttribute("controleMetal", false);
                forge.addSpecificAttribute("capacete", false);
                forge.addSpecificAttribute("telepatia", false);
                forge.addSpecificAttribute("telecinese", false);
                forge.addSpecificAttribute("voar", false);
                forge.addSpecificAttribute("absorverEnergia", false);
                forge.addSpecificAttribute("inteligenciaArtificial", true);
                forge.addSpecificAttribute("manipulacaoRealidade", false);
                forge.addSpecificAttribute("agilidadeAprimorada", false);
                forge.addSpecificAttribute("realeza", false);
                forge.addSpecificAttribute("raiosGama", false);
                forge.addSpecificAttribute("shield", false);
                forge.addSpecificAttribute("treinamentoEspecial", true);
                forge.addSpecificAttribute("superSoldado", false);
                forge.addSpecificAttribute("bilionario", false);
                forge.addSpecificAttribute("patriota", true);
                forge.addSpecificAttribute("combateCorpoACorpo", false);
                forge.addSpecificAttribute("artesMarciais", false);
                forge.addSpecificAttribute("forcaDivina", false);
                forge.addSpecificAttribute("manipulacaoDeEnergia", false);
                forge.addSpecificAttribute("fazerFeitico", false);
                forge.addSpecificAttribute("Maguinetismo", false);

                Features banshee = new Features("Sean Cassidy (banshee)", "masculino", true, false, "",
                                "heroi",
                                "coadjuvante", false, true, "grito sônico",
                                true, false, false,
                                false, "mutante", false, false,
                                false, false, "");

                banshee.addSpecificAttribute("UniversoMarvel", true);
                banshee.addSpecificAttribute("vingador", false);
                banshee.addSpecificAttribute("traje", true);
                banshee.addSpecificAttribute("wakanda", false);
                banshee.addSpecificAttribute("xmen", true);
                banshee.addSpecificAttribute("regeneracao", false);
                banshee.addSpecificAttribute("controleMetal", false);
                banshee.addSpecificAttribute("capacete", false);
                banshee.addSpecificAttribute("telepatia", false);
                banshee.addSpecificAttribute("telecinese", false);
                banshee.addSpecificAttribute("voar", true);
                banshee.addSpecificAttribute("absorverEnergia", false);
                banshee.addSpecificAttribute("inteligenciaArtificial", false);
                banshee.addSpecificAttribute("manipulacaoRealidade", false);
                banshee.addSpecificAttribute("agilidadeAprimorada", false);
                banshee.addSpecificAttribute("realeza", false);
                banshee.addSpecificAttribute("raiosGama", false);
                banshee.addSpecificAttribute("shield", false);
                banshee.addSpecificAttribute("treinamentoEspecial", true);
                banshee.addSpecificAttribute("superSoldado", false);
                banshee.addSpecificAttribute("bilionario", false);
                banshee.addSpecificAttribute("patriota", true);
                banshee.addSpecificAttribute("combateCorpoACorpo", true);
                banshee.addSpecificAttribute("artesMarciais", true);
                banshee.addSpecificAttribute("forcaDivina", false);
                banshee.addSpecificAttribute("manipulacaoDeEnergia", true);
                banshee.addSpecificAttribute("fazerFeitico", false);
                banshee.addSpecificAttribute("Maguinetismo", false);

                Features cable = new Features("Nathan Summers (Cable)", "masculino", true, false, "",
                                "anti-heroi",
                                "coadjuvante", false, true, "telecinese e telepatia",
                                true, true, true,
                                false, "mutante", false, true,
                                false, false, "");

                cable.addSpecificAttribute("UniversoMarvel", true);
                cable.addSpecificAttribute("vingador", false);
                cable.addSpecificAttribute("traje", true);
                cable.addSpecificAttribute("wakanda", false);
                cable.addSpecificAttribute("xmen", true);
                cable.addSpecificAttribute("regeneracao", false);
                cable.addSpecificAttribute("controleMetal", false);
                cable.addSpecificAttribute("capacete", false);
                cable.addSpecificAttribute("telepatia", true);
                cable.addSpecificAttribute("telecinese", true);
                cable.addSpecificAttribute("voar", false);
                cable.addSpecificAttribute("absorverEnergia", false);
                cable.addSpecificAttribute("inteligenciaArtificial", true);
                cable.addSpecificAttribute("manipulacaoRealidade", false);
                cable.addSpecificAttribute("agilidadeAprimorada", true);
                cable.addSpecificAttribute("realeza", false);
                cable.addSpecificAttribute("raiosGama", false);
                cable.addSpecificAttribute("shield", false);
                cable.addSpecificAttribute("treinamentoEspecial", true);
                cable.addSpecificAttribute("superSoldado", true);
                cable.addSpecificAttribute("bilionario", false);
                cable.addSpecificAttribute("patriota", false);
                cable.addSpecificAttribute("combateCorpoACorpo", true);
                cable.addSpecificAttribute("artesMarciais", true);
                cable.addSpecificAttribute("forcaDivina", false);
                cable.addSpecificAttribute("manipulacaoDeEnergia", true);
                cable.addSpecificAttribute("fazerFeitico", false);
                cable.addSpecificAttribute("Maguinetismo", false);

                Features senhorFantastico = new Features("Senhor Fantástico", "masculino", true, false, "",
                                "heroi",
                                "protagonista", false, true, "elasticidade",
                                true, true, true,
                                false, "humano mutado", false, false,
                                false, false, "");

                senhorFantastico.addSpecificAttribute("UniversoMarvel", true);
                senhorFantastico.addSpecificAttribute("vingador", true);
                senhorFantastico.addSpecificAttribute("traje", true);
                senhorFantastico.addSpecificAttribute("wakanda", false);
                senhorFantastico.addSpecificAttribute("xmen", false);
                senhorFantastico.addSpecificAttribute("regeneracao", false);
                senhorFantastico.addSpecificAttribute("controleMetal", false);
                senhorFantastico.addSpecificAttribute("capacete", false);
                senhorFantastico.addSpecificAttribute("telepatia", false);
                senhorFantastico.addSpecificAttribute("telecinese", false);
                senhorFantastico.addSpecificAttribute("voar", false);
                senhorFantastico.addSpecificAttribute("absorverEnergia", false);
                senhorFantastico.addSpecificAttribute("inteligenciaArtificial", true);
                senhorFantastico.addSpecificAttribute("manipulacaoRealidade", false);
                senhorFantastico.addSpecificAttribute("agilidadeAprimorada", false);
                senhorFantastico.addSpecificAttribute("realeza", false);
                senhorFantastico.addSpecificAttribute("raiosGama", true);
                senhorFantastico.addSpecificAttribute("shield", false);
                senhorFantastico.addSpecificAttribute("treinamentoEspecial", true);
                senhorFantastico.addSpecificAttribute("superSoldado", false);
                senhorFantastico.addSpecificAttribute("bilionario", true);
                senhorFantastico.addSpecificAttribute("patriota", true);
                senhorFantastico.addSpecificAttribute("combateCorpoACorpo", false);
                senhorFantastico.addSpecificAttribute("artesMarciais", false);
                senhorFantastico.addSpecificAttribute("forcaDivina", false);
                senhorFantastico.addSpecificAttribute("manipulacaoDeEnergia", false);
                senhorFantastico.addSpecificAttribute("fazerFeitico", false);
                senhorFantastico.addSpecificAttribute("Maguinetismo", false);

                Features mulherInvisivel = new Features("Mulher invisível", "feminino", true, false, "",
                                "heroi",
                                "protagonista", false, true, "invisibilidade e campos de força",
                                true, true, true,
                                false, "humano mutado", false, false,
                                false, false, "");

                mulherInvisivel.addSpecificAttribute("UniversoMarvel", true);
                mulherInvisivel.addSpecificAttribute("vingador", true);
                mulherInvisivel.addSpecificAttribute("traje", true);
                mulherInvisivel.addSpecificAttribute("wakanda", false);
                mulherInvisivel.addSpecificAttribute("xmen", false);
                mulherInvisivel.addSpecificAttribute("regeneracao", false);
                mulherInvisivel.addSpecificAttribute("controleMetal", false);
                mulherInvisivel.addSpecificAttribute("capacete", false);
                mulherInvisivel.addSpecificAttribute("telepatia", false);
                mulherInvisivel.addSpecificAttribute("telecinese", true);
                mulherInvisivel.addSpecificAttribute("voar", false);
                mulherInvisivel.addSpecificAttribute("absorverEnergia", false);
                mulherInvisivel.addSpecificAttribute("inteligenciaArtificial", false);
                mulherInvisivel.addSpecificAttribute("manipulacaoRealidade", false);
                mulherInvisivel.addSpecificAttribute("agilidadeAprimorada", false);
                mulherInvisivel.addSpecificAttribute("realeza", false);
                mulherInvisivel.addSpecificAttribute("raiosGama", true);
                mulherInvisivel.addSpecificAttribute("shield", true);
                mulherInvisivel.addSpecificAttribute("treinamentoEspecial", true);
                mulherInvisivel.addSpecificAttribute("superSoldado", false);
                mulherInvisivel.addSpecificAttribute("bilionario", true);
                mulherInvisivel.addSpecificAttribute("patriota", true);
                mulherInvisivel.addSpecificAttribute("combateCorpoACorpo", true);
                mulherInvisivel.addSpecificAttribute("artesMarciais", true);
                mulherInvisivel.addSpecificAttribute("forcaDivina", false);
                mulherInvisivel.addSpecificAttribute("manipulacaoDeEnergia", true);
                mulherInvisivel.addSpecificAttribute("fazerFeitico", false);
                mulherInvisivel.addSpecificAttribute("Maguinetismo", false);

                Features tochaHumana = new Features("Tocha humana", "masculino", false, true, "", "heroi",
                                "protagonista", true, true, "manipulação de fogo",
                                true, false, false,
                                false, "humano mutado", true, false,
                                false, false, "");

                tochaHumana.addSpecificAttribute("UniversoMarvel", true);
                tochaHumana.addSpecificAttribute("vingador", true);
                tochaHumana.addSpecificAttribute("traje", true);
                tochaHumana.addSpecificAttribute("wakanda", false);
                tochaHumana.addSpecificAttribute("xmen", false);
                tochaHumana.addSpecificAttribute("regeneracao", false);
                tochaHumana.addSpecificAttribute("controleMetal", false);
                tochaHumana.addSpecificAttribute("capacete", false);
                tochaHumana.addSpecificAttribute("telepatia", false);
                tochaHumana.addSpecificAttribute("telecinese", false);
                tochaHumana.addSpecificAttribute("voar", true);
                tochaHumana.addSpecificAttribute("absorverEnergia", true);
                tochaHumana.addSpecificAttribute("inteligenciaArtificial", false);
                tochaHumana.addSpecificAttribute("manipulacaoRealidade", false);
                tochaHumana.addSpecificAttribute("agilidadeAprimorada", true);
                tochaHumana.addSpecificAttribute("realeza", false);
                tochaHumana.addSpecificAttribute("raiosGama", true);
                tochaHumana.addSpecificAttribute("shield", false);
                tochaHumana.addSpecificAttribute("treinamentoEspecial", true);
                tochaHumana.addSpecificAttribute("superSoldado", false);
                tochaHumana.addSpecificAttribute("bilionario", true);
                tochaHumana.addSpecificAttribute("patriota", true);
                tochaHumana.addSpecificAttribute("combateCorpoACorpo", true);
                tochaHumana.addSpecificAttribute("artesMarciais", true);
                tochaHumana.addSpecificAttribute("forcaDivina", false);
                tochaHumana.addSpecificAttribute("manipulacaoDeEnergia", true);
                tochaHumana.addSpecificAttribute("fazerFeitico", false);
                tochaHumana.addSpecificAttribute("Maguinetismo", false);

                Features coisa = new Features("Coisa", "masculino", false, false, "", "heroi",
                                "protagonista", true, true, "força sobre-humana",
                                true, false, false,
                                false, "humano mutado", false, true,
                                false, false, "");

                coisa.addSpecificAttribute("UniversoMarvel", true);
                coisa.addSpecificAttribute("vingador", true);
                coisa.addSpecificAttribute("traje", false);
                coisa.addSpecificAttribute("wakanda", false);
                coisa.addSpecificAttribute("xmen", false);
                coisa.addSpecificAttribute("regeneracao", true);
                coisa.addSpecificAttribute("controleMetal", false);
                coisa.addSpecificAttribute("capacete", false);
                coisa.addSpecificAttribute("telepatia", false);
                coisa.addSpecificAttribute("telecinese", false);
                coisa.addSpecificAttribute("voar", false);
                coisa.addSpecificAttribute("absorverEnergia", false);
                coisa.addSpecificAttribute("inteligenciaArtificial", false);
                coisa.addSpecificAttribute("manipulacaoRealidade", false);
                coisa.addSpecificAttribute("agilidadeAprimorada", false);
                coisa.addSpecificAttribute("realeza", false);
                coisa.addSpecificAttribute("raiosGama", true);
                coisa.addSpecificAttribute("shield", false);
                coisa.addSpecificAttribute("treinamentoEspecial", true);
                coisa.addSpecificAttribute("superSoldado", false);
                coisa.addSpecificAttribute("bilionario", true);
                coisa.addSpecificAttribute("patriota", true);
                coisa.addSpecificAttribute("combateCorpoACorpo", true);
                coisa.addSpecificAttribute("artesMarciais", true);
                coisa.addSpecificAttribute("forcaDivina", false);
                coisa.addSpecificAttribute("manipulacaoDeEnergia", false);
                coisa.addSpecificAttribute("fazerFeitico", false);
                coisa.addSpecificAttribute("Maguinetismo", false);

                Features doutorDestino = new Features("Doutor Destino", "masculino", false, false, "", "vilao",
                                "antagonista", false, true, "magia",
                                false, true, true,
                                true, "humano", false, true,
                                false, true, "");

                doutorDestino.addSpecificAttribute("UniversoMarvel", true);
                doutorDestino.addSpecificAttribute("vingador", false);
                doutorDestino.addSpecificAttribute("traje", true);
                doutorDestino.addSpecificAttribute("wakanda", false);
                doutorDestino.addSpecificAttribute("xmen", false);
                doutorDestino.addSpecificAttribute("regeneracao", false);
                doutorDestino.addSpecificAttribute("controleMetal", false);
                doutorDestino.addSpecificAttribute("capacete", true);
                doutorDestino.addSpecificAttribute("telepatia", false);
                doutorDestino.addSpecificAttribute("telecinese", false);
                doutorDestino.addSpecificAttribute("voar", true);
                doutorDestino.addSpecificAttribute("absorverEnergia", true);
                doutorDestino.addSpecificAttribute("inteligenciaArtificial", true);
                doutorDestino.addSpecificAttribute("manipulacaoRealidade", false);
                doutorDestino.addSpecificAttribute("agilidadeAprimorada", false);
                doutorDestino.addSpecificAttribute("realeza", true);
                doutorDestino.addSpecificAttribute("raiosGama", false);
                doutorDestino.addSpecificAttribute("shield", true);
                doutorDestino.addSpecificAttribute("treinamentoEspecial", true);
                doutorDestino.addSpecificAttribute("superSoldado", false);
                doutorDestino.addSpecificAttribute("bilionario", true);
                doutorDestino.addSpecificAttribute("patriota", false);
                doutorDestino.addSpecificAttribute("combateCorpoACorpo", true);
                doutorDestino.addSpecificAttribute("artesMarciais", true);
                doutorDestino.addSpecificAttribute("forcaDivina", false);
                doutorDestino.addSpecificAttribute("manipulacaoDeEnergia", false);
                doutorDestino.addSpecificAttribute("fazerFeitico", false);
                doutorDestino.addSpecificAttribute("forcaDivina", false);
                doutorDestino.addSpecificAttribute("manipulacaoDeEnergia", true);
                doutorDestino.addSpecificAttribute("fazerFeitico", true);
                doutorDestino.addSpecificAttribute("Maguinetismo", false);

                Features surfistaPrateado = new Features("Surfista Prateado", "masculino", false, false, "",
                                "heroi",
                                "coadjuvante", true, true, "poder cósmico",
                                true, true, true,
                                false, "alienigena", false, false,
                                false, false, "");

                surfistaPrateado.addSpecificAttribute("UniversoMarvel", true);
                surfistaPrateado.addSpecificAttribute("vingador", false);
                surfistaPrateado.addSpecificAttribute("traje", false);
                surfistaPrateado.addSpecificAttribute("wakanda", false);
                surfistaPrateado.addSpecificAttribute("xmen", false);
                surfistaPrateado.addSpecificAttribute("regeneracao", true);
                surfistaPrateado.addSpecificAttribute("controleMetal", false);
                surfistaPrateado.addSpecificAttribute("capacete", false);
                surfistaPrateado.addSpecificAttribute("telepatia", true);
                surfistaPrateado.addSpecificAttribute("telecinese", true);
                surfistaPrateado.addSpecificAttribute("voar", true);
                surfistaPrateado.addSpecificAttribute("absorverEnergia", true);
                surfistaPrateado.addSpecificAttribute("inteligenciaArtificial", false);
                surfistaPrateado.addSpecificAttribute("manipulacaoRealidade", true);
                surfistaPrateado.addSpecificAttribute("agilidadeAprimorada", true);
                surfistaPrateado.addSpecificAttribute("realeza", false);
                surfistaPrateado.addSpecificAttribute("raiosGama", false);
                surfistaPrateado.addSpecificAttribute("shield", false);
                surfistaPrateado.addSpecificAttribute("treinamentoEspecial", false);
                surfistaPrateado.addSpecificAttribute("superSoldado", false);
                surfistaPrateado.addSpecificAttribute("bilionario", false);
                surfistaPrateado.addSpecificAttribute("patriota", false);
                surfistaPrateado.addSpecificAttribute("combateCorpoACorpo", true);
                surfistaPrateado.addSpecificAttribute("artesMarciais", false);
                surfistaPrateado.addSpecificAttribute("forcaDivina", true);
                surfistaPrateado.addSpecificAttribute("manipulacaoDeEnergia", true);
                surfistaPrateado.addSpecificAttribute("fazerFeitico", false);
                surfistaPrateado.addSpecificAttribute("Maguinetismo", false);

                Features galactus = new Features("Galactus", "masculino", false, false, "", "vilao",
                                "antagonista", true, true, "poder cósmico",
                                false, true, true,
                                false, "entidade cósmica", false, false,
                                false, false, "");

                galactus.addSpecificAttribute("UniversoMarvel", true);
                galactus.addSpecificAttribute("vingador", false);
                galactus.addSpecificAttribute("traje", true);
                galactus.addSpecificAttribute("wakanda", false);
                galactus.addSpecificAttribute("xmen", false);
                galactus.addSpecificAttribute("regeneracao", true);
                galactus.addSpecificAttribute("controleMetal", true);
                galactus.addSpecificAttribute("capacete", true);
                galactus.addSpecificAttribute("telepatia", true);
                galactus.addSpecificAttribute("telecinese", true);
                galactus.addSpecificAttribute("voar", true);
                galactus.addSpecificAttribute("absorverEnergia", true);
                galactus.addSpecificAttribute("inteligenciaArtificial", false);
                galactus.addSpecificAttribute("manipulacaoRealidade", true);
                galactus.addSpecificAttribute("agilidadeAprimorada", false);
                galactus.addSpecificAttribute("realeza", false);
                galactus.addSpecificAttribute("raiosGama", false);
                galactus.addSpecificAttribute("shield", false);
                galactus.addSpecificAttribute("treinamentoEspecial", false);
                galactus.addSpecificAttribute("superSoldado", false);
                galactus.addSpecificAttribute("bilionario", false);
                galactus.addSpecificAttribute("patriota", false);
                galactus.addSpecificAttribute("combateCorpoACorpo", false);
                galactus.addSpecificAttribute("artesMarciais", false);
                galactus.addSpecificAttribute("forcaDivina", true);
                galactus.addSpecificAttribute("manipulacaoDeEnergia", true);
                galactus.addSpecificAttribute("fazerFeitico", true);
                galactus.addSpecificAttribute("Maguinetismo", true);

                Features namor = new Features("Namor", "masculino", true, false, "", "anti-heroi",
                                "coadjuvante", false, true, "força aquática",
                                false, false, true,
                                true, "híbrido", false, false,
                                true, true, "");

                namor.addSpecificAttribute("UniversoMarvel", true);
                namor.addSpecificAttribute("vingador", true);
                namor.addSpecificAttribute("traje", false);
                namor.addSpecificAttribute("wakanda", false);
                namor.addSpecificAttribute("xmen", false);
                namor.addSpecificAttribute("regeneracao", true);
                namor.addSpecificAttribute("controleMetal", false);
                namor.addSpecificAttribute("capacete", false);
                namor.addSpecificAttribute("telepatia", false);
                namor.addSpecificAttribute("telecinese", false);
                namor.addSpecificAttribute("voar", true);
                namor.addSpecificAttribute("absorverEnergia", false);
                namor.addSpecificAttribute("inteligenciaArtificial", false);
                namor.addSpecificAttribute("manipulacaoRealidade", false);
                namor.addSpecificAttribute("agilidadeAprimorada", true);
                namor.addSpecificAttribute("realeza", true);
                namor.addSpecificAttribute("raiosGama", false);
                namor.addSpecificAttribute("shield", false);
                namor.addSpecificAttribute("treinamentoEspecial", true);
                namor.addSpecificAttribute("superSoldado", false);
                namor.addSpecificAttribute("bilionario", true);
                namor.addSpecificAttribute("patriota", true);
                namor.addSpecificAttribute("combateCorpoACorpo", true);
                namor.addSpecificAttribute("artesMarciais", true);
                namor.addSpecificAttribute("forcaDivina", false);
                namor.addSpecificAttribute("manipulacaoDeEnergia", false);
                namor.addSpecificAttribute("fazerFeitico", false);
                namor.addSpecificAttribute("Maguinetismo", false);

                Features raionegro = new Features("Raio negro", "masculino", true, false, "", "heroi",
                                "coadjuvante", false, true, "voz destrutiva",
                                true, false, true,
                                false, "inumano", false, false,
                                false, true, "");

                raionegro.addSpecificAttribute("UniversoMarvel", true);
                raionegro.addSpecificAttribute("vingador", true);
                raionegro.addSpecificAttribute("traje", true);
                raionegro.addSpecificAttribute("wakanda", false);
                raionegro.addSpecificAttribute("xmen", false);
                raionegro.addSpecificAttribute("regeneracao", false);
                raionegro.addSpecificAttribute("controleMetal", false);
                raionegro.addSpecificAttribute("capacete", false);
                raionegro.addSpecificAttribute("telepatia", false);
                raionegro.addSpecificAttribute("telecinese", false);
                raionegro.addSpecificAttribute("voar", true);
                raionegro.addSpecificAttribute("absorverEnergia", true);
                raionegro.addSpecificAttribute("inteligenciaArtificial", false);
                raionegro.addSpecificAttribute("manipulacaoRealidade", false);
                raionegro.addSpecificAttribute("agilidadeAprimorada", true);
                raionegro.addSpecificAttribute("realeza", true);
                raionegro.addSpecificAttribute("raiosGama", false);
                raionegro.addSpecificAttribute("shield", false);
                raionegro.addSpecificAttribute("treinamentoEspecial", true);
                raionegro.addSpecificAttribute("superSoldado", false);
                raionegro.addSpecificAttribute("bilionario", false);
                raionegro.addSpecificAttribute("patriota", true);
                raionegro.addSpecificAttribute("combateCorpoACorpo", true);
                raionegro.addSpecificAttribute("artesMarciais", true);
                raionegro.addSpecificAttribute("forcaDivina", false);
                raionegro.addSpecificAttribute("manipulacaoDeEnergia", true);
                raionegro.addSpecificAttribute("fazerFeitico", false);
                raionegro.addSpecificAttribute("Maguinetismo", false);

                Features thanos = new Features("Thanos", "masculino", true, false, "", "vilao",
                                "antagonista", false, true, "força e resistência sobre-humanas",
                                false, true, true,
                                true, "eterno", false, false,
                                false, false, "");

                thanos.addSpecificAttribute("UniversoMarvel", true);
                thanos.addSpecificAttribute("vingador", false);
                thanos.addSpecificAttribute("traje", true);
                thanos.addSpecificAttribute("wakanda", false);
                thanos.addSpecificAttribute("xmen", false);
                thanos.addSpecificAttribute("regeneracao", true);
                thanos.addSpecificAttribute("controleMetal", false);
                thanos.addSpecificAttribute("capacete", true);
                thanos.addSpecificAttribute("telepatia", false);
                thanos.addSpecificAttribute("telecinese", true);
                thanos.addSpecificAttribute("voar", true);
                thanos.addSpecificAttribute("absorverEnergia", true);
                thanos.addSpecificAttribute("inteligenciaArtificial", false);
                thanos.addSpecificAttribute("manipulacaoRealidade", true);
                thanos.addSpecificAttribute("agilidadeAprimorada", true);
                thanos.addSpecificAttribute("realeza", false);
                thanos.addSpecificAttribute("raiosGama", false);
                thanos.addSpecificAttribute("shield", false);
                thanos.addSpecificAttribute("treinamentoEspecial", true);
                thanos.addSpecificAttribute("superSoldado", false);
                thanos.addSpecificAttribute("bilionario", false);
                thanos.addSpecificAttribute("patriota", false);
                thanos.addSpecificAttribute("combateCorpoACorpo", true);
                thanos.addSpecificAttribute("artesMarciais", true);
                thanos.addSpecificAttribute("forcaDivina", true);
                thanos.addSpecificAttribute("manipulacaoDeEnergia", true);
                thanos.addSpecificAttribute("fazerFeitico", false);
                thanos.addSpecificAttribute("Maguinetismo", false);

                Features ultron = new Features("Ultron", "masculino", false, false, "", "vilao",
                                "antagonista", true, true, "inteligência artificial avançada",
                                false, true, true,
                                true, "robô", false, false,
                                false, false, "");

                ultron.addSpecificAttribute("UniversoMarvel", true);
                ultron.addSpecificAttribute("vingador", false);
                ultron.addSpecificAttribute("traje", true);
                ultron.addSpecificAttribute("wakanda", false);
                ultron.addSpecificAttribute("xmen", false);
                ultron.addSpecificAttribute("regeneracao", true);
                ultron.addSpecificAttribute("controleMetal", true);
                ultron.addSpecificAttribute("capacete", false);
                ultron.addSpecificAttribute("telepatia", false);
                ultron.addSpecificAttribute("telecinese", false);
                ultron.addSpecificAttribute("voar", true);
                ultron.addSpecificAttribute("absorverEnergia", true);
                ultron.addSpecificAttribute("inteligenciaArtificial", true);
                ultron.addSpecificAttribute("manipulacaoRealidade", false);
                ultron.addSpecificAttribute("agilidadeAprimorada", true);
                ultron.addSpecificAttribute("realeza", false);
                ultron.addSpecificAttribute("raiosGama", false);
                ultron.addSpecificAttribute("shield", false);
                ultron.addSpecificAttribute("treinamentoEspecial", false);
                ultron.addSpecificAttribute("superSoldado", false);
                ultron.addSpecificAttribute("bilionario", false);
                ultron.addSpecificAttribute("patriota", false);
                ultron.addSpecificAttribute("combateCorpoACorpo", true);
                ultron.addSpecificAttribute("artesMarciais", true);
                ultron.addSpecificAttribute("forcaDivina", false);
                ultron.addSpecificAttribute("manipulacaoDeEnergia", true);
                ultron.addSpecificAttribute("fazerFeitico", false);
                ultron.addSpecificAttribute("Maguinetismo", false);

                Features loki = new Features("Loki", "masculino", true, true, "", "vilao",
                                "antagonista", false, true, "magia",
                                false, true, true,
                                true, "gigante de gelo", true, false,
                                false, true, "");

                loki.addSpecificAttribute("UniversoMarvel", true);
                loki.addSpecificAttribute("vingador", false);
                loki.addSpecificAttribute("traje", true);
                loki.addSpecificAttribute("wakanda", false);
                loki.addSpecificAttribute("xmen", false);
                loki.addSpecificAttribute("regeneracao", true);
                loki.addSpecificAttribute("controleMetal", false);
                loki.addSpecificAttribute("capacete", true);
                loki.addSpecificAttribute("telepatia", false);
                loki.addSpecificAttribute("telecinese", false);
                loki.addSpecificAttribute("voar", false);
                loki.addSpecificAttribute("absorverEnergia", false);
                loki.addSpecificAttribute("inteligenciaArtificial", false);
                loki.addSpecificAttribute("manipulacaoRealidade", true);
                loki.addSpecificAttribute("agilidadeAprimorada", true);
                loki.addSpecificAttribute("realeza", true);
                loki.addSpecificAttribute("raiosGama", false);
                loki.addSpecificAttribute("shield", false);
                loki.addSpecificAttribute("treinamentoEspecial", true);
                loki.addSpecificAttribute("superSoldado", false);
                loki.addSpecificAttribute("bilionario", false);
                loki.addSpecificAttribute("patriota", false);
                loki.addSpecificAttribute("combateCorpoACorpo", true);
                loki.addSpecificAttribute("artesMarciais", true);
                loki.addSpecificAttribute("forcaDivina", true);
                loki.addSpecificAttribute("manipulacaoDeEnergia", true);
                loki.addSpecificAttribute("fazerFeitico", true);
                loki.addSpecificAttribute("Maguinetismo", false);

                Features venom = new Features("Venom", "masculino", false, false, "", "anti-heroi",
                                "antagonista", true, true, "simbionte",
                                false, false, false,
                                true, "humano simbionte", true, false,
                                false, false, "");

                venom.addSpecificAttribute("UniversoMarvel", true);
                venom.addSpecificAttribute("vingador", false);
                venom.addSpecificAttribute("traje", true);
                venom.addSpecificAttribute("wakanda", false);
                venom.addSpecificAttribute("xmen", false);
                venom.addSpecificAttribute("regeneracao", true);
                venom.addSpecificAttribute("controleMetal", false);
                venom.addSpecificAttribute("capacete", false);
                venom.addSpecificAttribute("telepatia", false);
                venom.addSpecificAttribute("telecinese", false);
                venom.addSpecificAttribute("voar", false);
                venom.addSpecificAttribute("absorverEnergia", false);
                venom.addSpecificAttribute("inteligenciaArtificial", false);
                venom.addSpecificAttribute("manipulacaoRealidade", false);
                venom.addSpecificAttribute("agilidadeAprimorada", true);
                venom.addSpecificAttribute("realeza", false);
                venom.addSpecificAttribute("raiosGama", false);
                venom.addSpecificAttribute("shield", false);
                venom.addSpecificAttribute("treinamentoEspecial", false);
                venom.addSpecificAttribute("superSoldado", false);
                venom.addSpecificAttribute("bilionario", false);
                venom.addSpecificAttribute("patriota", false);
                venom.addSpecificAttribute("combateCorpoACorpo", true);
                venom.addSpecificAttribute("artesMarciais", false);
                venom.addSpecificAttribute("forcaDivina", false);
                venom.addSpecificAttribute("manipulacaoDeEnergia", false);
                venom.addSpecificAttribute("fazerFeitico", false);
                venom.addSpecificAttribute("Maguinetismo", false);

                Features duendeverde = new Features("Duende verde", "masculino", true, false, "", "vilao",
                                "antagonista", true, true, "força aprimorada e equipamentos",
                                false, true, true,
                                true, "humano", true, false,
                                false, false, "");

                duendeverde.addSpecificAttribute("UniversoMarvel", true);
                duendeverde.addSpecificAttribute("vingador", false);
                duendeverde.addSpecificAttribute("traje", true);
                duendeverde.addSpecificAttribute("wakanda", false);
                duendeverde.addSpecificAttribute("xmen", false);
                duendeverde.addSpecificAttribute("regeneracao", true);
                duendeverde.addSpecificAttribute("controleMetal", false);
                duendeverde.addSpecificAttribute("capacete", true);
                duendeverde.addSpecificAttribute("telepatia", false);
                duendeverde.addSpecificAttribute("telecinese", false);
                duendeverde.addSpecificAttribute("voar", true);
                duendeverde.addSpecificAttribute("absorverEnergia", false);
                duendeverde.addSpecificAttribute("inteligenciaArtificial", false);
                duendeverde.addSpecificAttribute("manipulacaoRealidade", false);
                duendeverde.addSpecificAttribute("agilidadeAprimorada", true);
                duendeverde.addSpecificAttribute("realeza", false);
                duendeverde.addSpecificAttribute("raiosGama", false);
                duendeverde.addSpecificAttribute("shield", false);
                duendeverde.addSpecificAttribute("treinamentoEspecial", true);
                duendeverde.addSpecificAttribute("superSoldado", true);
                duendeverde.addSpecificAttribute("bilionario", true);
                duendeverde.addSpecificAttribute("patriota", false);
                duendeverde.addSpecificAttribute("combateCorpoACorpo", true);
                duendeverde.addSpecificAttribute("artesMarciais", true);
                duendeverde.addSpecificAttribute("forcaDivina", false);
                duendeverde.addSpecificAttribute("manipulacaoDeEnergia", false);
                duendeverde.addSpecificAttribute("fazerFeitico", false);
                duendeverde.addSpecificAttribute("Maguinetismo", false);

                Features carnificina = new Features("Carnificina", "masculino", false, false, "", "vilao",
                                "antagonista", true, true, "simbionte",
                                false, false, false,
                                true, "humano simbionte", true, true,
                                false, false, "");

                carnificina.addSpecificAttribute("UniversoMarvel", true);
                carnificina.addSpecificAttribute("vingador", false);
                carnificina.addSpecificAttribute("traje", true);
                carnificina.addSpecificAttribute("wakanda", false);
                carnificina.addSpecificAttribute("xmen", false);
                carnificina.addSpecificAttribute("regeneracao", true);
                carnificina.addSpecificAttribute("controleMetal", false);
                carnificina.addSpecificAttribute("capacete", false);
                carnificina.addSpecificAttribute("telepatia", false);
                carnificina.addSpecificAttribute("telecinese", false);
                carnificina.addSpecificAttribute("voar", false);
                carnificina.addSpecificAttribute("absorverEnergia", false);
                carnificina.addSpecificAttribute("inteligenciaArtificial", false);
                carnificina.addSpecificAttribute("manipulacaoRealidade", false);
                carnificina.addSpecificAttribute("agilidadeAprimorada", true);
                carnificina.addSpecificAttribute("realeza", false);
                carnificina.addSpecificAttribute("raiosGama", false);
                carnificina.addSpecificAttribute("shield", false);
                carnificina.addSpecificAttribute("treinamentoEspecial", false);
                carnificina.addSpecificAttribute("superSoldado", false);
                carnificina.addSpecificAttribute("bilionario", false);
                carnificina.addSpecificAttribute("patriota", false);
                carnificina.addSpecificAttribute("combateCorpoACorpo", true);
                carnificina.addSpecificAttribute("artesMarciais", false);
                carnificina.addSpecificAttribute("forcaDivina", false);
                carnificina.addSpecificAttribute("manipulacaoDeEnergia", false);
                carnificina.addSpecificAttribute("fazerFeitico", false);
                carnificina.addSpecificAttribute("Maguinetismo", false);

                listaPersonagens.add(homemDeFerro);
                listaPersonagens.add(capitaoAmerica);
                listaPersonagens.add(thor);
                listaPersonagens.add(hulk);
                listaPersonagens.add(viuvaNegra);
                listaPersonagens.add(gaviaoArqueiro);
                listaPersonagens.add(feiticeiraEscarlate);
                listaPersonagens.add(visao);
                listaPersonagens.add(homemAranha);
                listaPersonagens.add(panteraNegra);
                listaPersonagens.add(capitaMarvel);
                listaPersonagens.add(maquinaDeCombate);
                listaPersonagens.add(falcao);
                listaPersonagens.add(soldadoInvernal);
                listaPersonagens.add(homemFormiga);
                listaPersonagens.add(vespa);
                listaPersonagens.add(doutorEstranho);
                listaPersonagens.add(cavaleiroNegro);
                listaPersonagens.add(sheHulk);
                listaPersonagens.add(mercurio);
                listaPersonagens.add(ciclope);
                listaPersonagens.add(jeanGrey);
                listaPersonagens.add(wolverine);
                listaPersonagens.add(tempestade);
                listaPersonagens.add(fera);
                listaPersonagens.add(magneto);
                listaPersonagens.add(vampira);
                listaPersonagens.add(gambit);
                listaPersonagens.add(noturno);
                listaPersonagens.add(colossus);
                listaPersonagens.add(kittyPryde);
                listaPersonagens.add(homemDeGelo);
                listaPersonagens.add(angel);
                listaPersonagens.add(professorX);
                listaPersonagens.add(jubilee);
                listaPersonagens.add(psylocke);
                listaPersonagens.add(deadpool);
                listaPersonagens.add(x23);
                listaPersonagens.add(emmaFrost);
                listaPersonagens.add(daken);
                listaPersonagens.add(havok);
                listaPersonagens.add(polaris);
                listaPersonagens.add(bishop);
                listaPersonagens.add(forge);
                listaPersonagens.add(banshee);
                listaPersonagens.add(cable);
                listaPersonagens.add(senhorFantastico);
                listaPersonagens.add(mulherInvisivel);
                listaPersonagens.add(tochaHumana);
                listaPersonagens.add(coisa);
                listaPersonagens.add(doutorDestino);
                listaPersonagens.add(surfistaPrateado);
                listaPersonagens.add(galactus);
                listaPersonagens.add(namor);
                listaPersonagens.add(raionegro);
                listaPersonagens.add(thanos);
                listaPersonagens.add(ultron);
                listaPersonagens.add(loki);
                listaPersonagens.add(venom);
                listaPersonagens.add(duendeverde);
                listaPersonagens.add(carnificina);

        }
}
