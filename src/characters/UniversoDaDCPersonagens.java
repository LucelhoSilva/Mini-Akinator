package src.characters;

import java.util.List;

import src.controllers.Features;

public class UniversoDaDCPersonagens {
  public static void adicionarPersonagens(List<Features> listaPersonagens) {
    Features superman = new Features("Superman", "masculino", true, false, "", "heroi",
        "protagonista", false, true, "",
        true, true, true,
        false, "kryptoniano", false, false,
        false, false, "");

    superman.addSpecificAttribute("DCComics", true);
    superman.addSpecificAttribute("ligaDaJustica", true);
    superman.addSpecificAttribute("metropolis", true);
    superman.addSpecificAttribute("gothamCity", false);
    superman.addSpecificAttribute("themyscira", false);
    superman.addSpecificAttribute("centralCity", false);
    superman.addSpecificAttribute("coastCity", false);
    superman.addSpecificAttribute("atlantis", false);
    superman.addSpecificAttribute("apokolips", false);
    superman.addSpecificAttribute("voar", true);
    superman.addSpecificAttribute("superForca", true);
    superman.addSpecificAttribute("superVelocidade", true);
    superman.addSpecificAttribute("visaoDeRaioX", true);
    superman.addSpecificAttribute("visaoDeCalor", true);
    superman.addSpecificAttribute("superSopro", true);
    superman.addSpecificAttribute("traje", true);
    superman.addSpecificAttribute("regeneracao", true);
    superman.addSpecificAttribute("controleMetal", false);
    superman.addSpecificAttribute("capacete", false);
    superman.addSpecificAttribute("telepatia", false);
    superman.addSpecificAttribute("telecinese", false);
    superman.addSpecificAttribute("absorverEnergia", true);
    superman.addSpecificAttribute("inteligenciaArtificial", false);
    superman.addSpecificAttribute("manipulacaoRealidade", false);
    superman.addSpecificAttribute("agilidadeAprimorada", true);
    superman.addSpecificAttribute("realeza", false);
    superman.addSpecificAttribute("treinamentoEspecial", true);
    superman.addSpecificAttribute("superSoldado", false);
    superman.addSpecificAttribute("bilionario", false);
    superman.addSpecificAttribute("patriota", true);
    superman.addSpecificAttribute("combateCorpoACorpo", true);
    superman.addSpecificAttribute("artesMarciais", true);
    superman.addSpecificAttribute("forcaDivina", true);
    superman.addSpecificAttribute("manipulacaoDeEnergia", true);
    superman.addSpecificAttribute("fazerFeitico", false);
    superman.addSpecificAttribute("Maguinetismo", false);

    Features lexLuthor = new Features("Lex Luthor", "masculino", false, false, "", "vilao",
        "antagonista", false, false, "",
        false, true, true,
        true, "humano", true, false,
        true, true, "");

    lexLuthor.addSpecificAttribute("DCComics", true);
    lexLuthor.addSpecificAttribute("ligaDaJustica", false);
    lexLuthor.addSpecificAttribute("metropolis", true);
    lexLuthor.addSpecificAttribute("gothamCity", false);
    lexLuthor.addSpecificAttribute("themyscira", false);
    lexLuthor.addSpecificAttribute("centralCity", false);
    lexLuthor.addSpecificAttribute("coastCity", false);
    lexLuthor.addSpecificAttribute("atlantis", false);
    lexLuthor.addSpecificAttribute("apokolips", false);
    lexLuthor.addSpecificAttribute("voar", false);
    lexLuthor.addSpecificAttribute("superForca", false);
    lexLuthor.addSpecificAttribute("superVelocidade", false);
    lexLuthor.addSpecificAttribute("visaoDeRaioX", false);
    lexLuthor.addSpecificAttribute("visaoDeCalor", false);
    lexLuthor.addSpecificAttribute("superSopro", false);
    lexLuthor.addSpecificAttribute("traje", true);
    lexLuthor.addSpecificAttribute("regeneracao", false);
    lexLuthor.addSpecificAttribute("controleMetal", false);
    lexLuthor.addSpecificAttribute("capacete", true);
    lexLuthor.addSpecificAttribute("telepatia", false);
    lexLuthor.addSpecificAttribute("telecinese", false);
    lexLuthor.addSpecificAttribute("absorverEnergia", false);
    lexLuthor.addSpecificAttribute("inteligenciaArtificial", true);
    lexLuthor.addSpecificAttribute("manipulacaoRealidade", false);
    lexLuthor.addSpecificAttribute("agilidadeAprimorada", false);
    lexLuthor.addSpecificAttribute("realeza", false);
    lexLuthor.addSpecificAttribute("treinamentoEspecial", true);
    lexLuthor.addSpecificAttribute("superSoldado", false);
    lexLuthor.addSpecificAttribute("bilionario", true);
    lexLuthor.addSpecificAttribute("patriota", false);
    lexLuthor.addSpecificAttribute("combateCorpoACorpo", true);
    lexLuthor.addSpecificAttribute("artesMarciais", true);
    lexLuthor.addSpecificAttribute("forcaDivina", false);
    lexLuthor.addSpecificAttribute("manipulacaoDeEnergia", true);
    lexLuthor.addSpecificAttribute("fazerFeitico", false);
    lexLuthor.addSpecificAttribute("Maguinetismo", false);

    Features loisLane = new Features("Lois Lane", "feminino", false, true, "", "heroi",
        "coadjuvante", false, false, "",
        true, true, true,
        false, "humano", false, false,
        false, false, "");

    loisLane.addSpecificAttribute("DCComics", true);
    loisLane.addSpecificAttribute("ligaDaJustica", false);
    loisLane.addSpecificAttribute("metropolis", true);
    loisLane.addSpecificAttribute("gothamCity", false);
    loisLane.addSpecificAttribute("themyscira", false);
    loisLane.addSpecificAttribute("centralCity", false);
    loisLane.addSpecificAttribute("coastCity", false);
    loisLane.addSpecificAttribute("atlantis", false);
    loisLane.addSpecificAttribute("apokolips", false);
    loisLane.addSpecificAttribute("voar", false);
    loisLane.addSpecificAttribute("superForca", false);
    loisLane.addSpecificAttribute("superVelocidade", false);
    loisLane.addSpecificAttribute("visaoDeRaioX", false);
    loisLane.addSpecificAttribute("visaoDeCalor", false);
    loisLane.addSpecificAttribute("superSopro", false);
    loisLane.addSpecificAttribute("traje", false);
    loisLane.addSpecificAttribute("regeneracao", false);
    loisLane.addSpecificAttribute("controleMetal", false);
    loisLane.addSpecificAttribute("capacete", false);
    loisLane.addSpecificAttribute("telepatia", false);
    loisLane.addSpecificAttribute("telecinese", false);
    loisLane.addSpecificAttribute("absorverEnergia", false);
    loisLane.addSpecificAttribute("inteligenciaArtificial", false);
    loisLane.addSpecificAttribute("manipulacaoRealidade", false);
    loisLane.addSpecificAttribute("agilidadeAprimorada", false);
    loisLane.addSpecificAttribute("realeza", false);
    loisLane.addSpecificAttribute("treinamentoEspecial", true);
    loisLane.addSpecificAttribute("superSoldado", false);
    loisLane.addSpecificAttribute("bilionario", false);
    loisLane.addSpecificAttribute("patriota", true);
    loisLane.addSpecificAttribute("combateCorpoACorpo", false);
    loisLane.addSpecificAttribute("artesMarciais", false);
    loisLane.addSpecificAttribute("forcaDivina", false);
    loisLane.addSpecificAttribute("manipulacaoDeEnergia", false);
    loisLane.addSpecificAttribute("fazerFeitico", false);
    loisLane.addSpecificAttribute("Maguinetismo", false);

    Features jimmyOlsen = new Features("Jimmy Olsen", "masculino", false, false, "", "heroi",
        "coadjuvante", false, false, "",
        true, true, false,
        false, "humano", false, false,
        false, false, "");

    jimmyOlsen.addSpecificAttribute("DCComics", true);
    jimmyOlsen.addSpecificAttribute("ligaDaJustica", false);
    jimmyOlsen.addSpecificAttribute("metropolis", true);
    jimmyOlsen.addSpecificAttribute("gothamCity", false);
    jimmyOlsen.addSpecificAttribute("themyscira", false);
    jimmyOlsen.addSpecificAttribute("centralCity", false);
    jimmyOlsen.addSpecificAttribute("coastCity", false);
    jimmyOlsen.addSpecificAttribute("atlantis", false);
    jimmyOlsen.addSpecificAttribute("apokolips", false);
    jimmyOlsen.addSpecificAttribute("voar", false);
    jimmyOlsen.addSpecificAttribute("superForca", false);
    jimmyOlsen.addSpecificAttribute("superVelocidade", false);
    jimmyOlsen.addSpecificAttribute("visaoDeRaioX", false);
    jimmyOlsen.addSpecificAttribute("visaoDeCalor", false);
    jimmyOlsen.addSpecificAttribute("superSopro", false);
    jimmyOlsen.addSpecificAttribute("traje", false);
    jimmyOlsen.addSpecificAttribute("regeneracao", false);
    jimmyOlsen.addSpecificAttribute("controleMetal", false);
    jimmyOlsen.addSpecificAttribute("capacete", false);
    jimmyOlsen.addSpecificAttribute("telepatia", false);
    jimmyOlsen.addSpecificAttribute("telecinese", false);
    jimmyOlsen.addSpecificAttribute("absorverEnergia", false);
    jimmyOlsen.addSpecificAttribute("inteligenciaArtificial", false);
    jimmyOlsen.addSpecificAttribute("manipulacaoRealidade", false);
    jimmyOlsen.addSpecificAttribute("agilidadeAprimorada", false);
    jimmyOlsen.addSpecificAttribute("realeza", false);
    jimmyOlsen.addSpecificAttribute("treinamentoEspecial", false);
    jimmyOlsen.addSpecificAttribute("superSoldado", false);
    jimmyOlsen.addSpecificAttribute("bilionario", false);
    jimmyOlsen.addSpecificAttribute("patriota", true);
    jimmyOlsen.addSpecificAttribute("combateCorpoACorpo", false);
    jimmyOlsen.addSpecificAttribute("artesMarciais", false);
    jimmyOlsen.addSpecificAttribute("forcaDivina", false);
    jimmyOlsen.addSpecificAttribute("manipulacaoDeEnergia", false);
    jimmyOlsen.addSpecificAttribute("fazerFeitico", false);
    jimmyOlsen.addSpecificAttribute("Maguinetismo", false);

    Features metallo = new Features("Metallo", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "ciborgue", true, false,
        true, true, "");

    metallo.addSpecificAttribute("DCComics", true);
    metallo.addSpecificAttribute("ligaDaJustica", false);
    metallo.addSpecificAttribute("metropolis", true);
    metallo.addSpecificAttribute("gothamCity", false);
    metallo.addSpecificAttribute("themyscira", false);
    metallo.addSpecificAttribute("centralCity", false);
    metallo.addSpecificAttribute("coastCity", false);
    metallo.addSpecificAttribute("atlantis", false);
    metallo.addSpecificAttribute("apokolips", false);
    metallo.addSpecificAttribute("voar", false);
    metallo.addSpecificAttribute("superForca", true);
    metallo.addSpecificAttribute("superVelocidade", false);
    metallo.addSpecificAttribute("visaoDeRaioX", false);
    metallo.addSpecificAttribute("visaoDeCalor", false);
    metallo.addSpecificAttribute("superSopro", false);
    metallo.addSpecificAttribute("traje", false);
    metallo.addSpecificAttribute("regeneracao", true);
    metallo.addSpecificAttribute("controleMetal", false);
    metallo.addSpecificAttribute("capacete", false);
    metallo.addSpecificAttribute("telepatia", false);
    metallo.addSpecificAttribute("telecinese", false);
    metallo.addSpecificAttribute("absorverEnergia", true);
    metallo.addSpecificAttribute("inteligenciaArtificial", true);
    metallo.addSpecificAttribute("manipulacaoRealidade", false);
    metallo.addSpecificAttribute("agilidadeAprimorada", true);
    metallo.addSpecificAttribute("realeza", false);
    metallo.addSpecificAttribute("treinamentoEspecial", true);
    metallo.addSpecificAttribute("superSoldado", false);
    metallo.addSpecificAttribute("bilionario", false);
    metallo.addSpecificAttribute("patriota", false);
    metallo.addSpecificAttribute("combateCorpoACorpo", true);
    metallo.addSpecificAttribute("artesMarciais", true);
    metallo.addSpecificAttribute("forcaDivina", false);
    metallo.addSpecificAttribute("manipulacaoDeEnergia", true);
    metallo.addSpecificAttribute("fazerFeitico", false);
    metallo.addSpecificAttribute("Maguinetismo", false);

    Features supergirl = new Features("Supergirl", "feminino", false, true, "", "heroi",
        "protagonista", false, true, "",
        true, true, true,
        false, "kryptoniano", false, false,
        false, false, "");

    supergirl.addSpecificAttribute("DCComics", true);
    supergirl.addSpecificAttribute("ligaDaJustica", true);
    supergirl.addSpecificAttribute("metropolis", true);
    supergirl.addSpecificAttribute("gothamCity", false);
    supergirl.addSpecificAttribute("themyscira", false);
    supergirl.addSpecificAttribute("centralCity", false);
    supergirl.addSpecificAttribute("coastCity", false);
    supergirl.addSpecificAttribute("atlantis", false);
    supergirl.addSpecificAttribute("apokolips", false);
    supergirl.addSpecificAttribute("voar", true);
    supergirl.addSpecificAttribute("superForca", true);
    supergirl.addSpecificAttribute("superVelocidade", true);
    supergirl.addSpecificAttribute("visaoDeRaioX", true);
    supergirl.addSpecificAttribute("visaoDeCalor", true);
    supergirl.addSpecificAttribute("superSopro", true);
    supergirl.addSpecificAttribute("traje", true);
    supergirl.addSpecificAttribute("regeneracao", true);
    supergirl.addSpecificAttribute("controleMetal", false);
    supergirl.addSpecificAttribute("capacete", false);
    supergirl.addSpecificAttribute("telepatia", false);
    supergirl.addSpecificAttribute("telecinese", false);
    supergirl.addSpecificAttribute("absorverEnergia", true);
    supergirl.addSpecificAttribute("inteligenciaArtificial", false);
    supergirl.addSpecificAttribute("manipulacaoRealidade", false);
    supergirl.addSpecificAttribute("agilidadeAprimorada", true);
    supergirl.addSpecificAttribute("realeza", false);
    supergirl.addSpecificAttribute("treinamentoEspecial", true);
    supergirl.addSpecificAttribute("superSoldado", false);
    supergirl.addSpecificAttribute("bilionario", false);
    supergirl.addSpecificAttribute("patriota", true);
    supergirl.addSpecificAttribute("combateCorpoACorpo", true);
    supergirl.addSpecificAttribute("artesMarciais", true);
    supergirl.addSpecificAttribute("forcaDivina", true);
    supergirl.addSpecificAttribute("manipulacaoDeEnergia", true);
    supergirl.addSpecificAttribute("fazerFeitico", false);
    supergirl.addSpecificAttribute("Maguinetismo", false);

    Features brainiac = new Features("Brainiac", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "alienigena", false, false,
        true, true, "");

    brainiac.addSpecificAttribute("DCComics", true);
    brainiac.addSpecificAttribute("ligaDaJustica", false);
    brainiac.addSpecificAttribute("metropolis", true);
    brainiac.addSpecificAttribute("gothamCity", false);
    brainiac.addSpecificAttribute("themyscira", false);
    brainiac.addSpecificAttribute("centralCity", false);
    brainiac.addSpecificAttribute("coastCity", false);
    brainiac.addSpecificAttribute("atlantis", false);
    brainiac.addSpecificAttribute("apokolips", false);
    brainiac.addSpecificAttribute("voar", true);
    brainiac.addSpecificAttribute("superForca", true);
    brainiac.addSpecificAttribute("superVelocidade", true);
    brainiac.addSpecificAttribute("visaoDeRaioX", false);
    brainiac.addSpecificAttribute("visaoDeCalor", false);
    brainiac.addSpecificAttribute("superSopro", false);
    brainiac.addSpecificAttribute("traje", true);
    brainiac.addSpecificAttribute("regeneracao", true);
    brainiac.addSpecificAttribute("controleMetal", true);
    brainiac.addSpecificAttribute("capacete", true);
    brainiac.addSpecificAttribute("telepatia", true);
    brainiac.addSpecificAttribute("telecinese", true);
    brainiac.addSpecificAttribute("absorverEnergia", true);
    brainiac.addSpecificAttribute("inteligenciaArtificial", true);
    brainiac.addSpecificAttribute("manipulacaoRealidade", false);
    brainiac.addSpecificAttribute("agilidadeAprimorada", true);
    brainiac.addSpecificAttribute("realeza", false);
    brainiac.addSpecificAttribute("treinamentoEspecial", true);
    brainiac.addSpecificAttribute("superSoldado", false);
    brainiac.addSpecificAttribute("bilionario", false);
    brainiac.addSpecificAttribute("patriota", false);
    brainiac.addSpecificAttribute("combateCorpoACorpo", true);
    brainiac.addSpecificAttribute("artesMarciais", true);
    brainiac.addSpecificAttribute("forcaDivina", false);
    brainiac.addSpecificAttribute("manipulacaoDeEnergia", true);
    brainiac.addSpecificAttribute("fazerFeitico", false);
    brainiac.addSpecificAttribute("Maguinetismo", true);

    Features steelJohnHenryIrons = new Features("Steel (John Henry Irons)", "masculino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "humano", false, false,
        false, true, "");

    steelJohnHenryIrons.addSpecificAttribute("DCComics", true);
    steelJohnHenryIrons.addSpecificAttribute("ligaDaJustica", true);
    steelJohnHenryIrons.addSpecificAttribute("metropolis", true);
    steelJohnHenryIrons.addSpecificAttribute("gothamCity", false);
    steelJohnHenryIrons.addSpecificAttribute("themyscira", false);
    steelJohnHenryIrons.addSpecificAttribute("centralCity", false);
    steelJohnHenryIrons.addSpecificAttribute("coastCity", false);
    steelJohnHenryIrons.addSpecificAttribute("atlantis", false);
    steelJohnHenryIrons.addSpecificAttribute("apokolips", false);
    steelJohnHenryIrons.addSpecificAttribute("voar", true);
    steelJohnHenryIrons.addSpecificAttribute("superForca", true);
    steelJohnHenryIrons.addSpecificAttribute("superVelocidade", false);
    steelJohnHenryIrons.addSpecificAttribute("visaoDeRaioX", false);
    steelJohnHenryIrons.addSpecificAttribute("visaoDeCalor", false);
    steelJohnHenryIrons.addSpecificAttribute("superSopro", false);
    steelJohnHenryIrons.addSpecificAttribute("traje", true);
    steelJohnHenryIrons.addSpecificAttribute("regeneracao", false);
    steelJohnHenryIrons.addSpecificAttribute("controleMetal", false);
    steelJohnHenryIrons.addSpecificAttribute("capacete", true);
    steelJohnHenryIrons.addSpecificAttribute("telepatia", false);
    steelJohnHenryIrons.addSpecificAttribute("telecinese", false);
    steelJohnHenryIrons.addSpecificAttribute("absorverEnergia", false);
    steelJohnHenryIrons.addSpecificAttribute("inteligenciaArtificial", true);
    steelJohnHenryIrons.addSpecificAttribute("manipulacaoRealidade", false);
    steelJohnHenryIrons.addSpecificAttribute("agilidadeAprimorada", true);
    steelJohnHenryIrons.addSpecificAttribute("realeza", false);
    steelJohnHenryIrons.addSpecificAttribute("treinamentoEspecial", true);
    steelJohnHenryIrons.addSpecificAttribute("superSoldado", false);
    steelJohnHenryIrons.addSpecificAttribute("bilionario", false);
    steelJohnHenryIrons.addSpecificAttribute("patriota", true);
    steelJohnHenryIrons.addSpecificAttribute("combateCorpoACorpo", true);
    steelJohnHenryIrons.addSpecificAttribute("artesMarciais", true);
    steelJohnHenryIrons.addSpecificAttribute("forcaDivina", false);
    steelJohnHenryIrons.addSpecificAttribute("manipulacaoDeEnergia", true);
    steelJohnHenryIrons.addSpecificAttribute("fazerFeitico", false);
    steelJohnHenryIrons.addSpecificAttribute("Maguinetismo", false);

    Features livewire = new Features("Livewire", "feminino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, false,
        true, "metahumano", true, false,
        true, false, "");

    livewire.addSpecificAttribute("DCComics", true);
    livewire.addSpecificAttribute("ligaDaJustica", false);
    livewire.addSpecificAttribute("metropolis", true);
    livewire.addSpecificAttribute("gothamCity", false);
    livewire.addSpecificAttribute("themyscira", false);
    livewire.addSpecificAttribute("centralCity", false);
    livewire.addSpecificAttribute("coastCity", false);
    livewire.addSpecificAttribute("atlantis", false);
    livewire.addSpecificAttribute("apokolips", false);
    livewire.addSpecificAttribute("voar", true);
    livewire.addSpecificAttribute("superForca", false);
    livewire.addSpecificAttribute("superVelocidade", true);
    livewire.addSpecificAttribute("visaoDeRaioX", false);
    livewire.addSpecificAttribute("visaoDeCalor", false);
    livewire.addSpecificAttribute("superSopro", false);
    livewire.addSpecificAttribute("traje", false);
    livewire.addSpecificAttribute("regeneracao", false);
    livewire.addSpecificAttribute("controleMetal", false);
    livewire.addSpecificAttribute("capacete", false);
    livewire.addSpecificAttribute("telepatia", false);
    livewire.addSpecificAttribute("telecinese", false);
    livewire.addSpecificAttribute("absorverEnergia", true);
    livewire.addSpecificAttribute("inteligenciaArtificial", false);
    livewire.addSpecificAttribute("manipulacaoRealidade", false);
    livewire.addSpecificAttribute("agilidadeAprimorada", true);
    livewire.addSpecificAttribute("realeza", false);
    livewire.addSpecificAttribute("treinamentoEspecial", false);
    livewire.addSpecificAttribute("superSoldado", false);
    livewire.addSpecificAttribute("bilionario", false);
    livewire.addSpecificAttribute("patriota", false);
    livewire.addSpecificAttribute("combateCorpoACorpo", false);
    livewire.addSpecificAttribute("artesMarciais", false);
    livewire.addSpecificAttribute("forcaDivina", false);
    livewire.addSpecificAttribute("manipulacaoDeEnergia", true);
    livewire.addSpecificAttribute("fazerFeitico", false);
    livewire.addSpecificAttribute("Maguinetismo", false);

    Features perryWhite = new Features("Perry White", "masculino", true, false, "", "heroi",
        "coadjuvante", false, false, "",
        true, true, true,
        false, "humano", false, false,
        false, false, "");

    perryWhite.addSpecificAttribute("DCComics", true);
    perryWhite.addSpecificAttribute("ligaDaJustica", false);
    perryWhite.addSpecificAttribute("metropolis", true);
    perryWhite.addSpecificAttribute("gothamCity", false);
    perryWhite.addSpecificAttribute("themyscira", false);
    perryWhite.addSpecificAttribute("centralCity", false);
    perryWhite.addSpecificAttribute("coastCity", false);
    perryWhite.addSpecificAttribute("atlantis", false);
    perryWhite.addSpecificAttribute("apokolips", false);
    perryWhite.addSpecificAttribute("voar", false);
    perryWhite.addSpecificAttribute("superForca", false);
    perryWhite.addSpecificAttribute("superVelocidade", false);
    perryWhite.addSpecificAttribute("visaoDeRaioX", false);
    perryWhite.addSpecificAttribute("visaoDeCalor", false);
    perryWhite.addSpecificAttribute("superSopro", false);
    perryWhite.addSpecificAttribute("traje", false);
    perryWhite.addSpecificAttribute("regeneracao", false);
    perryWhite.addSpecificAttribute("controleMetal", false);
    perryWhite.addSpecificAttribute("capacete", false);
    perryWhite.addSpecificAttribute("telepatia", false);
    perryWhite.addSpecificAttribute("telecinese", false);
    perryWhite.addSpecificAttribute("absorverEnergia", false);
    perryWhite.addSpecificAttribute("inteligenciaArtificial", false);
    perryWhite.addSpecificAttribute("manipulacaoRealidade", false);
    perryWhite.addSpecificAttribute("agilidadeAprimorada", false);
    perryWhite.addSpecificAttribute("realeza", false);
    perryWhite.addSpecificAttribute("treinamentoEspecial", true);
    perryWhite.addSpecificAttribute("superSoldado", false);
    perryWhite.addSpecificAttribute("bilionario", false);
    perryWhite.addSpecificAttribute("patriota", true);
    perryWhite.addSpecificAttribute("combateCorpoACorpo", false);
    perryWhite.addSpecificAttribute("artesMarciais", false);
    perryWhite.addSpecificAttribute("forcaDivina", false);
    perryWhite.addSpecificAttribute("manipulacaoDeEnergia", false);
    perryWhite.addSpecificAttribute("fazerFeitico", false);
    perryWhite.addSpecificAttribute("Maguinetismo", false);

    Features superboy = new Features("Superboy", "masculino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "hibrido", false, false,
        false, false, "");

    superboy.addSpecificAttribute("DCComics", true);
    superboy.addSpecificAttribute("ligaDaJustica", false);
    superboy.addSpecificAttribute("metropolis", true);
    superboy.addSpecificAttribute("gothamCity", false);
    superboy.addSpecificAttribute("themyscira", false);
    superboy.addSpecificAttribute("centralCity", false);
    superboy.addSpecificAttribute("coastCity", false);
    superboy.addSpecificAttribute("atlantis", false);
    superboy.addSpecificAttribute("apokolips", false);
    superboy.addSpecificAttribute("voar", true);
    superboy.addSpecificAttribute("superForca", true);
    superboy.addSpecificAttribute("superVelocidade", true);
    superboy.addSpecificAttribute("visaoDeRaioX", true);
    superboy.addSpecificAttribute("visaoDeCalor", true);
    superboy.addSpecificAttribute("superSopro", true);
    superboy.addSpecificAttribute("traje", true);
    superboy.addSpecificAttribute("regeneracao", true);
    superboy.addSpecificAttribute("controleMetal", false);
    superboy.addSpecificAttribute("capacete", false);
    superboy.addSpecificAttribute("telepatia", false);
    superboy.addSpecificAttribute("telecinese", true);
    superboy.addSpecificAttribute("absorverEnergia", true);
    superboy.addSpecificAttribute("inteligenciaArtificial", false);
    superboy.addSpecificAttribute("manipulacaoRealidade", false);
    superboy.addSpecificAttribute("agilidadeAprimorada", true);
    superboy.addSpecificAttribute("realeza", false);
    superboy.addSpecificAttribute("treinamentoEspecial", true);
    superboy.addSpecificAttribute("superSoldado", false);
    superboy.addSpecificAttribute("bilionario", false);
    superboy.addSpecificAttribute("patriota", true);
    superboy.addSpecificAttribute("combateCorpoACorpo", true);
    superboy.addSpecificAttribute("artesMarciais", true);
    superboy.addSpecificAttribute("forcaDivina", true);
    superboy.addSpecificAttribute("manipulacaoDeEnergia", true);
    superboy.addSpecificAttribute("fazerFeitico", false);
    superboy.addSpecificAttribute("Maguinetismo", false);

    Features parasite = new Features("Parasite", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, false, true,
        true, "metahumano", true, true,
        false, false, "");

    parasite.addSpecificAttribute("DCComics", true);
    parasite.addSpecificAttribute("ligaDaJustica", false);
    parasite.addSpecificAttribute("metropolis", true);
    parasite.addSpecificAttribute("gothamCity", false);
    parasite.addSpecificAttribute("themyscira", false);
    parasite.addSpecificAttribute("centralCity", false);
    parasite.addSpecificAttribute("coastCity", false);
    parasite.addSpecificAttribute("atlantis", false);
    parasite.addSpecificAttribute("apokolips", false);
    parasite.addSpecificAttribute("voar", false);
    parasite.addSpecificAttribute("superForca", true);
    parasite.addSpecificAttribute("superVelocidade", true);
    parasite.addSpecificAttribute("visaoDeRaioX", false);
    parasite.addSpecificAttribute("visaoDeCalor", false);
    parasite.addSpecificAttribute("superSopro", false);
    parasite.addSpecificAttribute("traje", false);
    parasite.addSpecificAttribute("regeneracao", true);
    parasite.addSpecificAttribute("controleMetal", false);
    parasite.addSpecificAttribute("capacete", false);
    parasite.addSpecificAttribute("telepatia", false);
    parasite.addSpecificAttribute("telecinese", false);
    parasite.addSpecificAttribute("absorverEnergia", true);
    parasite.addSpecificAttribute("inteligenciaArtificial", false);
    parasite.addSpecificAttribute("manipulacaoRealidade", false);
    parasite.addSpecificAttribute("agilidadeAprimorada", true);
    parasite.addSpecificAttribute("realeza", false);
    parasite.addSpecificAttribute("treinamentoEspecial", false);
    parasite.addSpecificAttribute("superSoldado", false);
    parasite.addSpecificAttribute("bilionario", false);
    parasite.addSpecificAttribute("patriota", false);
    parasite.addSpecificAttribute("combateCorpoACorpo", true);
    parasite.addSpecificAttribute("artesMarciais", false);
    parasite.addSpecificAttribute("forcaDivina", false);
    parasite.addSpecificAttribute("manipulacaoDeEnergia", true);
    parasite.addSpecificAttribute("fazerFeitico", false);
    parasite.addSpecificAttribute("Maguinetismo", false);

    Features bizarro = new Features("Bizarro", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, false, false,
        true, "clone", true, true,
        true, false, "");

    bizarro.addSpecificAttribute("DCComics", true);
    bizarro.addSpecificAttribute("ligaDaJustica", false);
    bizarro.addSpecificAttribute("metropolis", true);
    bizarro.addSpecificAttribute("gothamCity", false);
    bizarro.addSpecificAttribute("themyscira", false);
    bizarro.addSpecificAttribute("centralCity", false);
    bizarro.addSpecificAttribute("coastCity", false);
    bizarro.addSpecificAttribute("atlantis", false);
    bizarro.addSpecificAttribute("apokolips", false);
    bizarro.addSpecificAttribute("voar", true);
    bizarro.addSpecificAttribute("superForca", true);
    bizarro.addSpecificAttribute("superVelocidade", true);
    bizarro.addSpecificAttribute("visaoDeRaioX", true);
    bizarro.addSpecificAttribute("visaoDeCalor", true);
    bizarro.addSpecificAttribute("superSopro", true);
    bizarro.addSpecificAttribute("traje", true);
    bizarro.addSpecificAttribute("regeneracao", true);
    bizarro.addSpecificAttribute("controleMetal", false);
    bizarro.addSpecificAttribute("capacete", false);
    bizarro.addSpecificAttribute("telepatia", false);
    bizarro.addSpecificAttribute("telecinese", false);
    bizarro.addSpecificAttribute("absorverEnergia", true);
    bizarro.addSpecificAttribute("inteligenciaArtificial", false);
    bizarro.addSpecificAttribute("manipulacaoRealidade", false);
    bizarro.addSpecificAttribute("agilidadeAprimorada", true);
    bizarro.addSpecificAttribute("realeza", false);
    bizarro.addSpecificAttribute("treinamentoEspecial", false);
    bizarro.addSpecificAttribute("superSoldado", false);
    bizarro.addSpecificAttribute("bilionario", false);
    bizarro.addSpecificAttribute("patriota", false);
    bizarro.addSpecificAttribute("combateCorpoACorpo", true);
    bizarro.addSpecificAttribute("artesMarciais", false);
    bizarro.addSpecificAttribute("forcaDivina", true);
    bizarro.addSpecificAttribute("manipulacaoDeEnergia", true);
    bizarro.addSpecificAttribute("fazerFeitico", false);
    bizarro.addSpecificAttribute("Maguinetismo", false);

    Features catGrant = new Features("Cat Grant", "feminino", true, false, "", "heroi",
        "coadjuvante", false, false, "",
        true, true, false,
        false, "humano", false, false,
        false, false, "");

    catGrant.addSpecificAttribute("DCComics", true);
    catGrant.addSpecificAttribute("ligaDaJustica", false);
    catGrant.addSpecificAttribute("metropolis", true);
    catGrant.addSpecificAttribute("gothamCity", false);
    catGrant.addSpecificAttribute("themyscira", false);
    catGrant.addSpecificAttribute("centralCity", false);
    catGrant.addSpecificAttribute("coastCity", false);
    catGrant.addSpecificAttribute("atlantis", false);
    catGrant.addSpecificAttribute("apokolips", false);
    catGrant.addSpecificAttribute("voar", false);
    catGrant.addSpecificAttribute("superForca", false);
    catGrant.addSpecificAttribute("superVelocidade", false);
    catGrant.addSpecificAttribute("visaoDeRaioX", false);
    catGrant.addSpecificAttribute("visaoDeCalor", false);
    catGrant.addSpecificAttribute("superSopro", false);
    catGrant.addSpecificAttribute("traje", false);
    catGrant.addSpecificAttribute("regeneracao", false);
    catGrant.addSpecificAttribute("controleMetal", false);
    catGrant.addSpecificAttribute("capacete", false);
    catGrant.addSpecificAttribute("telepatia", false);
    catGrant.addSpecificAttribute("telecinese", false);
    catGrant.addSpecificAttribute("absorverEnergia", false);
    catGrant.addSpecificAttribute("inteligenciaArtificial", false);
    catGrant.addSpecificAttribute("manipulacaoRealidade", false);
    catGrant.addSpecificAttribute("agilidadeAprimorada", false);
    catGrant.addSpecificAttribute("realeza", false);
    catGrant.addSpecificAttribute("treinamentoEspecial", true);
    catGrant.addSpecificAttribute("superSoldado", false);
    catGrant.addSpecificAttribute("bilionario", false);
    catGrant.addSpecificAttribute("patriota", true);
    catGrant.addSpecificAttribute("combateCorpoACorpo", false);
    catGrant.addSpecificAttribute("artesMarciais", false);
    catGrant.addSpecificAttribute("forcaDivina", false);
    catGrant.addSpecificAttribute("manipulacaoDeEnergia", false);
    catGrant.addSpecificAttribute("fazerFeitico", false);
    catGrant.addSpecificAttribute("Maguinetismo", false);

    Features toymanWinslowSchott = new Features("Toyman (Winslow Schott)", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "humano", true, false,
        false, false, "");

    toymanWinslowSchott.addSpecificAttribute("DCComics", true);
    toymanWinslowSchott.addSpecificAttribute("ligaDaJustica", false);
    toymanWinslowSchott.addSpecificAttribute("metropolis", true);
    toymanWinslowSchott.addSpecificAttribute("gothamCity", false);
    toymanWinslowSchott.addSpecificAttribute("themyscira", false);
    toymanWinslowSchott.addSpecificAttribute("centralCity", false);
    toymanWinslowSchott.addSpecificAttribute("coastCity", false);
    toymanWinslowSchott.addSpecificAttribute("atlantis", false);
    toymanWinslowSchott.addSpecificAttribute("apokolips", false);
    toymanWinslowSchott.addSpecificAttribute("voar", false);
    toymanWinslowSchott.addSpecificAttribute("superForca", false);
    toymanWinslowSchott.addSpecificAttribute("superVelocidade", false);
    toymanWinslowSchott.addSpecificAttribute("visaoDeRaioX", false);
    toymanWinslowSchott.addSpecificAttribute("visaoDeCalor", false);
    toymanWinslowSchott.addSpecificAttribute("superSopro", false);
    toymanWinslowSchott.addSpecificAttribute("traje", true);
    toymanWinslowSchott.addSpecificAttribute("regeneracao", false);
    toymanWinslowSchott.addSpecificAttribute("controleMetal", false);
    toymanWinslowSchott.addSpecificAttribute("capacete", false);
    toymanWinslowSchott.addSpecificAttribute("telepatia", false);
    toymanWinslowSchott.addSpecificAttribute("telecinese", false);
    toymanWinslowSchott.addSpecificAttribute("absorverEnergia", false);
    toymanWinslowSchott.addSpecificAttribute("inteligenciaArtificial", true);
    toymanWinslowSchott.addSpecificAttribute("manipulacaoRealidade", false);
    toymanWinslowSchott.addSpecificAttribute("agilidadeAprimorada", false);
    toymanWinslowSchott.addSpecificAttribute("realeza", false);
    toymanWinslowSchott.addSpecificAttribute("treinamentoEspecial", true);
    toymanWinslowSchott.addSpecificAttribute("superSoldado", false);
    toymanWinslowSchott.addSpecificAttribute("bilionario", false);
    toymanWinslowSchott.addSpecificAttribute("patriota", false);
    toymanWinslowSchott.addSpecificAttribute("combateCorpoACorpo", false);
    toymanWinslowSchott.addSpecificAttribute("artesMarciais", false);
    toymanWinslowSchott.addSpecificAttribute("forcaDivina", false);
    toymanWinslowSchott.addSpecificAttribute("manipulacaoDeEnergia", false);
    toymanWinslowSchott.addSpecificAttribute("fazerFeitico", false);
    toymanWinslowSchott.addSpecificAttribute("Maguinetismo", false);

    Features batman = new Features("Batman", "masculino", true, false, "", "heroi",
        "protagonista", false, true, "",
        true, true, true,
        false, "humano", false, false,
        false, true, "");

    batman.addSpecificAttribute("DCComics", true);
    batman.addSpecificAttribute("ligaDaJustica", true);
    batman.addSpecificAttribute("metropolis", false);
    batman.addSpecificAttribute("gothamCity", true);
    batman.addSpecificAttribute("themyscira", false);
    batman.addSpecificAttribute("centralCity", false);
    batman.addSpecificAttribute("coastCity", false);
    batman.addSpecificAttribute("atlantis", false);
    batman.addSpecificAttribute("apokolips", false);
    batman.addSpecificAttribute("voar", false);
    batman.addSpecificAttribute("superForca", false);
    batman.addSpecificAttribute("superVelocidade", false);
    batman.addSpecificAttribute("visaoDeRaioX", false);
    batman.addSpecificAttribute("visaoDeCalor", false);
    batman.addSpecificAttribute("superSopro", false);
    batman.addSpecificAttribute("traje", true);
    batman.addSpecificAttribute("regeneracao", false);
    batman.addSpecificAttribute("controleMetal", false);
    batman.addSpecificAttribute("capacete", true);
    batman.addSpecificAttribute("telepatia", false);
    batman.addSpecificAttribute("telecinese", false);
    batman.addSpecificAttribute("absorverEnergia", false);
    batman.addSpecificAttribute("inteligenciaArtificial", true);
    batman.addSpecificAttribute("manipulacaoRealidade", false);
    batman.addSpecificAttribute("agilidadeAprimorada", true);
    batman.addSpecificAttribute("realeza", false);
    batman.addSpecificAttribute("treinamentoEspecial", true);
    batman.addSpecificAttribute("superSoldado", false);
    batman.addSpecificAttribute("bilionario", true);
    batman.addSpecificAttribute("patriota", true);
    batman.addSpecificAttribute("combateCorpoACorpo", true);
    batman.addSpecificAttribute("artesMarciais", true);
    batman.addSpecificAttribute("forcaDivina", false);
    batman.addSpecificAttribute("manipulacaoDeEnergia", false);
    batman.addSpecificAttribute("fazerFeitico", false);
    batman.addSpecificAttribute("Maguinetismo", false);

    Features joker = new Features("Coringa", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "humano", true, true,
        false, false, "");

    joker.addSpecificAttribute("DCComics", true);
    joker.addSpecificAttribute("ligaDaJustica", false);
    joker.addSpecificAttribute("metropolis", false);
    joker.addSpecificAttribute("gothamCity", true);
    joker.addSpecificAttribute("themyscira", false);
    joker.addSpecificAttribute("centralCity", false);
    joker.addSpecificAttribute("coastCity", false);
    joker.addSpecificAttribute("atlantis", false);
    joker.addSpecificAttribute("apokolips", false);
    joker.addSpecificAttribute("voar", false);
    joker.addSpecificAttribute("superForca", false);
    joker.addSpecificAttribute("superVelocidade", false);
    joker.addSpecificAttribute("visaoDeRaioX", false);
    joker.addSpecificAttribute("visaoDeCalor", false);
    joker.addSpecificAttribute("superSopro", false);
    joker.addSpecificAttribute("traje", true);
    joker.addSpecificAttribute("regeneracao", false);
    joker.addSpecificAttribute("controleMetal", false);
    joker.addSpecificAttribute("capacete", false);
    joker.addSpecificAttribute("telepatia", false);
    joker.addSpecificAttribute("telecinese", false);
    joker.addSpecificAttribute("absorverEnergia", false);
    joker.addSpecificAttribute("inteligenciaArtificial", false);
    joker.addSpecificAttribute("manipulacaoRealidade", false);
    joker.addSpecificAttribute("agilidadeAprimorada", true);
    joker.addSpecificAttribute("realeza", false);
    joker.addSpecificAttribute("treinamentoEspecial", true);
    joker.addSpecificAttribute("superSoldado", false);
    joker.addSpecificAttribute("bilionario", false);
    joker.addSpecificAttribute("patriota", false);
    joker.addSpecificAttribute("combateCorpoACorpo", true);
    joker.addSpecificAttribute("artesMarciais", true);
    joker.addSpecificAttribute("forcaDivina", false);
    joker.addSpecificAttribute("manipulacaoDeEnergia", false);
    joker.addSpecificAttribute("fazerFeitico", false);
    joker.addSpecificAttribute("Maguinetismo", false);

    Features robin = new Features("Robin", "masculino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "humano", false, false,
        false, false, "");

    robin.addSpecificAttribute("DCComics", true);
    robin.addSpecificAttribute("ligaDaJustica", false);
    robin.addSpecificAttribute("metropolis", false);
    robin.addSpecificAttribute("gothamCity", true);
    robin.addSpecificAttribute("themyscira", false);
    robin.addSpecificAttribute("centralCity", false);
    robin.addSpecificAttribute("coastCity", false);
    robin.addSpecificAttribute("atlantis", false);
    robin.addSpecificAttribute("apokolips", false);
    robin.addSpecificAttribute("voar", false);
    robin.addSpecificAttribute("superForca", false);
    robin.addSpecificAttribute("superVelocidade", false);
    robin.addSpecificAttribute("visaoDeRaioX", false);
    robin.addSpecificAttribute("visaoDeCalor", false);
    robin.addSpecificAttribute("superSopro", false);
    robin.addSpecificAttribute("traje", true);
    robin.addSpecificAttribute("regeneracao", false);
    robin.addSpecificAttribute("controleMetal", false);
    robin.addSpecificAttribute("capacete", false);
    robin.addSpecificAttribute("telepatia", false);
    robin.addSpecificAttribute("telecinese", false);
    robin.addSpecificAttribute("absorverEnergia", false);
    robin.addSpecificAttribute("inteligenciaArtificial", false);
    robin.addSpecificAttribute("manipulacaoRealidade", false);
    robin.addSpecificAttribute("agilidadeAprimorada", true);
    robin.addSpecificAttribute("realeza", false);
    robin.addSpecificAttribute("treinamentoEspecial", true);
    robin.addSpecificAttribute("superSoldado", false);
    robin.addSpecificAttribute("bilionario", false);
    robin.addSpecificAttribute("patriota", true);
    robin.addSpecificAttribute("combateCorpoACorpo", true);
    robin.addSpecificAttribute("artesMarciais", true);
    robin.addSpecificAttribute("forcaDivina", false);
    robin.addSpecificAttribute("manipulacaoDeEnergia", false);
    robin.addSpecificAttribute("fazerFeitico", false);
    robin.addSpecificAttribute("Maguinetismo", false);

    Features catwoman = new Features("Mulher-Gato", "feminino", false, false, "", "anti-heroi",
        "coadjuvante", false, true, "",
        false, true, true,
        true, "humano", true, false,
        false, true, "");

    catwoman.addSpecificAttribute("DCComics", true);
    catwoman.addSpecificAttribute("ligaDaJustica", false);
    catwoman.addSpecificAttribute("metropolis", false);
    catwoman.addSpecificAttribute("gothamCity", true);
    catwoman.addSpecificAttribute("themyscira", false);
    catwoman.addSpecificAttribute("centralCity", false);
    catwoman.addSpecificAttribute("coastCity", false);
    catwoman.addSpecificAttribute("atlantis", false);
    catwoman.addSpecificAttribute("apokolips", false);
    catwoman.addSpecificAttribute("voar", false);
    catwoman.addSpecificAttribute("superForca", false);
    catwoman.addSpecificAttribute("superVelocidade", false);
    catwoman.addSpecificAttribute("visaoDeRaioX", false);
    catwoman.addSpecificAttribute("visaoDeCalor", false);
    catwoman.addSpecificAttribute("superSopro", false);
    catwoman.addSpecificAttribute("traje", true);
    catwoman.addSpecificAttribute("regeneracao", false);
    catwoman.addSpecificAttribute("controleMetal", false);
    catwoman.addSpecificAttribute("capacete", false);
    catwoman.addSpecificAttribute("telepatia", false);
    catwoman.addSpecificAttribute("telecinese", false);
    catwoman.addSpecificAttribute("absorverEnergia", false);
    catwoman.addSpecificAttribute("inteligenciaArtificial", false);
    catwoman.addSpecificAttribute("manipulacaoRealidade", false);
    catwoman.addSpecificAttribute("agilidadeAprimorada", true);
    catwoman.addSpecificAttribute("realeza", false);
    catwoman.addSpecificAttribute("treinamentoEspecial", true);
    catwoman.addSpecificAttribute("superSoldado", false);
    catwoman.addSpecificAttribute("bilionario", false);
    catwoman.addSpecificAttribute("patriota", false);
    catwoman.addSpecificAttribute("combateCorpoACorpo", true);
    catwoman.addSpecificAttribute("artesMarciais", true);
    catwoman.addSpecificAttribute("forcaDivina", false);
    catwoman.addSpecificAttribute("manipulacaoDeEnergia", false);
    catwoman.addSpecificAttribute("fazerFeitico", false);
    catwoman.addSpecificAttribute("Maguinetismo", false);

    Features alfredPennyworth = new Features("Alfred Pennyworth", "masculino", false, false, "", "heroi",
        "coadjuvante", false, false, "",
        true, true, true,
        false, "humano", false, false,
        false, false, "");

    alfredPennyworth.addSpecificAttribute("DCComics", true);
    alfredPennyworth.addSpecificAttribute("ligaDaJustica", false);
    alfredPennyworth.addSpecificAttribute("metropolis", false);
    alfredPennyworth.addSpecificAttribute("gothamCity", true);
    alfredPennyworth.addSpecificAttribute("themyscira", false);
    alfredPennyworth.addSpecificAttribute("centralCity", false);
    alfredPennyworth.addSpecificAttribute("coastCity", false);
    alfredPennyworth.addSpecificAttribute("atlantis", false);
    alfredPennyworth.addSpecificAttribute("apokolips", false);
    alfredPennyworth.addSpecificAttribute("voar", false);
    alfredPennyworth.addSpecificAttribute("superForca", false);
    alfredPennyworth.addSpecificAttribute("superVelocidade", false);
    alfredPennyworth.addSpecificAttribute("visaoDeRaioX", false);
    alfredPennyworth.addSpecificAttribute("visaoDeCalor", false);
    alfredPennyworth.addSpecificAttribute("superSopro", false);
    alfredPennyworth.addSpecificAttribute("traje", false);
    alfredPennyworth.addSpecificAttribute("regeneracao", false);
    alfredPennyworth.addSpecificAttribute("controleMetal", false);
    alfredPennyworth.addSpecificAttribute("capacete", false);
    alfredPennyworth.addSpecificAttribute("telepatia", false);
    alfredPennyworth.addSpecificAttribute("telecinese", false);
    alfredPennyworth.addSpecificAttribute("absorverEnergia", false);
    alfredPennyworth.addSpecificAttribute("inteligenciaArtificial", false);
    alfredPennyworth.addSpecificAttribute("manipulacaoRealidade", false);
    alfredPennyworth.addSpecificAttribute("agilidadeAprimorada", false);
    alfredPennyworth.addSpecificAttribute("realeza", false);
    alfredPennyworth.addSpecificAttribute("treinamentoEspecial", true);
    alfredPennyworth.addSpecificAttribute("superSoldado", false);
    alfredPennyworth.addSpecificAttribute("bilionario", false);
    alfredPennyworth.addSpecificAttribute("patriota", true);
    alfredPennyworth.addSpecificAttribute("combateCorpoACorpo", true);
    alfredPennyworth.addSpecificAttribute("artesMarciais", true);
    alfredPennyworth.addSpecificAttribute("forcaDivina", false);
    alfredPennyworth.addSpecificAttribute("manipulacaoDeEnergia", false);
    alfredPennyworth.addSpecificAttribute("fazerFeitico", false);
    alfredPennyworth.addSpecificAttribute("Maguinetismo", false);

    Features duasCaras = new Features("Duas-Caras", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "humano", true, true,
        false, false, "");

    duasCaras.addSpecificAttribute("DCComics", true);
    duasCaras.addSpecificAttribute("ligaDaJustica", false);
    duasCaras.addSpecificAttribute("metropolis", false);
    duasCaras.addSpecificAttribute("gothamCity", true);
    duasCaras.addSpecificAttribute("themyscira", false);
    duasCaras.addSpecificAttribute("centralCity", false);
    duasCaras.addSpecificAttribute("coastCity", false);
    duasCaras.addSpecificAttribute("atlantis", false);
    duasCaras.addSpecificAttribute("apokolips", false);
    duasCaras.addSpecificAttribute("voar", false);
    duasCaras.addSpecificAttribute("superForca", false);
    duasCaras.addSpecificAttribute("superVelocidade", false);
    duasCaras.addSpecificAttribute("visaoDeRaioX", false);
    duasCaras.addSpecificAttribute("visaoDeCalor", false);
    duasCaras.addSpecificAttribute("superSopro", false);
    duasCaras.addSpecificAttribute("traje", true);
    duasCaras.addSpecificAttribute("regeneracao", false);
    duasCaras.addSpecificAttribute("controleMetal", false);
    duasCaras.addSpecificAttribute("capacete", false);
    duasCaras.addSpecificAttribute("telepatia", false);
    duasCaras.addSpecificAttribute("telecinese", false);
    duasCaras.addSpecificAttribute("absorverEnergia", false);
    duasCaras.addSpecificAttribute("inteligenciaArtificial", false);
    duasCaras.addSpecificAttribute("manipulacaoRealidade", false);
    duasCaras.addSpecificAttribute("agilidadeAprimorada", false);
    duasCaras.addSpecificAttribute("realeza", false);
    duasCaras.addSpecificAttribute("treinamentoEspecial", true);
    duasCaras.addSpecificAttribute("superSoldado", false);
    duasCaras.addSpecificAttribute("bilionario", false);
    duasCaras.addSpecificAttribute("patriota", false);
    duasCaras.addSpecificAttribute("combateCorpoACorpo", true);
    duasCaras.addSpecificAttribute("artesMarciais", true);
    duasCaras.addSpecificAttribute("forcaDivina", false);
    duasCaras.addSpecificAttribute("manipulacaoDeEnergia", false);
    duasCaras.addSpecificAttribute("fazerFeitico", false);
    duasCaras.addSpecificAttribute("Maguinetismo", false);

    Features pinguim = new Features("Pinguim", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "humano", true, false,
        true, false, "");

    pinguim.addSpecificAttribute("DCComics", true);
    pinguim.addSpecificAttribute("ligaDaJustica", false);
    pinguim.addSpecificAttribute("metropolis", false);
    pinguim.addSpecificAttribute("gothamCity", true);
    pinguim.addSpecificAttribute("themyscira", false);
    pinguim.addSpecificAttribute("centralCity", false);
    pinguim.addSpecificAttribute("coastCity", false);
    pinguim.addSpecificAttribute("atlantis", false);
    pinguim.addSpecificAttribute("apokolips", false);
    pinguim.addSpecificAttribute("voar", false);
    pinguim.addSpecificAttribute("superForca", false);
    pinguim.addSpecificAttribute("superVelocidade", false);
    pinguim.addSpecificAttribute("visaoDeRaioX", false);
    pinguim.addSpecificAttribute("visaoDeCalor", false);
    pinguim.addSpecificAttribute("superSopro", false);
    pinguim.addSpecificAttribute("traje", true);
    pinguim.addSpecificAttribute("regeneracao", false);
    pinguim.addSpecificAttribute("controleMetal", false);
    pinguim.addSpecificAttribute("capacete", false);
    pinguim.addSpecificAttribute("telepatia", false);
    pinguim.addSpecificAttribute("telecinese", false);
    pinguim.addSpecificAttribute("absorverEnergia", false);
    pinguim.addSpecificAttribute("inteligenciaArtificial", false);
    pinguim.addSpecificAttribute("manipulacaoRealidade", false);
    pinguim.addSpecificAttribute("agilidadeAprimorada", false);
    pinguim.addSpecificAttribute("realeza", false);
    pinguim.addSpecificAttribute("treinamentoEspecial", true);
    pinguim.addSpecificAttribute("superSoldado", false);
    pinguim.addSpecificAttribute("bilionario", true);
    pinguim.addSpecificAttribute("patriota", false);
    pinguim.addSpecificAttribute("combateCorpoACorpo", true);
    pinguim.addSpecificAttribute("artesMarciais", false);
    pinguim.addSpecificAttribute("forcaDivina", false);
    pinguim.addSpecificAttribute("manipulacaoDeEnergia", false);
    pinguim.addSpecificAttribute("fazerFeitico", false);
    pinguim.addSpecificAttribute("Maguinetismo", false);

    Features batgirl = new Features("Batgirl", "feminino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "humano", false, false,
        false, true, "");

    batgirl.addSpecificAttribute("DCComics", true);
    batgirl.addSpecificAttribute("ligaDaJustica", false);
    batgirl.addSpecificAttribute("metropolis", false);
    batgirl.addSpecificAttribute("gothamCity", true);
    batgirl.addSpecificAttribute("themyscira", false);
    batgirl.addSpecificAttribute("centralCity", false);
    batgirl.addSpecificAttribute("coastCity", false);
    batgirl.addSpecificAttribute("atlantis", false);
    batgirl.addSpecificAttribute("apokolips", false);
    batgirl.addSpecificAttribute("voar", false);
    batgirl.addSpecificAttribute("superForca", false);
    batgirl.addSpecificAttribute("superVelocidade", false);
    batgirl.addSpecificAttribute("visaoDeRaioX", false);
    batgirl.addSpecificAttribute("visaoDeCalor", false);
    batgirl.addSpecificAttribute("superSopro", false);
    batgirl.addSpecificAttribute("traje", true);
    batgirl.addSpecificAttribute("regeneracao", false);
    batgirl.addSpecificAttribute("controleMetal", false);
    batgirl.addSpecificAttribute("capacete", false);
    batgirl.addSpecificAttribute("telepatia", false);
    batgirl.addSpecificAttribute("telecinese", false);
    batgirl.addSpecificAttribute("absorverEnergia", false);
    batgirl.addSpecificAttribute("inteligenciaArtificial", true);
    batgirl.addSpecificAttribute("manipulacaoRealidade", false);
    batgirl.addSpecificAttribute("agilidadeAprimorada", true);
    batgirl.addSpecificAttribute("realeza", false);
    batgirl.addSpecificAttribute("treinamentoEspecial", true);
    batgirl.addSpecificAttribute("superSoldado", false);
    batgirl.addSpecificAttribute("bilionario", false);
    batgirl.addSpecificAttribute("patriota", true);
    batgirl.addSpecificAttribute("combateCorpoACorpo", true);
    batgirl.addSpecificAttribute("artesMarciais", true);
    batgirl.addSpecificAttribute("forcaDivina", false);
    batgirl.addSpecificAttribute("manipulacaoDeEnergia", false);
    batgirl.addSpecificAttribute("fazerFeitico", false);
    batgirl.addSpecificAttribute("Maguinetismo", false);

    Features espantalho = new Features("Espantalho", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "humano", true, false,
        false, false, "");

    espantalho.addSpecificAttribute("DCComics", true);
    espantalho.addSpecificAttribute("ligaDaJustica", false);
    espantalho.addSpecificAttribute("metropolis", false);
    espantalho.addSpecificAttribute("gothamCity", true);
    espantalho.addSpecificAttribute("themyscira", false);
    espantalho.addSpecificAttribute("centralCity", false);
    espantalho.addSpecificAttribute("coastCity", false);
    espantalho.addSpecificAttribute("atlantis", false);
    espantalho.addSpecificAttribute("apokolips", false);
    espantalho.addSpecificAttribute("voar", false);
    espantalho.addSpecificAttribute("superForca", false);
    espantalho.addSpecificAttribute("superVelocidade", false);
    espantalho.addSpecificAttribute("visaoDeRaioX", false);
    espantalho.addSpecificAttribute("visaoDeCalor", false);
    espantalho.addSpecificAttribute("superSopro", false);
    espantalho.addSpecificAttribute("traje", true);
    espantalho.addSpecificAttribute("regeneracao", false);
    espantalho.addSpecificAttribute("controleMetal", false);
    espantalho.addSpecificAttribute("capacete", true);
    espantalho.addSpecificAttribute("telepatia", false);
    espantalho.addSpecificAttribute("telecinese", false);
    espantalho.addSpecificAttribute("absorverEnergia", false);
    espantalho.addSpecificAttribute("inteligenciaArtificial", false);
    espantalho.addSpecificAttribute("manipulacaoRealidade", false);
    espantalho.addSpecificAttribute("agilidadeAprimorada", false);
    espantalho.addSpecificAttribute("realeza", false);
    espantalho.addSpecificAttribute("treinamentoEspecial", true);
    espantalho.addSpecificAttribute("superSoldado", false);
    espantalho.addSpecificAttribute("bilionario", false);
    espantalho.addSpecificAttribute("patriota", false);
    espantalho.addSpecificAttribute("combateCorpoACorpo", false);
    espantalho.addSpecificAttribute("artesMarciais", false);
    espantalho.addSpecificAttribute("forcaDivina", false);
    espantalho.addSpecificAttribute("manipulacaoDeEnergia", false);
    espantalho.addSpecificAttribute("fazerFeitico", true);
    espantalho.addSpecificAttribute("Maguinetismo", false);

    Features comissarioGordon = new Features("Comissário Gordon", "masculino", true, false, "", "heroi",
        "coadjuvante", false, false, "",
        true, true, true,
        false, "humano", false, false,
        false, false, "");

    comissarioGordon.addSpecificAttribute("DCComics", true);
    comissarioGordon.addSpecificAttribute("ligaDaJustica", false);
    comissarioGordon.addSpecificAttribute("metropolis", false);
    comissarioGordon.addSpecificAttribute("gothamCity", true);
    comissarioGordon.addSpecificAttribute("themyscira", false);
    comissarioGordon.addSpecificAttribute("centralCity", false);
    comissarioGordon.addSpecificAttribute("coastCity", false);
    comissarioGordon.addSpecificAttribute("atlantis", false);
    comissarioGordon.addSpecificAttribute("apokolips", false);
    comissarioGordon.addSpecificAttribute("voar", false);
    comissarioGordon.addSpecificAttribute("superForca", false);
    comissarioGordon.addSpecificAttribute("superVelocidade", false);
    comissarioGordon.addSpecificAttribute("visaoDeRaioX", false);
    comissarioGordon.addSpecificAttribute("visaoDeCalor", false);
    comissarioGordon.addSpecificAttribute("superSopro", false);
    comissarioGordon.addSpecificAttribute("traje", false);
    comissarioGordon.addSpecificAttribute("regeneracao", false);
    comissarioGordon.addSpecificAttribute("controleMetal", false);
    comissarioGordon.addSpecificAttribute("capacete", false);
    comissarioGordon.addSpecificAttribute("telepatia", false);
    comissarioGordon.addSpecificAttribute("telecinese", false);
    comissarioGordon.addSpecificAttribute("absorverEnergia", false);
    comissarioGordon.addSpecificAttribute("inteligenciaArtificial", false);
    comissarioGordon.addSpecificAttribute("manipulacaoRealidade", false);
    comissarioGordon.addSpecificAttribute("agilidadeAprimorada", false);
    comissarioGordon.addSpecificAttribute("realeza", false);
    comissarioGordon.addSpecificAttribute("treinamentoEspecial", true);
    comissarioGordon.addSpecificAttribute("superSoldado", false);
    comissarioGordon.addSpecificAttribute("bilionario", false);
    comissarioGordon.addSpecificAttribute("patriota", true);
    comissarioGordon.addSpecificAttribute("combateCorpoACorpo", true);
    comissarioGordon.addSpecificAttribute("artesMarciais", true);
    comissarioGordon.addSpecificAttribute("forcaDivina", false);
    comissarioGordon.addSpecificAttribute("manipulacaoDeEnergia", false);
    comissarioGordon.addSpecificAttribute("fazerFeitico", false);
    comissarioGordon.addSpecificAttribute("Maguinetismo", false);

    Features arlequina = new Features("Arlequina", "feminino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, false,
        true, "humano", true, false,
        false, false, "");

    arlequina.addSpecificAttribute("DCComics", true);
    arlequina.addSpecificAttribute("ligaDaJustica", false);
    arlequina.addSpecificAttribute("metropolis", false);
    arlequina.addSpecificAttribute("gothamCity", true);
    arlequina.addSpecificAttribute("themyscira", false);
    arlequina.addSpecificAttribute("centralCity", false);
    arlequina.addSpecificAttribute("coastCity", false);
    arlequina.addSpecificAttribute("atlantis", false);
    arlequina.addSpecificAttribute("apokolips", false);
    arlequina.addSpecificAttribute("voar", false);
    arlequina.addSpecificAttribute("superForca", false);
    arlequina.addSpecificAttribute("superVelocidade", false);
    arlequina.addSpecificAttribute("visaoDeRaioX", false);
    arlequina.addSpecificAttribute("visaoDeCalor", false);
    arlequina.addSpecificAttribute("superSopro", false);
    arlequina.addSpecificAttribute("traje", true);
    arlequina.addSpecificAttribute("regeneracao", false);
    arlequina.addSpecificAttribute("controleMetal", false);
    arlequina.addSpecificAttribute("capacete", false);
    arlequina.addSpecificAttribute("telepatia", false);
    arlequina.addSpecificAttribute("telecinese", false);
    arlequina.addSpecificAttribute("absorverEnergia", false);
    arlequina.addSpecificAttribute("inteligenciaArtificial", false);
    arlequina.addSpecificAttribute("manipulacaoRealidade", false);
    arlequina.addSpecificAttribute("agilidadeAprimorada", true);
    arlequina.addSpecificAttribute("realeza", false);
    arlequina.addSpecificAttribute("treinamentoEspecial", true);
    arlequina.addSpecificAttribute("superSoldado", false);
    arlequina.addSpecificAttribute("bilionario", false);
    arlequina.addSpecificAttribute("patriota", false);
    arlequina.addSpecificAttribute("combateCorpoACorpo", true);
    arlequina.addSpecificAttribute("artesMarciais", true);
    arlequina.addSpecificAttribute("forcaDivina", false);
    arlequina.addSpecificAttribute("manipulacaoDeEnergia", false);
    arlequina.addSpecificAttribute("fazerFeitico", false);
    arlequina.addSpecificAttribute("Maguinetismo", false);

    Features hera = new Features("Hera Venenosa", "feminino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "metahumano", false, false,
        false, false, "");

    hera.addSpecificAttribute("DCComics", true);
    hera.addSpecificAttribute("ligaDaJustica", false);
    hera.addSpecificAttribute("metropolis", false);
    hera.addSpecificAttribute("gothamCity", true);
    hera.addSpecificAttribute("themyscira", false);
    hera.addSpecificAttribute("centralCity", false);
    hera.addSpecificAttribute("coastCity", false);
    hera.addSpecificAttribute("atlantis", false);
    hera.addSpecificAttribute("apokolips", false);
    hera.addSpecificAttribute("voar", false);
    hera.addSpecificAttribute("superForca", false);
    hera.addSpecificAttribute("superVelocidade", false);
    hera.addSpecificAttribute("visaoDeRaioX", false);
    hera.addSpecificAttribute("visaoDeCalor", false);
    hera.addSpecificAttribute("superSopro", false);
    hera.addSpecificAttribute("traje", true);
    hera.addSpecificAttribute("regeneracao", true);
    hera.addSpecificAttribute("controleMetal", false);
    hera.addSpecificAttribute("capacete", false);
    hera.addSpecificAttribute("telepatia", false);
    hera.addSpecificAttribute("telecinese", false);
    hera.addSpecificAttribute("absorverEnergia", false);
    hera.addSpecificAttribute("inteligenciaArtificial", false);
    hera.addSpecificAttribute("manipulacaoRealidade", false);
    hera.addSpecificAttribute("agilidadeAprimorada", false);
    hera.addSpecificAttribute("realeza", false);
    hera.addSpecificAttribute("treinamentoEspecial", true);
    hera.addSpecificAttribute("superSoldado", false);
    hera.addSpecificAttribute("bilionario", false);
    hera.addSpecificAttribute("patriota", false);
    hera.addSpecificAttribute("combateCorpoACorpo", false);
    hera.addSpecificAttribute("artesMarciais", false);
    hera.addSpecificAttribute("forcaDivina", false);
    hera.addSpecificAttribute("manipulacaoDeEnergia", true);
    hera.addSpecificAttribute("fazerFeitico", true);
    hera.addSpecificAttribute("Maguinetismo", false);

    Features mrFreeze = new Features("Mr. Freeze", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        false, "humano", false, false,
        true, true, "");

    mrFreeze.addSpecificAttribute("DCComics", true);
    mrFreeze.addSpecificAttribute("ligaDaJustica", false);
    mrFreeze.addSpecificAttribute("metropolis", false);
    mrFreeze.addSpecificAttribute("gothamCity", true);
    mrFreeze.addSpecificAttribute("themyscira", false);
    mrFreeze.addSpecificAttribute("centralCity", false);
    mrFreeze.addSpecificAttribute("coastCity", false);
    mrFreeze.addSpecificAttribute("atlantis", false);
    mrFreeze.addSpecificAttribute("apokolips", false);
    mrFreeze.addSpecificAttribute("voar", false);
    mrFreeze.addSpecificAttribute("superForca", false);
    mrFreeze.addSpecificAttribute("superVelocidade", false);
    mrFreeze.addSpecificAttribute("visaoDeRaioX", false);
    mrFreeze.addSpecificAttribute("visaoDeCalor", false);
    mrFreeze.addSpecificAttribute("superSopro", false);
    mrFreeze.addSpecificAttribute("traje", true);
    mrFreeze.addSpecificAttribute("regeneracao", false);
    mrFreeze.addSpecificAttribute("controleMetal", false);
    mrFreeze.addSpecificAttribute("capacete", true);
    mrFreeze.addSpecificAttribute("telepatia", false);
    mrFreeze.addSpecificAttribute("telecinese", false);
    mrFreeze.addSpecificAttribute("absorverEnergia", false);
    mrFreeze.addSpecificAttribute("inteligenciaArtificial", false);
    mrFreeze.addSpecificAttribute("manipulacaoRealidade", false);
    mrFreeze.addSpecificAttribute("agilidadeAprimorada", false);
    mrFreeze.addSpecificAttribute("realeza", false);
    mrFreeze.addSpecificAttribute("treinamentoEspecial", true);
    mrFreeze.addSpecificAttribute("superSoldado", false);
    mrFreeze.addSpecificAttribute("bilionario", false);
    mrFreeze.addSpecificAttribute("patriota", false);
    mrFreeze.addSpecificAttribute("combateCorpoACorpo", false);
    mrFreeze.addSpecificAttribute("artesMarciais", false);
    mrFreeze.addSpecificAttribute("forcaDivina", false);
    mrFreeze.addSpecificAttribute("manipulacaoDeEnergia", true);
    mrFreeze.addSpecificAttribute("fazerFeitico", false);
    mrFreeze.addSpecificAttribute("Maguinetismo", false);

    Features charada = new Features("Charada", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "humano", true, false,
        true, false, "");

    charada.addSpecificAttribute("DCComics", true);
    charada.addSpecificAttribute("ligaDaJustica", false);
    charada.addSpecificAttribute("metropolis", false);
    charada.addSpecificAttribute("gothamCity", true);
    charada.addSpecificAttribute("themyscira", false);
    charada.addSpecificAttribute("centralCity", false);
    charada.addSpecificAttribute("coastCity", false);
    charada.addSpecificAttribute("atlantis", false);
    charada.addSpecificAttribute("apokolips", false);
    charada.addSpecificAttribute("voar", false);
    charada.addSpecificAttribute("superForca", false);
    charada.addSpecificAttribute("superVelocidade", false);
    charada.addSpecificAttribute("visaoDeRaioX", false);
    charada.addSpecificAttribute("visaoDeCalor", false);
    charada.addSpecificAttribute("superSopro", false);
    charada.addSpecificAttribute("traje", true);
    charada.addSpecificAttribute("regeneracao", false);
    charada.addSpecificAttribute("controleMetal", false);
    charada.addSpecificAttribute("capacete", false);
    charada.addSpecificAttribute("telepatia", false);
    charada.addSpecificAttribute("telecinese", false);
    charada.addSpecificAttribute("absorverEnergia", false);
    charada.addSpecificAttribute("inteligenciaArtificial", false);
    charada.addSpecificAttribute("manipulacaoRealidade", false);
    charada.addSpecificAttribute("agilidadeAprimorada", false);
    charada.addSpecificAttribute("realeza", false);
    charada.addSpecificAttribute("treinamentoEspecial", true);
    charada.addSpecificAttribute("superSoldado", false);
    charada.addSpecificAttribute("bilionario", false);
    charada.addSpecificAttribute("patriota", false);
    charada.addSpecificAttribute("combateCorpoACorpo", false);
    charada.addSpecificAttribute("artesMarciais", false);
    charada.addSpecificAttribute("forcaDivina", false);
    charada.addSpecificAttribute("manipulacaoDeEnergia", false);
    charada.addSpecificAttribute("fazerFeitico", false);
    charada.addSpecificAttribute("Maguinetismo", false);

    Features azrael = new Features("Azrael", "masculino", false, false, "", "anti-heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "humano", false, false,
        false, true, "");

    azrael.addSpecificAttribute("DCComics", true);
    azrael.addSpecificAttribute("ligaDaJustica", false);
    azrael.addSpecificAttribute("metropolis", false);
    azrael.addSpecificAttribute("gothamCity", true);
    azrael.addSpecificAttribute("themyscira", false);
    azrael.addSpecificAttribute("centralCity", false);
    azrael.addSpecificAttribute("coastCity", false);
    azrael.addSpecificAttribute("atlantis", false);
    azrael.addSpecificAttribute("apokolips", false);
    azrael.addSpecificAttribute("voar", false);
    azrael.addSpecificAttribute("superForca", false);
    azrael.addSpecificAttribute("superVelocidade", false);
    azrael.addSpecificAttribute("visaoDeRaioX", false);
    azrael.addSpecificAttribute("visaoDeCalor", false);
    azrael.addSpecificAttribute("superSopro", false);
    azrael.addSpecificAttribute("traje", true);
    azrael.addSpecificAttribute("regeneracao", false);
    azrael.addSpecificAttribute("controleMetal", false);
    azrael.addSpecificAttribute("capacete", true);
    azrael.addSpecificAttribute("telepatia", false);
    azrael.addSpecificAttribute("telecinese", false);
    azrael.addSpecificAttribute("absorverEnergia", false);
    azrael.addSpecificAttribute("inteligenciaArtificial", false);
    azrael.addSpecificAttribute("manipulacaoRealidade", false);
    azrael.addSpecificAttribute("agilidadeAprimorada", true);
    azrael.addSpecificAttribute("realeza", false);
    azrael.addSpecificAttribute("treinamentoEspecial", true);
    azrael.addSpecificAttribute("superSoldado", false);
    azrael.addSpecificAttribute("bilionario", false);
    azrael.addSpecificAttribute("patriota", false);
    azrael.addSpecificAttribute("combateCorpoACorpo", true);
    azrael.addSpecificAttribute("artesMarciais", true);
    azrael.addSpecificAttribute("forcaDivina", false);
    azrael.addSpecificAttribute("manipulacaoDeEnergia", false);
    azrael.addSpecificAttribute("fazerFeitico", false);
    azrael.addSpecificAttribute("Maguinetismo", false);

    Features mulherMaravilha = new Features("Mulher-Maravilha", "feminino", false, true, "", "heroi",
        "protagonista", false, true, "",
        true, true, true,
        false, "amazona", false, false,
        false, true, "");

    mulherMaravilha.addSpecificAttribute("DCComics", true);
    mulherMaravilha.addSpecificAttribute("ligaDaJustica", true);
    mulherMaravilha.addSpecificAttribute("metropolis", false);
    mulherMaravilha.addSpecificAttribute("gothamCity", false);
    mulherMaravilha.addSpecificAttribute("themyscira", true);
    mulherMaravilha.addSpecificAttribute("centralCity", false);
    mulherMaravilha.addSpecificAttribute("coastCity", false);
    mulherMaravilha.addSpecificAttribute("atlantis", false);
    mulherMaravilha.addSpecificAttribute("apokolips", false);
    mulherMaravilha.addSpecificAttribute("voar", true);
    mulherMaravilha.addSpecificAttribute("superForca", true);
    mulherMaravilha.addSpecificAttribute("superVelocidade", true);
    mulherMaravilha.addSpecificAttribute("visaoDeRaioX", false);
    mulherMaravilha.addSpecificAttribute("visaoDeCalor", false);
    mulherMaravilha.addSpecificAttribute("superSopro", false);
    mulherMaravilha.addSpecificAttribute("traje", true);
    mulherMaravilha.addSpecificAttribute("regeneracao", true);
    mulherMaravilha.addSpecificAttribute("controleMetal", false);
    mulherMaravilha.addSpecificAttribute("capacete", false);
    mulherMaravilha.addSpecificAttribute("telepatia", false);
    mulherMaravilha.addSpecificAttribute("telecinese", false);
    mulherMaravilha.addSpecificAttribute("absorverEnergia", false);
    mulherMaravilha.addSpecificAttribute("inteligenciaArtificial", false);
    mulherMaravilha.addSpecificAttribute("manipulacaoRealidade", false);
    mulherMaravilha.addSpecificAttribute("agilidadeAprimorada", true);
    mulherMaravilha.addSpecificAttribute("realeza", true);
    mulherMaravilha.addSpecificAttribute("treinamentoEspecial", true);
    mulherMaravilha.addSpecificAttribute("superSoldado", false);
    mulherMaravilha.addSpecificAttribute("bilionario", false);
    mulherMaravilha.addSpecificAttribute("patriota", true);
    mulherMaravilha.addSpecificAttribute("combateCorpoACorpo", true);
    mulherMaravilha.addSpecificAttribute("artesMarciais", true);
    mulherMaravilha.addSpecificAttribute("forcaDivina", true);
    mulherMaravilha.addSpecificAttribute("manipulacaoDeEnergia", false);
    mulherMaravilha.addSpecificAttribute("fazerFeitico", false);
    mulherMaravilha.addSpecificAttribute("Maguinetismo", false);

    Features hippolyta = new Features("Hippolyta", "feminino", true, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "amazona", false, false,
        false, true, "");

    hippolyta.addSpecificAttribute("DCComics", true);
    hippolyta.addSpecificAttribute("ligaDaJustica", false);
    hippolyta.addSpecificAttribute("metropolis", false);
    hippolyta.addSpecificAttribute("gothamCity", false);
    hippolyta.addSpecificAttribute("themyscira", true);
    hippolyta.addSpecificAttribute("centralCity", false);
    hippolyta.addSpecificAttribute("coastCity", false);
    hippolyta.addSpecificAttribute("atlantis", false);
    hippolyta.addSpecificAttribute("apokolips", false);
    hippolyta.addSpecificAttribute("voar", false);
    hippolyta.addSpecificAttribute("superForca", true);
    hippolyta.addSpecificAttribute("superVelocidade", false);
    hippolyta.addSpecificAttribute("visaoDeRaioX", false);
    hippolyta.addSpecificAttribute("visaoDeCalor", false);
    hippolyta.addSpecificAttribute("superSopro", false);
    hippolyta.addSpecificAttribute("traje", true);
    hippolyta.addSpecificAttribute("regeneracao", true);
    hippolyta.addSpecificAttribute("controleMetal", false);
    hippolyta.addSpecificAttribute("capacete", false);
    hippolyta.addSpecificAttribute("telepatia", false);
    hippolyta.addSpecificAttribute("telecinese", false);
    hippolyta.addSpecificAttribute("absorverEnergia", false);
    hippolyta.addSpecificAttribute("inteligenciaArtificial", false);
    hippolyta.addSpecificAttribute("manipulacaoRealidade", false);
    hippolyta.addSpecificAttribute("agilidadeAprimorada", true);
    hippolyta.addSpecificAttribute("realeza", true);
    hippolyta.addSpecificAttribute("treinamentoEspecial", true);
    hippolyta.addSpecificAttribute("superSoldado", false);
    hippolyta.addSpecificAttribute("bilionario", false);
    hippolyta.addSpecificAttribute("patriota", true);
    hippolyta.addSpecificAttribute("combateCorpoACorpo", true);
    hippolyta.addSpecificAttribute("artesMarciais", true);
    hippolyta.addSpecificAttribute("forcaDivina", true);
    hippolyta.addSpecificAttribute("manipulacaoDeEnergia", false);
    hippolyta.addSpecificAttribute("fazerFeitico", false);
    hippolyta.addSpecificAttribute("Maguinetismo", false);

    Features antiope = new Features("Antiope", "feminino", false, true, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "amazona", false, false,
        false, true, "");

    antiope.addSpecificAttribute("DCComics", true);
    antiope.addSpecificAttribute("ligaDaJustica", false);
    antiope.addSpecificAttribute("metropolis", false);
    antiope.addSpecificAttribute("gothamCity", false);
    antiope.addSpecificAttribute("themyscira", true);
    antiope.addSpecificAttribute("centralCity", false);
    antiope.addSpecificAttribute("coastCity", false);
    antiope.addSpecificAttribute("atlantis", false);
    antiope.addSpecificAttribute("apokolips", false);
    antiope.addSpecificAttribute("voar", false);
    antiope.addSpecificAttribute("superForca", true);
    antiope.addSpecificAttribute("superVelocidade", false);
    antiope.addSpecificAttribute("visaoDeRaioX", false);
    antiope.addSpecificAttribute("visaoDeCalor", false);
    antiope.addSpecificAttribute("superSopro", false);
    antiope.addSpecificAttribute("traje", true);
    antiope.addSpecificAttribute("regeneracao", true);
    antiope.addSpecificAttribute("controleMetal", false);
    antiope.addSpecificAttribute("capacete", false);
    antiope.addSpecificAttribute("telepatia", false);
    antiope.addSpecificAttribute("telecinese", false);
    antiope.addSpecificAttribute("absorverEnergia", false);
    antiope.addSpecificAttribute("inteligenciaArtificial", false);
    antiope.addSpecificAttribute("manipulacaoRealidade", false);
    antiope.addSpecificAttribute("agilidadeAprimorada", true);
    antiope.addSpecificAttribute("realeza", true);
    antiope.addSpecificAttribute("treinamentoEspecial", true);
    antiope.addSpecificAttribute("superSoldado", false);
    antiope.addSpecificAttribute("bilionario", false);
    antiope.addSpecificAttribute("patriota", true);
    antiope.addSpecificAttribute("combateCorpoACorpo", true);
    antiope.addSpecificAttribute("artesMarciais", true);
    antiope.addSpecificAttribute("forcaDivina", true);
    antiope.addSpecificAttribute("manipulacaoDeEnergia", false);
    antiope.addSpecificAttribute("fazerFeitico", false);
    antiope.addSpecificAttribute("Maguinetismo", false);

    Features artemis = new Features("Artemis", "feminino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "amazona", false, false,
        false, true, "");

    artemis.addSpecificAttribute("DCComics", true);
    artemis.addSpecificAttribute("ligaDaJustica", false);
    artemis.addSpecificAttribute("metropolis", false);
    artemis.addSpecificAttribute("gothamCity", false);
    artemis.addSpecificAttribute("themyscira", true);
    artemis.addSpecificAttribute("centralCity", false);
    artemis.addSpecificAttribute("coastCity", false);
    artemis.addSpecificAttribute("atlantis", false);
    artemis.addSpecificAttribute("apokolips", false);
    artemis.addSpecificAttribute("voar", false);
    artemis.addSpecificAttribute("superForca", true);
    artemis.addSpecificAttribute("superVelocidade", false);
    artemis.addSpecificAttribute("visaoDeRaioX", false);
    artemis.addSpecificAttribute("visaoDeCalor", false);
    artemis.addSpecificAttribute("superSopro", false);
    artemis.addSpecificAttribute("traje", true);
    artemis.addSpecificAttribute("regeneracao", true);
    artemis.addSpecificAttribute("controleMetal", false);
    artemis.addSpecificAttribute("capacete", false);
    artemis.addSpecificAttribute("telepatia", false);
    artemis.addSpecificAttribute("telecinese", false);
    artemis.addSpecificAttribute("absorverEnergia", false);
    artemis.addSpecificAttribute("inteligenciaArtificial", false);
    artemis.addSpecificAttribute("manipulacaoRealidade", false);
    artemis.addSpecificAttribute("agilidadeAprimorada", true);
    artemis.addSpecificAttribute("realeza", false);
    artemis.addSpecificAttribute("treinamentoEspecial", true);
    artemis.addSpecificAttribute("superSoldado", false);
    artemis.addSpecificAttribute("bilionario", false);
    artemis.addSpecificAttribute("patriota", true);
    artemis.addSpecificAttribute("combateCorpoACorpo", true);
    artemis.addSpecificAttribute("artesMarciais", true);
    artemis.addSpecificAttribute("forcaDivina", true);
    artemis.addSpecificAttribute("manipulacaoDeEnergia", false);
    artemis.addSpecificAttribute("fazerFeitico", false);
    artemis.addSpecificAttribute("Maguinetismo", false);

    Features nubia = new Features("Nubia", "feminino", false, true, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "amazona", false, false,
        false, true, "");

    nubia.addSpecificAttribute("DCComics", true);
    nubia.addSpecificAttribute("ligaDaJustica", false);
    nubia.addSpecificAttribute("metropolis", false);
    nubia.addSpecificAttribute("gothamCity", false);
    nubia.addSpecificAttribute("themyscira", true);
    nubia.addSpecificAttribute("centralCity", false);
    nubia.addSpecificAttribute("coastCity", false);
    nubia.addSpecificAttribute("atlantis", false);
    nubia.addSpecificAttribute("apokolips", false);
    nubia.addSpecificAttribute("voar", true);
    nubia.addSpecificAttribute("superForca", true);
    nubia.addSpecificAttribute("superVelocidade", true);
    nubia.addSpecificAttribute("visaoDeRaioX", false);
    nubia.addSpecificAttribute("visaoDeCalor", false);
    nubia.addSpecificAttribute("superSopro", false);
    nubia.addSpecificAttribute("traje", true);
    nubia.addSpecificAttribute("regeneracao", true);
    nubia.addSpecificAttribute("controleMetal", false);
    nubia.addSpecificAttribute("capacete", false);
    nubia.addSpecificAttribute("telepatia", false);
    nubia.addSpecificAttribute("telecinese", false);
    nubia.addSpecificAttribute("absorverEnergia", false);
    nubia.addSpecificAttribute("inteligenciaArtificial", false);
    nubia.addSpecificAttribute("manipulacaoRealidade", false);
    nubia.addSpecificAttribute("agilidadeAprimorada", true);
    nubia.addSpecificAttribute("realeza", true);
    nubia.addSpecificAttribute("treinamentoEspecial", true);
    nubia.addSpecificAttribute("superSoldado", false);
    nubia.addSpecificAttribute("bilionario", false);
    nubia.addSpecificAttribute("patriota", true);
    nubia.addSpecificAttribute("combateCorpoACorpo", true);
    nubia.addSpecificAttribute("artesMarciais", true);
    nubia.addSpecificAttribute("forcaDivina", true);
    nubia.addSpecificAttribute("manipulacaoDeEnergia", false);
    nubia.addSpecificAttribute("fazerFeitico", false);
    nubia.addSpecificAttribute("Maguinetismo", false);

    Features philippusGeneral = new Features("General Philippus", "feminino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "amazona", false, false,
        false, true, "");

    philippusGeneral.addSpecificAttribute("DCComics", true);
    philippusGeneral.addSpecificAttribute("ligaDaJustica", false);
    philippusGeneral.addSpecificAttribute("metropolis", false);
    philippusGeneral.addSpecificAttribute("gothamCity", false);
    philippusGeneral.addSpecificAttribute("themyscira", true);
    philippusGeneral.addSpecificAttribute("centralCity", false);
    philippusGeneral.addSpecificAttribute("coastCity", false);
    philippusGeneral.addSpecificAttribute("atlantis", false);
    philippusGeneral.addSpecificAttribute("apokolips", false);
    philippusGeneral.addSpecificAttribute("voar", false);
    philippusGeneral.addSpecificAttribute("superForca", true);
    philippusGeneral.addSpecificAttribute("superVelocidade", false);
    philippusGeneral.addSpecificAttribute("visaoDeRaioX", false);
    philippusGeneral.addSpecificAttribute("visaoDeCalor", false);
    philippusGeneral.addSpecificAttribute("superSopro", false);
    philippusGeneral.addSpecificAttribute("traje", true);
    philippusGeneral.addSpecificAttribute("regeneracao", true);
    philippusGeneral.addSpecificAttribute("controleMetal", false);
    philippusGeneral.addSpecificAttribute("capacete", false);
    philippusGeneral.addSpecificAttribute("telepatia", false);
    philippusGeneral.addSpecificAttribute("telecinese", false);
    philippusGeneral.addSpecificAttribute("absorverEnergia", false);
    philippusGeneral.addSpecificAttribute("inteligenciaArtificial", false);
    philippusGeneral.addSpecificAttribute("manipulacaoRealidade", false);
    philippusGeneral.addSpecificAttribute("agilidadeAprimorada", true);
    philippusGeneral.addSpecificAttribute("realeza", false);
    philippusGeneral.addSpecificAttribute("treinamentoEspecial", true);
    philippusGeneral.addSpecificAttribute("superSoldado", false);
    philippusGeneral.addSpecificAttribute("bilionario", false);
    philippusGeneral.addSpecificAttribute("patriota", true);
    philippusGeneral.addSpecificAttribute("combateCorpoACorpo", true);
    philippusGeneral.addSpecificAttribute("artesMarciais", true);
    philippusGeneral.addSpecificAttribute("forcaDivina", true);
    philippusGeneral.addSpecificAttribute("manipulacaoDeEnergia", false);
    philippusGeneral.addSpecificAttribute("fazerFeitico", false);
    philippusGeneral.addSpecificAttribute("Maguinetismo", false);

    Features epione = new Features("Epione", "feminino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "amazona", false, false,
        false, false, "");

    epione.addSpecificAttribute("DCComics", true);
    epione.addSpecificAttribute("ligaDaJustica", false);
    epione.addSpecificAttribute("metropolis", false);
    epione.addSpecificAttribute("gothamCity", false);
    epione.addSpecificAttribute("themyscira", true);
    epione.addSpecificAttribute("centralCity", false);
    epione.addSpecificAttribute("coastCity", false);
    epione.addSpecificAttribute("atlantis", false);
    epione.addSpecificAttribute("apokolips", false);
    epione.addSpecificAttribute("voar", false);
    epione.addSpecificAttribute("superForca", true);
    epione.addSpecificAttribute("superVelocidade", false);
    epione.addSpecificAttribute("visaoDeRaioX", false);
    epione.addSpecificAttribute("visaoDeCalor", false);
    epione.addSpecificAttribute("superSopro", false);
    epione.addSpecificAttribute("traje", true);
    epione.addSpecificAttribute("regeneracao", true);
    epione.addSpecificAttribute("controleMetal", false);
    epione.addSpecificAttribute("capacete", false);
    epione.addSpecificAttribute("telepatia", false);
    epione.addSpecificAttribute("telecinese", false);
    epione.addSpecificAttribute("absorverEnergia", false);
    epione.addSpecificAttribute("inteligenciaArtificial", false);
    epione.addSpecificAttribute("manipulacaoRealidade", false);
    epione.addSpecificAttribute("agilidadeAprimorada", true);
    epione.addSpecificAttribute("realeza", false);
    epione.addSpecificAttribute("treinamentoEspecial", true);
    epione.addSpecificAttribute("superSoldado", false);
    epione.addSpecificAttribute("bilionario", false);
    epione.addSpecificAttribute("patriota", true);
    epione.addSpecificAttribute("combateCorpoACorpo", true);
    epione.addSpecificAttribute("artesMarciais", true);
    epione.addSpecificAttribute("forcaDivina", true);
    epione.addSpecificAttribute("manipulacaoDeEnergia", false);
    epione.addSpecificAttribute("fazerFeitico", true);
    epione.addSpecificAttribute("Maguinetismo", false);

    Features menalippe = new Features("Menalippe", "feminino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "amazona", false, false,
        false, false, "");

    menalippe.addSpecificAttribute("DCComics", true);
    menalippe.addSpecificAttribute("ligaDaJustica", false);
    menalippe.addSpecificAttribute("metropolis", false);
    menalippe.addSpecificAttribute("gothamCity", false);
    menalippe.addSpecificAttribute("themyscira", true);
    menalippe.addSpecificAttribute("centralCity", false);
    menalippe.addSpecificAttribute("coastCity", false);
    menalippe.addSpecificAttribute("atlantis", false);
    menalippe.addSpecificAttribute("apokolips", false);
    menalippe.addSpecificAttribute("voar", false);
    menalippe.addSpecificAttribute("superForca", true);
    menalippe.addSpecificAttribute("superVelocidade", false);
    menalippe.addSpecificAttribute("visaoDeRaioX", false);
    menalippe.addSpecificAttribute("visaoDeCalor", false);
    menalippe.addSpecificAttribute("superSopro", false);
    menalippe.addSpecificAttribute("traje", true);
    menalippe.addSpecificAttribute("regeneracao", true);
    menalippe.addSpecificAttribute("controleMetal", false);
    menalippe.addSpecificAttribute("capacete", false);
    menalippe.addSpecificAttribute("telepatia", false);
    menalippe.addSpecificAttribute("telecinese", false);
    menalippe.addSpecificAttribute("absorverEnergia", false);
    menalippe.addSpecificAttribute("inteligenciaArtificial", false);
    menalippe.addSpecificAttribute("manipulacaoRealidade", false);
    menalippe.addSpecificAttribute("agilidadeAprimorada", true);
    menalippe.addSpecificAttribute("realeza", false);
    menalippe.addSpecificAttribute("treinamentoEspecial", true);
    menalippe.addSpecificAttribute("superSoldado", false);
    menalippe.addSpecificAttribute("bilionario", false);
    menalippe.addSpecificAttribute("patriota", true);
    menalippe.addSpecificAttribute("combateCorpoACorpo", true);
    menalippe.addSpecificAttribute("artesMarciais", true);
    menalippe.addSpecificAttribute("forcaDivina", true);
    menalippe.addSpecificAttribute("manipulacaoDeEnergia", false);
    menalippe.addSpecificAttribute("fazerFeitico", true);
    menalippe.addSpecificAttribute("Maguinetismo", false);

    Features ioLantern = new Features("Io (Amazona Lanterna)", "feminino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "amazona", false, false,
        false, true, "");

    ioLantern.addSpecificAttribute("DCComics", true);
    ioLantern.addSpecificAttribute("ligaDaJustica", false);
    ioLantern.addSpecificAttribute("metropolis", false);
    ioLantern.addSpecificAttribute("gothamCity", false);
    ioLantern.addSpecificAttribute("themyscira", true);
    ioLantern.addSpecificAttribute("centralCity", false);
    ioLantern.addSpecificAttribute("coastCity", false);
    ioLantern.addSpecificAttribute("atlantis", false);
    ioLantern.addSpecificAttribute("apokolips", false);
    ioLantern.addSpecificAttribute("voar", true);
    ioLantern.addSpecificAttribute("superForca", true);
    ioLantern.addSpecificAttribute("superVelocidade", false);
    ioLantern.addSpecificAttribute("visaoDeRaioX", false);
    ioLantern.addSpecificAttribute("visaoDeCalor", false);
    ioLantern.addSpecificAttribute("superSopro", false);
    ioLantern.addSpecificAttribute("traje", true);
    ioLantern.addSpecificAttribute("regeneracao", true);
    ioLantern.addSpecificAttribute("controleMetal", false);
    ioLantern.addSpecificAttribute("capacete", false);
    ioLantern.addSpecificAttribute("telepatia", false);
    ioLantern.addSpecificAttribute("telecinese", false);
    ioLantern.addSpecificAttribute("absorverEnergia", true);
    ioLantern.addSpecificAttribute("inteligenciaArtificial", false);
    ioLantern.addSpecificAttribute("manipulacaoRealidade", false);
    ioLantern.addSpecificAttribute("agilidadeAprimorada", true);
    ioLantern.addSpecificAttribute("realeza", false);
    ioLantern.addSpecificAttribute("treinamentoEspecial", true);
    ioLantern.addSpecificAttribute("superSoldado", false);
    ioLantern.addSpecificAttribute("bilionario", false);
    ioLantern.addSpecificAttribute("patriota", true);
    ioLantern.addSpecificAttribute("combateCorpoACorpo", true);
    ioLantern.addSpecificAttribute("artesMarciais", true);
    ioLantern.addSpecificAttribute("forcaDivina", true);
    ioLantern.addSpecificAttribute("manipulacaoDeEnergia", true);
    ioLantern.addSpecificAttribute("fazerFeitico", false);
    ioLantern.addSpecificAttribute("Maguinetismo", false);

    Features barryAllen = new Features("Barry Allen (Flash)", "masculino", false, false, "", "heroi",
        "protagonista", false, true, "",
        true, true, true,
        false, "metahumano", false, false,
        false, true, "");

    barryAllen.addSpecificAttribute("DCComics", true);
    barryAllen.addSpecificAttribute("ligaDaJustica", true);
    barryAllen.addSpecificAttribute("metropolis", false);
    barryAllen.addSpecificAttribute("gothamCity", false);
    barryAllen.addSpecificAttribute("themyscira", false);
    barryAllen.addSpecificAttribute("centralCity", true);
    barryAllen.addSpecificAttribute("coastCity", false);
    barryAllen.addSpecificAttribute("atlantis", false);
    barryAllen.addSpecificAttribute("apokolips", false);
    barryAllen.addSpecificAttribute("voar", false);
    barryAllen.addSpecificAttribute("superForca", false);
    barryAllen.addSpecificAttribute("superVelocidade", true);
    barryAllen.addSpecificAttribute("visaoDeRaioX", false);
    barryAllen.addSpecificAttribute("visaoDeCalor", false);
    barryAllen.addSpecificAttribute("superSopro", false);
    barryAllen.addSpecificAttribute("traje", true);
    barryAllen.addSpecificAttribute("regeneracao", true);
    barryAllen.addSpecificAttribute("controleMetal", false);
    barryAllen.addSpecificAttribute("capacete", false);
    barryAllen.addSpecificAttribute("telepatia", false);
    barryAllen.addSpecificAttribute("telecinese", false);
    barryAllen.addSpecificAttribute("absorverEnergia", false);
    barryAllen.addSpecificAttribute("inteligenciaArtificial", false);
    barryAllen.addSpecificAttribute("manipulacaoRealidade", false);
    barryAllen.addSpecificAttribute("agilidadeAprimorada", true);
    barryAllen.addSpecificAttribute("realeza", false);
    barryAllen.addSpecificAttribute("treinamentoEspecial", true);
    barryAllen.addSpecificAttribute("superSoldado", false);
    barryAllen.addSpecificAttribute("bilionario", false);
    barryAllen.addSpecificAttribute("patriota", true);
    barryAllen.addSpecificAttribute("combateCorpoACorpo", true);
    barryAllen.addSpecificAttribute("artesMarciais", true);
    barryAllen.addSpecificAttribute("forcaDivina", false);
    barryAllen.addSpecificAttribute("manipulacaoDeEnergia", false);
    barryAllen.addSpecificAttribute("fazerFeitico", false);
    barryAllen.addSpecificAttribute("Maguinetismo", false);

    Features irisWest = new Features("Iris West", "feminino", false, false, "", "heroi",
        "coadjuvante", false, false, "",
        true, true, false,
        false, "humano", false, false,
        false, false, "");

    irisWest.addSpecificAttribute("DCComics", true);
    irisWest.addSpecificAttribute("ligaDaJustica", false);
    irisWest.addSpecificAttribute("metropolis", false);
    irisWest.addSpecificAttribute("gothamCity", false);
    irisWest.addSpecificAttribute("themyscira", false);
    irisWest.addSpecificAttribute("centralCity", true);
    irisWest.addSpecificAttribute("coastCity", false);
    irisWest.addSpecificAttribute("atlantis", false);
    irisWest.addSpecificAttribute("apokolips", false);
    irisWest.addSpecificAttribute("voar", false);
    irisWest.addSpecificAttribute("superForca", false);
    irisWest.addSpecificAttribute("superVelocidade", false);
    irisWest.addSpecificAttribute("visaoDeRaioX", false);
    irisWest.addSpecificAttribute("visaoDeCalor", false);
    irisWest.addSpecificAttribute("superSopro", false);
    irisWest.addSpecificAttribute("traje", false);
    irisWest.addSpecificAttribute("regeneracao", false);
    irisWest.addSpecificAttribute("controleMetal", false);
    irisWest.addSpecificAttribute("capacete", false);
    irisWest.addSpecificAttribute("telepatia", false);
    irisWest.addSpecificAttribute("telecinese", false);
    irisWest.addSpecificAttribute("absorverEnergia", false);
    irisWest.addSpecificAttribute("inteligenciaArtificial", false);
    irisWest.addSpecificAttribute("manipulacaoRealidade", false);
    irisWest.addSpecificAttribute("agilidadeAprimorada", false);
    irisWest.addSpecificAttribute("realeza", false);
    irisWest.addSpecificAttribute("treinamentoEspecial", true);
    irisWest.addSpecificAttribute("superSoldado", false);
    irisWest.addSpecificAttribute("bilionario", false);
    irisWest.addSpecificAttribute("patriota", true);
    irisWest.addSpecificAttribute("combateCorpoACorpo", false);
    irisWest.addSpecificAttribute("artesMarciais", false);
    irisWest.addSpecificAttribute("forcaDivina", false);
    irisWest.addSpecificAttribute("manipulacaoDeEnergia", false);
    irisWest.addSpecificAttribute("fazerFeitico", false);
    irisWest.addSpecificAttribute("Maguinetismo", false);

    Features capitaoFrio = new Features("Capitão Frio", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "humano", false, false,
        false, true, "");

    capitaoFrio.addSpecificAttribute("DCComics", true);
    capitaoFrio.addSpecificAttribute("ligaDaJustica", false);
    capitaoFrio.addSpecificAttribute("metropolis", false);
    capitaoFrio.addSpecificAttribute("gothamCity", false);
    capitaoFrio.addSpecificAttribute("themyscira", false);
    capitaoFrio.addSpecificAttribute("centralCity", true);
    capitaoFrio.addSpecificAttribute("coastCity", false);
    capitaoFrio.addSpecificAttribute("atlantis", false);
    capitaoFrio.addSpecificAttribute("apokolips", false);
    capitaoFrio.addSpecificAttribute("voar", false);
    capitaoFrio.addSpecificAttribute("superForca", false);
    capitaoFrio.addSpecificAttribute("superVelocidade", false);
    capitaoFrio.addSpecificAttribute("visaoDeRaioX", false);
    capitaoFrio.addSpecificAttribute("visaoDeCalor", false);
    capitaoFrio.addSpecificAttribute("superSopro", false);
    capitaoFrio.addSpecificAttribute("traje", true);
    capitaoFrio.addSpecificAttribute("regeneracao", false);
    capitaoFrio.addSpecificAttribute("controleMetal", false);
    capitaoFrio.addSpecificAttribute("capacete", true);
    capitaoFrio.addSpecificAttribute("telepatia", false);
    capitaoFrio.addSpecificAttribute("telecinese", false);
    capitaoFrio.addSpecificAttribute("absorverEnergia", false);
    capitaoFrio.addSpecificAttribute("inteligenciaArtificial", false);
    capitaoFrio.addSpecificAttribute("manipulacaoRealidade", false);
    capitaoFrio.addSpecificAttribute("agilidadeAprimorada", false);
    capitaoFrio.addSpecificAttribute("realeza", false);
    capitaoFrio.addSpecificAttribute("treinamentoEspecial", true);
    capitaoFrio.addSpecificAttribute("superSoldado", false);
    capitaoFrio.addSpecificAttribute("bilionario", false);
    capitaoFrio.addSpecificAttribute("patriota", false);
    capitaoFrio.addSpecificAttribute("combateCorpoACorpo", true);
    capitaoFrio.addSpecificAttribute("artesMarciais", true);
    capitaoFrio.addSpecificAttribute("forcaDivina", false);
    capitaoFrio.addSpecificAttribute("manipulacaoDeEnergia", true);
    capitaoFrio.addSpecificAttribute("fazerFeitico", false);
    capitaoFrio.addSpecificAttribute("Maguinetismo", false);

    Features kidFlash = new Features("Kid Flash (Wally West)", "masculino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "metahumano", false, false,
        false, true, "");

    kidFlash.addSpecificAttribute("DCComics", true);
    kidFlash.addSpecificAttribute("ligaDaJustica", false);
    kidFlash.addSpecificAttribute("metropolis", false);
    kidFlash.addSpecificAttribute("gothamCity", false);
    kidFlash.addSpecificAttribute("themyscira", false);
    kidFlash.addSpecificAttribute("centralCity", true);
    kidFlash.addSpecificAttribute("coastCity", false);
    kidFlash.addSpecificAttribute("atlantis", false);
    kidFlash.addSpecificAttribute("apokolips", false);
    kidFlash.addSpecificAttribute("voar", false);
    kidFlash.addSpecificAttribute("superForca", false);
    kidFlash.addSpecificAttribute("superVelocidade", true);
    kidFlash.addSpecificAttribute("visaoDeRaioX", false);
    kidFlash.addSpecificAttribute("visaoDeCalor", false);
    kidFlash.addSpecificAttribute("superSopro", false);
    kidFlash.addSpecificAttribute("traje", true);
    kidFlash.addSpecificAttribute("regeneracao", true);
    kidFlash.addSpecificAttribute("controleMetal", false);
    kidFlash.addSpecificAttribute("capacete", false);
    kidFlash.addSpecificAttribute("telepatia", false);
    kidFlash.addSpecificAttribute("telecinese", false);
    kidFlash.addSpecificAttribute("absorverEnergia", false);
    kidFlash.addSpecificAttribute("inteligenciaArtificial", false);
    kidFlash.addSpecificAttribute("manipulacaoRealidade", false);
    kidFlash.addSpecificAttribute("agilidadeAprimorada", true);
    kidFlash.addSpecificAttribute("realeza", false);
    kidFlash.addSpecificAttribute("treinamentoEspecial", true);
    kidFlash.addSpecificAttribute("superSoldado", false);
    kidFlash.addSpecificAttribute("bilionario", false);
    kidFlash.addSpecificAttribute("patriota", true);
    kidFlash.addSpecificAttribute("combateCorpoACorpo", true);
    kidFlash.addSpecificAttribute("artesMarciais", true);
    kidFlash.addSpecificAttribute("forcaDivina", false);
    kidFlash.addSpecificAttribute("manipulacaoDeEnergia", false);
    kidFlash.addSpecificAttribute("fazerFeitico", false);
    kidFlash.addSpecificAttribute("Maguinetismo", false);

    Features drHarrisonWells = new Features("Dr. Harrison Wells", "masculino", false, false, "", "anti-heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "humano", false, false,
        false, false, "");

    drHarrisonWells.addSpecificAttribute("DCComics", true);
    drHarrisonWells.addSpecificAttribute("ligaDaJustica", false);
    drHarrisonWells.addSpecificAttribute("metropolis", false);
    drHarrisonWells.addSpecificAttribute("gothamCity", false);
    drHarrisonWells.addSpecificAttribute("themyscira", false);
    drHarrisonWells.addSpecificAttribute("centralCity", true);
    drHarrisonWells.addSpecificAttribute("coastCity", false);
    drHarrisonWells.addSpecificAttribute("atlantis", false);
    drHarrisonWells.addSpecificAttribute("apokolips", false);
    drHarrisonWells.addSpecificAttribute("voar", false);
    drHarrisonWells.addSpecificAttribute("superForca", false);
    drHarrisonWells.addSpecificAttribute("superVelocidade", false);
    drHarrisonWells.addSpecificAttribute("visaoDeRaioX", false);
    drHarrisonWells.addSpecificAttribute("visaoDeCalor", false);
    drHarrisonWells.addSpecificAttribute("superSopro", false);
    drHarrisonWells.addSpecificAttribute("traje", false);
    drHarrisonWells.addSpecificAttribute("regeneracao", false);
    drHarrisonWells.addSpecificAttribute("controleMetal", false);
    drHarrisonWells.addSpecificAttribute("capacete", false);
    drHarrisonWells.addSpecificAttribute("telepatia", false);
    drHarrisonWells.addSpecificAttribute("telecinese", false);
    drHarrisonWells.addSpecificAttribute("absorverEnergia", false);
    drHarrisonWells.addSpecificAttribute("inteligenciaArtificial", true);
    drHarrisonWells.addSpecificAttribute("manipulacaoRealidade", false);
    drHarrisonWells.addSpecificAttribute("agilidadeAprimorada", false);
    drHarrisonWells.addSpecificAttribute("realeza", false);
    drHarrisonWells.addSpecificAttribute("treinamentoEspecial", true);
    drHarrisonWells.addSpecificAttribute("superSoldado", false);
    drHarrisonWells.addSpecificAttribute("bilionario", true);
    drHarrisonWells.addSpecificAttribute("patriota", false);
    drHarrisonWells.addSpecificAttribute("combateCorpoACorpo", false);
    drHarrisonWells.addSpecificAttribute("artesMarciais", false);
    drHarrisonWells.addSpecificAttribute("forcaDivina", false);
    drHarrisonWells.addSpecificAttribute("manipulacaoDeEnergia", false);
    drHarrisonWells.addSpecificAttribute("fazerFeitico", false);
    drHarrisonWells.addSpecificAttribute("Maguinetismo", false);

    Features ciscoRamon = new Features("Cisco Ramon (Vibe)", "masculino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "metahumano", false, false,
        false, false, "");

    ciscoRamon.addSpecificAttribute("DCComics", true);
    ciscoRamon.addSpecificAttribute("ligaDaJustica", false);
    ciscoRamon.addSpecificAttribute("metropolis", false);
    ciscoRamon.addSpecificAttribute("gothamCity", false);
    ciscoRamon.addSpecificAttribute("themyscira", false);
    ciscoRamon.addSpecificAttribute("centralCity", true);
    ciscoRamon.addSpecificAttribute("coastCity", false);
    ciscoRamon.addSpecificAttribute("atlantis", false);
    ciscoRamon.addSpecificAttribute("apokolips", false);
    ciscoRamon.addSpecificAttribute("voar", false);
    ciscoRamon.addSpecificAttribute("superForca", false);
    ciscoRamon.addSpecificAttribute("superVelocidade", false);
    ciscoRamon.addSpecificAttribute("visaoDeRaioX", false);
    ciscoRamon.addSpecificAttribute("visaoDeCalor", false);
    ciscoRamon.addSpecificAttribute("superSopro", false);
    ciscoRamon.addSpecificAttribute("traje", true);
    ciscoRamon.addSpecificAttribute("regeneracao", false);
    ciscoRamon.addSpecificAttribute("controleMetal", false);
    ciscoRamon.addSpecificAttribute("capacete", false);
    ciscoRamon.addSpecificAttribute("telepatia", false);
    ciscoRamon.addSpecificAttribute("telecinese", true);
    ciscoRamon.addSpecificAttribute("absorverEnergia", false);
    ciscoRamon.addSpecificAttribute("inteligenciaArtificial", true);
    ciscoRamon.addSpecificAttribute("manipulacaoRealidade", false);
    ciscoRamon.addSpecificAttribute("agilidadeAprimorada", false);
    ciscoRamon.addSpecificAttribute("realeza", false);
    ciscoRamon.addSpecificAttribute("treinamentoEspecial", true);
    ciscoRamon.addSpecificAttribute("superSoldado", false);
    ciscoRamon.addSpecificAttribute("bilionario", false);
    ciscoRamon.addSpecificAttribute("patriota", true);
    ciscoRamon.addSpecificAttribute("combateCorpoACorpo", false);
    ciscoRamon.addSpecificAttribute("artesMarciais", false);
    ciscoRamon.addSpecificAttribute("forcaDivina", false);
    ciscoRamon.addSpecificAttribute("manipulacaoDeEnergia", true);
    ciscoRamon.addSpecificAttribute("fazerFeitico", false);
    ciscoRamon.addSpecificAttribute("Maguinetismo", false);

    Features caitlinSnow = new Features("Caitlin Snow (Killer Frost)", "feminino", false, false, "", "anti-heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "metahumano", false, false,
        false, false, "");

    caitlinSnow.addSpecificAttribute("DCComics", true);
    caitlinSnow.addSpecificAttribute("ligaDaJustica", false);
    caitlinSnow.addSpecificAttribute("metropolis", false);
    caitlinSnow.addSpecificAttribute("gothamCity", false);
    caitlinSnow.addSpecificAttribute("themyscira", false);
    caitlinSnow.addSpecificAttribute("centralCity", true);
    caitlinSnow.addSpecificAttribute("coastCity", false);
    caitlinSnow.addSpecificAttribute("atlantis", false);
    caitlinSnow.addSpecificAttribute("apokolips", false);
    caitlinSnow.addSpecificAttribute("voar", false);
    caitlinSnow.addSpecificAttribute("superForca", false);
    caitlinSnow.addSpecificAttribute("superVelocidade", false);
    caitlinSnow.addSpecificAttribute("visaoDeRaioX", false);
    caitlinSnow.addSpecificAttribute("visaoDeCalor", false);
    caitlinSnow.addSpecificAttribute("superSopro", false);
    caitlinSnow.addSpecificAttribute("traje", true);
    caitlinSnow.addSpecificAttribute("regeneracao", true);
    caitlinSnow.addSpecificAttribute("controleMetal", false);
    caitlinSnow.addSpecificAttribute("capacete", false);
    caitlinSnow.addSpecificAttribute("telepatia", false);
    caitlinSnow.addSpecificAttribute("telecinese", false);
    caitlinSnow.addSpecificAttribute("absorverEnergia", false);
    caitlinSnow.addSpecificAttribute("inteligenciaArtificial", false);
    caitlinSnow.addSpecificAttribute("manipulacaoRealidade", false);
    caitlinSnow.addSpecificAttribute("agilidadeAprimorada", false);
    caitlinSnow.addSpecificAttribute("realeza", false);
    caitlinSnow.addSpecificAttribute("treinamentoEspecial", true);
    caitlinSnow.addSpecificAttribute("superSoldado", false);
    caitlinSnow.addSpecificAttribute("bilionario", false);
    caitlinSnow.addSpecificAttribute("patriota", true);
    caitlinSnow.addSpecificAttribute("combateCorpoACorpo", false);
    caitlinSnow.addSpecificAttribute("artesMarciais", false);
    caitlinSnow.addSpecificAttribute("forcaDivina", false);
    caitlinSnow.addSpecificAttribute("manipulacaoDeEnergia", true);
    caitlinSnow.addSpecificAttribute("fazerFeitico", false);
    caitlinSnow.addSpecificAttribute("Maguinetismo", false);

    Features reverseFlash = new Features("Eobard Thawne (Reverse-Flash)", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "metahumano", true, false,
        false, true, "");

    reverseFlash.addSpecificAttribute("DCComics", true);
    reverseFlash.addSpecificAttribute("ligaDaJustica", false);
    reverseFlash.addSpecificAttribute("metropolis", false);
    reverseFlash.addSpecificAttribute("gothamCity", false);
    reverseFlash.addSpecificAttribute("themyscira", false);
    reverseFlash.addSpecificAttribute("centralCity", true);
    reverseFlash.addSpecificAttribute("coastCity", false);
    reverseFlash.addSpecificAttribute("atlantis", false);
    reverseFlash.addSpecificAttribute("apokolips", false);
    reverseFlash.addSpecificAttribute("voar", false);
    reverseFlash.addSpecificAttribute("superForca", false);
    reverseFlash.addSpecificAttribute("superVelocidade", true);
    reverseFlash.addSpecificAttribute("visaoDeRaioX", false);
    reverseFlash.addSpecificAttribute("visaoDeCalor", false);
    reverseFlash.addSpecificAttribute("superSopro", false);
    reverseFlash.addSpecificAttribute("traje", true);
    reverseFlash.addSpecificAttribute("regeneracao", true);
    reverseFlash.addSpecificAttribute("controleMetal", false);
    reverseFlash.addSpecificAttribute("capacete", false);
    reverseFlash.addSpecificAttribute("telepatia", false);
    reverseFlash.addSpecificAttribute("telecinese", false);
    reverseFlash.addSpecificAttribute("absorverEnergia", false);
    reverseFlash.addSpecificAttribute("inteligenciaArtificial", false);
    reverseFlash.addSpecificAttribute("manipulacaoRealidade", false);
    reverseFlash.addSpecificAttribute("agilidadeAprimorada", true);
    reverseFlash.addSpecificAttribute("realeza", false);
    reverseFlash.addSpecificAttribute("treinamentoEspecial", true);
    reverseFlash.addSpecificAttribute("superSoldado", false);
    reverseFlash.addSpecificAttribute("bilionario", false);
    reverseFlash.addSpecificAttribute("patriota", false);
    reverseFlash.addSpecificAttribute("combateCorpoACorpo", true);
    reverseFlash.addSpecificAttribute("artesMarciais", true);
    reverseFlash.addSpecificAttribute("forcaDivina", false);
    reverseFlash.addSpecificAttribute("manipulacaoDeEnergia", true);
    reverseFlash.addSpecificAttribute("fazerFeitico", false);
    reverseFlash.addSpecificAttribute("Maguinetismo", false);

    Features joeWest = new Features("Joe West", "masculino", true, false, "", "heroi",
        "coadjuvante", false, false, "",
        true, true, true,
        false, "humano", false, false,
        false, false, "");

    joeWest.addSpecificAttribute("DCComics", true);
    joeWest.addSpecificAttribute("ligaDaJustica", false);
    joeWest.addSpecificAttribute("metropolis", false);
    joeWest.addSpecificAttribute("gothamCity", false);
    joeWest.addSpecificAttribute("themyscira", false);
    joeWest.addSpecificAttribute("centralCity", true);
    joeWest.addSpecificAttribute("coastCity", false);
    joeWest.addSpecificAttribute("atlantis", false);
    joeWest.addSpecificAttribute("apokolips", false);
    joeWest.addSpecificAttribute("voar", false);
    joeWest.addSpecificAttribute("superForca", false);
    joeWest.addSpecificAttribute("superVelocidade", false);
    joeWest.addSpecificAttribute("visaoDeRaioX", false);
    joeWest.addSpecificAttribute("visaoDeCalor", false);
    joeWest.addSpecificAttribute("superSopro", false);
    joeWest.addSpecificAttribute("traje", false);
    joeWest.addSpecificAttribute("regeneracao", false);
    joeWest.addSpecificAttribute("controleMetal", false);
    joeWest.addSpecificAttribute("capacete", false);
    joeWest.addSpecificAttribute("telepatia", false);
    joeWest.addSpecificAttribute("telecinese", false);
    joeWest.addSpecificAttribute("absorverEnergia", false);
    joeWest.addSpecificAttribute("inteligenciaArtificial", false);
    joeWest.addSpecificAttribute("manipulacaoRealidade", false);
    joeWest.addSpecificAttribute("agilidadeAprimorada", false);
    joeWest.addSpecificAttribute("realeza", false);
    joeWest.addSpecificAttribute("treinamentoEspecial", true);
    joeWest.addSpecificAttribute("superSoldado", false);
    joeWest.addSpecificAttribute("bilionario", false);
    joeWest.addSpecificAttribute("patriota", true);
    joeWest.addSpecificAttribute("combateCorpoACorpo", true);
    joeWest.addSpecificAttribute("artesMarciais", true);
    joeWest.addSpecificAttribute("forcaDivina", false);
    joeWest.addSpecificAttribute("manipulacaoDeEnergia", false);
    joeWest.addSpecificAttribute("fazerFeitico", false);
    joeWest.addSpecificAttribute("Maguinetismo", false);

    Features zoom = new Features("Hunter Zolomon (Zoom)", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "metahumano", true, false,
        false, true, "");

    zoom.addSpecificAttribute("DCComics", true);
    zoom.addSpecificAttribute("ligaDaJustica", false);
    zoom.addSpecificAttribute("metropolis", false);
    zoom.addSpecificAttribute("gothamCity", false);
    zoom.addSpecificAttribute("themyscira", false);
    zoom.addSpecificAttribute("centralCity", true);
    zoom.addSpecificAttribute("coastCity", false);
    zoom.addSpecificAttribute("atlantis", false);
    zoom.addSpecificAttribute("apokolips", false);
    zoom.addSpecificAttribute("voar", false);
    zoom.addSpecificAttribute("superForca", false);
    zoom.addSpecificAttribute("superVelocidade", true);
    zoom.addSpecificAttribute("visaoDeRaioX", false);
    zoom.addSpecificAttribute("visaoDeCalor", false);
    zoom.addSpecificAttribute("superSopro", false);
    zoom.addSpecificAttribute("traje", true);
    zoom.addSpecificAttribute("regeneracao", true);
    zoom.addSpecificAttribute("controleMetal", false);
    zoom.addSpecificAttribute("capacete", false);
    zoom.addSpecificAttribute("telepatia", false);
    zoom.addSpecificAttribute("telecinese", false);
    zoom.addSpecificAttribute("absorverEnergia", false);
    zoom.addSpecificAttribute("inteligenciaArtificial", false);
    zoom.addSpecificAttribute("manipulacaoRealidade", false);
    zoom.addSpecificAttribute("agilidadeAprimorada", true);
    zoom.addSpecificAttribute("realeza", false);
    zoom.addSpecificAttribute("treinamentoEspecial", true);
    zoom.addSpecificAttribute("superSoldado", false);
    zoom.addSpecificAttribute("bilionario", false);
    zoom.addSpecificAttribute("patriota", false);
    zoom.addSpecificAttribute("combateCorpoACorpo", true);
    zoom.addSpecificAttribute("artesMarciais", true);
    zoom.addSpecificAttribute("forcaDivina", false);
    zoom.addSpecificAttribute("manipulacaoDeEnergia", true);
    zoom.addSpecificAttribute("fazerFeitico", false);
    zoom.addSpecificAttribute("Maguinetismo", false);

    Features jessieQuick = new Features("Jesse Quick", "feminino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "metahumano", false, false,
        false, true, "");

    jessieQuick.addSpecificAttribute("DCComics", true);
    jessieQuick.addSpecificAttribute("ligaDaJustica", false);
    jessieQuick.addSpecificAttribute("metropolis", false);
    jessieQuick.addSpecificAttribute("gothamCity", false);
    jessieQuick.addSpecificAttribute("themyscira", false);
    jessieQuick.addSpecificAttribute("centralCity", true);
    jessieQuick.addSpecificAttribute("coastCity", false);
    jessieQuick.addSpecificAttribute("atlantis", false);
    jessieQuick.addSpecificAttribute("apokolips", false);
    jessieQuick.addSpecificAttribute("voar", false);
    jessieQuick.addSpecificAttribute("superForca", false);
    jessieQuick.addSpecificAttribute("superVelocidade", true);
    jessieQuick.addSpecificAttribute("visaoDeRaioX", false);
    jessieQuick.addSpecificAttribute("visaoDeCalor", false);
    jessieQuick.addSpecificAttribute("superSopro", false);
    jessieQuick.addSpecificAttribute("traje", true);
    jessieQuick.addSpecificAttribute("regeneracao", true);
    jessieQuick.addSpecificAttribute("controleMetal", false);
    jessieQuick.addSpecificAttribute("capacete", false);
    jessieQuick.addSpecificAttribute("telepatia", false);
    jessieQuick.addSpecificAttribute("telecinese", false);
    jessieQuick.addSpecificAttribute("absorverEnergia", false);
    jessieQuick.addSpecificAttribute("inteligenciaArtificial", false);
    jessieQuick.addSpecificAttribute("manipulacaoRealidade", false);
    jessieQuick.addSpecificAttribute("agilidadeAprimorada", true);
    jessieQuick.addSpecificAttribute("realeza", false);
    jessieQuick.addSpecificAttribute("treinamentoEspecial", true);
    jessieQuick.addSpecificAttribute("superSoldado", false);
    jessieQuick.addSpecificAttribute("bilionario", false);
    jessieQuick.addSpecificAttribute("patriota", true);
    jessieQuick.addSpecificAttribute("combateCorpoACorpo", true);
    jessieQuick.addSpecificAttribute("artesMarciais", true);
    jessieQuick.addSpecificAttribute("forcaDivina", false);
    jessieQuick.addSpecificAttribute("manipulacaoDeEnergia", false);
    jessieQuick.addSpecificAttribute("fazerFeitico", false);
    jessieQuick.addSpecificAttribute("Maguinetismo", false);

    Features gorilla = new Features("Gorilla Grodd", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "metahumano", true, false,
        false, false, "");

    gorilla.addSpecificAttribute("DCComics", true);
    gorilla.addSpecificAttribute("ligaDaJustica", false);
    gorilla.addSpecificAttribute("metropolis", false);
    gorilla.addSpecificAttribute("gothamCity", false);
    gorilla.addSpecificAttribute("themyscira", false);
    gorilla.addSpecificAttribute("centralCity", true);
    gorilla.addSpecificAttribute("coastCity", false);
    gorilla.addSpecificAttribute("atlantis", false);
    gorilla.addSpecificAttribute("apokolips", false);
    gorilla.addSpecificAttribute("voar", false);
    gorilla.addSpecificAttribute("superForca", true);
    gorilla.addSpecificAttribute("superVelocidade", false);
    gorilla.addSpecificAttribute("visaoDeRaioX", false);
    gorilla.addSpecificAttribute("visaoDeCalor", false);
    gorilla.addSpecificAttribute("superSopro", false);
    gorilla.addSpecificAttribute("traje", false);
    gorilla.addSpecificAttribute("regeneracao", true);
    gorilla.addSpecificAttribute("controleMetal", false);
    gorilla.addSpecificAttribute("capacete", false);
    gorilla.addSpecificAttribute("telepatia", true);
    gorilla.addSpecificAttribute("telecinese", true);
    gorilla.addSpecificAttribute("absorverEnergia", false);
    gorilla.addSpecificAttribute("inteligenciaArtificial", false);
    gorilla.addSpecificAttribute("manipulacaoRealidade", false);
    gorilla.addSpecificAttribute("agilidadeAprimorada", true);
    gorilla.addSpecificAttribute("realeza", false);
    gorilla.addSpecificAttribute("treinamentoEspecial", true);
    gorilla.addSpecificAttribute("superSoldado", false);
    gorilla.addSpecificAttribute("bilionario", false);
    gorilla.addSpecificAttribute("patriota", false);
    gorilla.addSpecificAttribute("combateCorpoACorpo", true);
    gorilla.addSpecificAttribute("artesMarciais", false);
    gorilla.addSpecificAttribute("forcaDivina", false);
    gorilla.addSpecificAttribute("manipulacaoDeEnergia", false);
    gorilla.addSpecificAttribute("fazerFeitico", false);
    gorilla.addSpecificAttribute("Maguinetismo", false);

    Features mirrorMaster = new Features("Sam Scudder (Mirror Master)", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "metahumano", false, false,
        false, true, "");

    mirrorMaster.addSpecificAttribute("DCComics", true);
    mirrorMaster.addSpecificAttribute("ligaDaJustica", false);
    mirrorMaster.addSpecificAttribute("metropolis", false);
    mirrorMaster.addSpecificAttribute("gothamCity", false);
    mirrorMaster.addSpecificAttribute("themyscira", false);
    mirrorMaster.addSpecificAttribute("centralCity", true);
    mirrorMaster.addSpecificAttribute("coastCity", false);
    mirrorMaster.addSpecificAttribute("atlantis", false);
    mirrorMaster.addSpecificAttribute("apokolips", false);
    mirrorMaster.addSpecificAttribute("voar", false);
    mirrorMaster.addSpecificAttribute("superForca", false);
    mirrorMaster.addSpecificAttribute("superVelocidade", false);
    mirrorMaster.addSpecificAttribute("visaoDeRaioX", false);
    mirrorMaster.addSpecificAttribute("visaoDeCalor", false);
    mirrorMaster.addSpecificAttribute("superSopro", false);
    mirrorMaster.addSpecificAttribute("traje", true);
    mirrorMaster.addSpecificAttribute("regeneracao", false);
    mirrorMaster.addSpecificAttribute("controleMetal", false);
    mirrorMaster.addSpecificAttribute("capacete", false);
    mirrorMaster.addSpecificAttribute("telepatia", false);
    mirrorMaster.addSpecificAttribute("telecinese", false);
    mirrorMaster.addSpecificAttribute("absorverEnergia", false);
    mirrorMaster.addSpecificAttribute("inteligenciaArtificial", false);
    mirrorMaster.addSpecificAttribute("manipulacaoRealidade", true);
    mirrorMaster.addSpecificAttribute("agilidadeAprimorada", false);
    mirrorMaster.addSpecificAttribute("realeza", false);
    mirrorMaster.addSpecificAttribute("treinamentoEspecial", true);
    mirrorMaster.addSpecificAttribute("superSoldado", false);
    mirrorMaster.addSpecificAttribute("bilionario", false);
    mirrorMaster.addSpecificAttribute("patriota", false);
    mirrorMaster.addSpecificAttribute("combateCorpoACorpo", true);
    mirrorMaster.addSpecificAttribute("artesMarciais", false);
    mirrorMaster.addSpecificAttribute("forcaDivina", false);
    mirrorMaster.addSpecificAttribute("manipulacaoDeEnergia", true);
    mirrorMaster.addSpecificAttribute("fazerFeitico", false);
    mirrorMaster.addSpecificAttribute("Maguinetismo", false);

    Features heatWave = new Features("Mick Rory (Heat Wave)", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, false,
        true, "humano", true, true,
        false, true, "");

    heatWave.addSpecificAttribute("DCComics", true);
    heatWave.addSpecificAttribute("ligaDaJustica", false);
    heatWave.addSpecificAttribute("metropolis", false);
    heatWave.addSpecificAttribute("gothamCity", false);
    heatWave.addSpecificAttribute("themyscira", false);
    heatWave.addSpecificAttribute("centralCity", true);
    heatWave.addSpecificAttribute("coastCity", false);
    heatWave.addSpecificAttribute("atlantis", false);
    heatWave.addSpecificAttribute("apokolips", false);
    heatWave.addSpecificAttribute("voar", false);
    heatWave.addSpecificAttribute("superForca", false);
    heatWave.addSpecificAttribute("superVelocidade", false);
    heatWave.addSpecificAttribute("visaoDeRaioX", false);
    heatWave.addSpecificAttribute("visaoDeCalor", false);
    heatWave.addSpecificAttribute("superSopro", false);
    heatWave.addSpecificAttribute("traje", true);
    heatWave.addSpecificAttribute("regeneracao", false);
    heatWave.addSpecificAttribute("controleMetal", false);
    heatWave.addSpecificAttribute("capacete", true);
    heatWave.addSpecificAttribute("telepatia", false);
    heatWave.addSpecificAttribute("telecinese", false);
    heatWave.addSpecificAttribute("absorverEnergia", false);
    heatWave.addSpecificAttribute("inteligenciaArtificial", false);
    heatWave.addSpecificAttribute("manipulacaoRealidade", false);
    heatWave.addSpecificAttribute("agilidadeAprimorada", false);
    heatWave.addSpecificAttribute("realeza", false);
    heatWave.addSpecificAttribute("treinamentoEspecial", true);
    heatWave.addSpecificAttribute("superSoldado", false);
    heatWave.addSpecificAttribute("bilionario", false);
    heatWave.addSpecificAttribute("patriota", false);
    heatWave.addSpecificAttribute("combateCorpoACorpo", true);
    heatWave.addSpecificAttribute("artesMarciais", false);
    heatWave.addSpecificAttribute("forcaDivina", false);
    heatWave.addSpecificAttribute("manipulacaoDeEnergia", true);
    heatWave.addSpecificAttribute("fazerFeitico", false);
    heatWave.addSpecificAttribute("Maguinetismo", false);

    Features trickster = new Features("James Jesse (Trickster)", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "humano", true, false,
        false, false, "");

    trickster.addSpecificAttribute("DCComics", true);
    trickster.addSpecificAttribute("ligaDaJustica", false);
    trickster.addSpecificAttribute("metropolis", false);
    trickster.addSpecificAttribute("gothamCity", false);
    trickster.addSpecificAttribute("themyscira", false);
    trickster.addSpecificAttribute("centralCity", true);
    trickster.addSpecificAttribute("coastCity", false);
    trickster.addSpecificAttribute("atlantis", false);
    trickster.addSpecificAttribute("apokolips", false);
    trickster.addSpecificAttribute("voar", false);
    trickster.addSpecificAttribute("superForca", false);
    trickster.addSpecificAttribute("superVelocidade", false);
    trickster.addSpecificAttribute("visaoDeRaioX", false);
    trickster.addSpecificAttribute("visaoDeCalor", false);
    trickster.addSpecificAttribute("superSopro", false);
    trickster.addSpecificAttribute("traje", true);
    trickster.addSpecificAttribute("regeneracao", false);
    trickster.addSpecificAttribute("controleMetal", false);
    trickster.addSpecificAttribute("capacete", false);
    trickster.addSpecificAttribute("telepatia", false);
    trickster.addSpecificAttribute("telecinese", false);
    trickster.addSpecificAttribute("absorverEnergia", false);
    trickster.addSpecificAttribute("inteligenciaArtificial", false);
    trickster.addSpecificAttribute("manipulacaoRealidade", false);
    trickster.addSpecificAttribute("agilidadeAprimorada", true);
    trickster.addSpecificAttribute("realeza", false);
    trickster.addSpecificAttribute("treinamentoEspecial", true);
    trickster.addSpecificAttribute("superSoldado", false);
    trickster.addSpecificAttribute("bilionario", false);
    trickster.addSpecificAttribute("patriota", false);
    trickster.addSpecificAttribute("combateCorpoACorpo", true);
    trickster.addSpecificAttribute("artesMarciais", false);
    trickster.addSpecificAttribute("forcaDivina", false);
    trickster.addSpecificAttribute("manipulacaoDeEnergia", false);
    trickster.addSpecificAttribute("fazerFeitico", false);
    trickster.addSpecificAttribute("Maguinetismo", false);

    Features halJordan = new Features("Hal Jordan (Lanterna Verde)", "masculino", false, false, "", "heroi",
        "protagonista", false, true, "",
        true, true, true,
        false, "humano", false, false,
        false, true, "");

    halJordan.addSpecificAttribute("DCComics", true);
    halJordan.addSpecificAttribute("ligaDaJustica", true);
    halJordan.addSpecificAttribute("metropolis", false);
    halJordan.addSpecificAttribute("gothamCity", false);
    halJordan.addSpecificAttribute("themyscira", false);
    halJordan.addSpecificAttribute("centralCity", false);
    halJordan.addSpecificAttribute("coastCity", true);
    halJordan.addSpecificAttribute("atlantis", false);
    halJordan.addSpecificAttribute("apokolips", false);
    halJordan.addSpecificAttribute("voar", true);
    halJordan.addSpecificAttribute("superForca", false);
    halJordan.addSpecificAttribute("superVelocidade", false);
    halJordan.addSpecificAttribute("visaoDeRaioX", false);
    halJordan.addSpecificAttribute("visaoDeCalor", false);
    halJordan.addSpecificAttribute("superSopro", false);
    halJordan.addSpecificAttribute("traje", true);
    halJordan.addSpecificAttribute("regeneracao", false);
    halJordan.addSpecificAttribute("controleMetal", false);
    halJordan.addSpecificAttribute("capacete", false);
    halJordan.addSpecificAttribute("telepatia", false);
    halJordan.addSpecificAttribute("telecinese", false);
    halJordan.addSpecificAttribute("absorverEnergia", false);
    halJordan.addSpecificAttribute("inteligenciaArtificial", false);
    halJordan.addSpecificAttribute("manipulacaoRealidade", false);
    halJordan.addSpecificAttribute("agilidadeAprimorada", true);
    halJordan.addSpecificAttribute("realeza", false);
    halJordan.addSpecificAttribute("treinamentoEspecial", true);
    halJordan.addSpecificAttribute("superSoldado", false);
    halJordan.addSpecificAttribute("bilionario", false);
    halJordan.addSpecificAttribute("patriota", true);
    halJordan.addSpecificAttribute("combateCorpoACorpo", true);
    halJordan.addSpecificAttribute("artesMarciais", true);
    halJordan.addSpecificAttribute("forcaDivina", false);
    halJordan.addSpecificAttribute("manipulacaoDeEnergia", true);
    halJordan.addSpecificAttribute("fazerFeitico", false);
    halJordan.addSpecificAttribute("Maguinetismo", false);

    Features carolFerris = new Features("Carol Ferris (Star Sapphire)", "feminino", false, false, "", "anti-heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "humano", false, false,
        false, true, "");

    carolFerris.addSpecificAttribute("DCComics", true);
    carolFerris.addSpecificAttribute("ligaDaJustica", false);
    carolFerris.addSpecificAttribute("metropolis", false);
    carolFerris.addSpecificAttribute("gothamCity", false);
    carolFerris.addSpecificAttribute("themyscira", false);
    carolFerris.addSpecificAttribute("centralCity", false);
    carolFerris.addSpecificAttribute("coastCity", true);
    carolFerris.addSpecificAttribute("atlantis", false);
    carolFerris.addSpecificAttribute("apokolips", false);
    carolFerris.addSpecificAttribute("voar", true);
    carolFerris.addSpecificAttribute("superForca", false);
    carolFerris.addSpecificAttribute("superVelocidade", false);
    carolFerris.addSpecificAttribute("visaoDeRaioX", false);
    carolFerris.addSpecificAttribute("visaoDeCalor", false);
    carolFerris.addSpecificAttribute("superSopro", false);
    carolFerris.addSpecificAttribute("traje", true);
    carolFerris.addSpecificAttribute("regeneracao", false);
    carolFerris.addSpecificAttribute("controleMetal", false);
    carolFerris.addSpecificAttribute("capacete", false);
    carolFerris.addSpecificAttribute("telepatia", false);
    carolFerris.addSpecificAttribute("telecinese", false);
    carolFerris.addSpecificAttribute("absorverEnergia", false);
    carolFerris.addSpecificAttribute("inteligenciaArtificial", false);
    carolFerris.addSpecificAttribute("manipulacaoRealidade", false);
    carolFerris.addSpecificAttribute("agilidadeAprimorada", true);
    carolFerris.addSpecificAttribute("realeza", false);
    carolFerris.addSpecificAttribute("treinamentoEspecial", true);
    carolFerris.addSpecificAttribute("superSoldado", false);
    carolFerris.addSpecificAttribute("bilionario", true);
    carolFerris.addSpecificAttribute("patriota", true);
    carolFerris.addSpecificAttribute("combateCorpoACorpo", true);
    carolFerris.addSpecificAttribute("artesMarciais", true);
    carolFerris.addSpecificAttribute("forcaDivina", false);
    carolFerris.addSpecificAttribute("manipulacaoDeEnergia", true);
    carolFerris.addSpecificAttribute("fazerFeitico", false);
    carolFerris.addSpecificAttribute("Maguinetismo", false);

    Features sinestro = new Features("Thaal Sinestro", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "alienigena", false, false,
        false, true, "");

    sinestro.addSpecificAttribute("DCComics", true);
    sinestro.addSpecificAttribute("ligaDaJustica", false);
    sinestro.addSpecificAttribute("metropolis", false);
    sinestro.addSpecificAttribute("gothamCity", false);
    sinestro.addSpecificAttribute("themyscira", false);
    sinestro.addSpecificAttribute("centralCity", false);
    sinestro.addSpecificAttribute("coastCity", true);
    sinestro.addSpecificAttribute("atlantis", false);
    sinestro.addSpecificAttribute("apokolips", false);
    sinestro.addSpecificAttribute("voar", true);
    sinestro.addSpecificAttribute("superForca", false);
    sinestro.addSpecificAttribute("superVelocidade", false);
    sinestro.addSpecificAttribute("visaoDeRaioX", false);
    sinestro.addSpecificAttribute("visaoDeCalor", false);
    sinestro.addSpecificAttribute("superSopro", false);
    sinestro.addSpecificAttribute("traje", true);
    sinestro.addSpecificAttribute("regeneracao", false);
    sinestro.addSpecificAttribute("controleMetal", false);
    sinestro.addSpecificAttribute("capacete", false);
    sinestro.addSpecificAttribute("telepatia", false);
    sinestro.addSpecificAttribute("telecinese", false);
    sinestro.addSpecificAttribute("absorverEnergia", false);
    sinestro.addSpecificAttribute("inteligenciaArtificial", false);
    sinestro.addSpecificAttribute("manipulacaoRealidade", false);
    sinestro.addSpecificAttribute("agilidadeAprimorada", true);
    sinestro.addSpecificAttribute("realeza", false);
    sinestro.addSpecificAttribute("treinamentoEspecial", true);
    sinestro.addSpecificAttribute("superSoldado", false);
    sinestro.addSpecificAttribute("bilionario", false);
    sinestro.addSpecificAttribute("patriota", false);
    sinestro.addSpecificAttribute("combateCorpoACorpo", true);
    sinestro.addSpecificAttribute("artesMarciais", true);
    sinestro.addSpecificAttribute("forcaDivina", false);
    sinestro.addSpecificAttribute("manipulacaoDeEnergia", true);
    sinestro.addSpecificAttribute("fazerFeitico", false);
    sinestro.addSpecificAttribute("Maguinetismo", false);

    Features tomKalmaku = new Features("Tom Kalmaku", "masculino", false, false, "", "heroi",
        "coadjuvante", false, false, "",
        true, true, false,
        false, "humano", false, false,
        false, false, "");

    tomKalmaku.addSpecificAttribute("DCComics", true);
    tomKalmaku.addSpecificAttribute("ligaDaJustica", false);
    tomKalmaku.addSpecificAttribute("metropolis", false);
    tomKalmaku.addSpecificAttribute("gothamCity", false);
    tomKalmaku.addSpecificAttribute("themyscira", false);
    tomKalmaku.addSpecificAttribute("centralCity", false);
    tomKalmaku.addSpecificAttribute("coastCity", true);
    tomKalmaku.addSpecificAttribute("atlantis", false);
    tomKalmaku.addSpecificAttribute("apokolips", false);
    tomKalmaku.addSpecificAttribute("voar", false);
    tomKalmaku.addSpecificAttribute("superForca", false);
    tomKalmaku.addSpecificAttribute("superVelocidade", false);
    tomKalmaku.addSpecificAttribute("visaoDeRaioX", false);
    tomKalmaku.addSpecificAttribute("visaoDeCalor", false);
    tomKalmaku.addSpecificAttribute("superSopro", false);
    tomKalmaku.addSpecificAttribute("traje", false);
    tomKalmaku.addSpecificAttribute("regeneracao", false);
    tomKalmaku.addSpecificAttribute("controleMetal", false);
    tomKalmaku.addSpecificAttribute("capacete", false);
    tomKalmaku.addSpecificAttribute("telepatia", false);
    tomKalmaku.addSpecificAttribute("telecinese", false);
    tomKalmaku.addSpecificAttribute("absorverEnergia", false);
    tomKalmaku.addSpecificAttribute("inteligenciaArtificial", false);
    tomKalmaku.addSpecificAttribute("manipulacaoRealidade", false);
    tomKalmaku.addSpecificAttribute("agilidadeAprimorada", false);
    tomKalmaku.addSpecificAttribute("realeza", false);
    tomKalmaku.addSpecificAttribute("treinamentoEspecial", true);
    tomKalmaku.addSpecificAttribute("superSoldado", false);
    tomKalmaku.addSpecificAttribute("bilionario", false);
    tomKalmaku.addSpecificAttribute("patriota", true);
    tomKalmaku.addSpecificAttribute("combateCorpoACorpo", false);
    tomKalmaku.addSpecificAttribute("artesMarciais", false);
    tomKalmaku.addSpecificAttribute("forcaDivina", false);
    tomKalmaku.addSpecificAttribute("manipulacaoDeEnergia", false);
    tomKalmaku.addSpecificAttribute("fazerFeitico", false);
    tomKalmaku.addSpecificAttribute("Maguinetismo", false);

    Features atrositusLanternaVermelho = new Features("Atrocitus (Lanterna Vermelho)", "masculino", false, false, "",
        "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "alienigena", true, true,
        false, true, "");

    atrositusLanternaVermelho.addSpecificAttribute("DCComics", true);
    atrositusLanternaVermelho.addSpecificAttribute("ligaDaJustica", false);
    atrositusLanternaVermelho.addSpecificAttribute("metropolis", false);
    atrositusLanternaVermelho.addSpecificAttribute("gothamCity", false);
    atrositusLanternaVermelho.addSpecificAttribute("themyscira", false);
    atrositusLanternaVermelho.addSpecificAttribute("centralCity", false);
    atrositusLanternaVermelho.addSpecificAttribute("coastCity", true);
    atrositusLanternaVermelho.addSpecificAttribute("atlantis", false);
    atrositusLanternaVermelho.addSpecificAttribute("apokolips", false);
    atrositusLanternaVermelho.addSpecificAttribute("voar", true);
    atrositusLanternaVermelho.addSpecificAttribute("superForca", true);
    atrositusLanternaVermelho.addSpecificAttribute("superVelocidade", false);
    atrositusLanternaVermelho.addSpecificAttribute("visaoDeRaioX", false);
    atrositusLanternaVermelho.addSpecificAttribute("visaoDeCalor", false);
    atrositusLanternaVermelho.addSpecificAttribute("superSopro", false);
    atrositusLanternaVermelho.addSpecificAttribute("traje", true);
    atrositusLanternaVermelho.addSpecificAttribute("regeneracao", true);
    atrositusLanternaVermelho.addSpecificAttribute("controleMetal", false);
    atrositusLanternaVermelho.addSpecificAttribute("capacete", false);
    atrositusLanternaVermelho.addSpecificAttribute("telepatia", false);
    atrositusLanternaVermelho.addSpecificAttribute("telecinese", false);
    atrositusLanternaVermelho.addSpecificAttribute("absorverEnergia", true);
    atrositusLanternaVermelho.addSpecificAttribute("inteligenciaArtificial", false);
    atrositusLanternaVermelho.addSpecificAttribute("manipulacaoRealidade", false);
    atrositusLanternaVermelho.addSpecificAttribute("agilidadeAprimorada", true);
    atrositusLanternaVermelho.addSpecificAttribute("realeza", false);
    atrositusLanternaVermelho.addSpecificAttribute("treinamentoEspecial", true);
    atrositusLanternaVermelho.addSpecificAttribute("superSoldado", false);
    atrositusLanternaVermelho.addSpecificAttribute("bilionario", false);
    atrositusLanternaVermelho.addSpecificAttribute("patriota", false);
    atrositusLanternaVermelho.addSpecificAttribute("combateCorpoACorpo", true);
    atrositusLanternaVermelho.addSpecificAttribute("artesMarciais", true);
    atrositusLanternaVermelho.addSpecificAttribute("forcaDivina", false);
    atrositusLanternaVermelho.addSpecificAttribute("manipulacaoDeEnergia", true);
    atrositusLanternaVermelho.addSpecificAttribute("fazerFeitico", false);
    atrositusLanternaVermelho.addSpecificAttribute("Maguinetismo", false);

    Features johnStewart = new Features("John Stewart (Lanterna Verde)", "masculino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "humano", false, false,
        false, true, "");

    johnStewart.addSpecificAttribute("DCComics", true);
    johnStewart.addSpecificAttribute("ligaDaJustica", true);
    johnStewart.addSpecificAttribute("metropolis", false);
    johnStewart.addSpecificAttribute("gothamCity", false);
    johnStewart.addSpecificAttribute("themyscira", false);
    johnStewart.addSpecificAttribute("centralCity", false);
    johnStewart.addSpecificAttribute("coastCity", true);
    johnStewart.addSpecificAttribute("atlantis", false);
    johnStewart.addSpecificAttribute("apokolips", false);
    johnStewart.addSpecificAttribute("voar", true);
    johnStewart.addSpecificAttribute("superForca", false);
    johnStewart.addSpecificAttribute("superVelocidade", false);
    johnStewart.addSpecificAttribute("visaoDeRaioX", false);
    johnStewart.addSpecificAttribute("visaoDeCalor", false);
    johnStewart.addSpecificAttribute("superSopro", false);
    johnStewart.addSpecificAttribute("traje", true);
    johnStewart.addSpecificAttribute("regeneracao", false);
    johnStewart.addSpecificAttribute("controleMetal", false);
    johnStewart.addSpecificAttribute("capacete", false);
    johnStewart.addSpecificAttribute("telepatia", false);
    johnStewart.addSpecificAttribute("telecinese", false);
    johnStewart.addSpecificAttribute("absorverEnergia", false);
    johnStewart.addSpecificAttribute("inteligenciaArtificial", false);
    johnStewart.addSpecificAttribute("manipulacaoRealidade", false);
    johnStewart.addSpecificAttribute("agilidadeAprimorada", true);
    johnStewart.addSpecificAttribute("realeza", false);
    johnStewart.addSpecificAttribute("treinamentoEspecial", true);
    johnStewart.addSpecificAttribute("superSoldado", false);
    johnStewart.addSpecificAttribute("bilionario", false);
    johnStewart.addSpecificAttribute("patriota", true);
    johnStewart.addSpecificAttribute("combateCorpoACorpo", true);
    johnStewart.addSpecificAttribute("artesMarciais", true);
    johnStewart.addSpecificAttribute("forcaDivina", false);
    johnStewart.addSpecificAttribute("manipulacaoDeEnergia", true);
    johnStewart.addSpecificAttribute("fazerFeitico", false);
    johnStewart.addSpecificAttribute("Maguinetismo", false);

    Features kilowog = new Features("Kilowog", "masculino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "alienigena", false, false,
        false, true, "");

    kilowog.addSpecificAttribute("DCComics", true);
    kilowog.addSpecificAttribute("ligaDaJustica", false);
    kilowog.addSpecificAttribute("metropolis", false);
    kilowog.addSpecificAttribute("gothamCity", false);
    kilowog.addSpecificAttribute("themyscira", false);
    kilowog.addSpecificAttribute("centralCity", false);
    kilowog.addSpecificAttribute("coastCity", true);
    kilowog.addSpecificAttribute("atlantis", false);
    kilowog.addSpecificAttribute("apokolips", false);
    kilowog.addSpecificAttribute("voar", true);
    kilowog.addSpecificAttribute("superForca", true);
    kilowog.addSpecificAttribute("superVelocidade", false);
    kilowog.addSpecificAttribute("visaoDeRaioX", false);
    kilowog.addSpecificAttribute("visaoDeCalor", false);
    kilowog.addSpecificAttribute("superSopro", false);
    kilowog.addSpecificAttribute("traje", true);
    kilowog.addSpecificAttribute("regeneracao", false);
    kilowog.addSpecificAttribute("controleMetal", false);
    kilowog.addSpecificAttribute("capacete", false);
    kilowog.addSpecificAttribute("telepatia", false);
    kilowog.addSpecificAttribute("telecinese", false);
    kilowog.addSpecificAttribute("absorverEnergia", false);
    kilowog.addSpecificAttribute("inteligenciaArtificial", false);
    kilowog.addSpecificAttribute("manipulacaoRealidade", false);
    kilowog.addSpecificAttribute("agilidadeAprimorada", true);
    kilowog.addSpecificAttribute("realeza", false);
    kilowog.addSpecificAttribute("treinamentoEspecial", true);
    kilowog.addSpecificAttribute("superSoldado", false);
    kilowog.addSpecificAttribute("bilionario", false);
    kilowog.addSpecificAttribute("patriota", true);
    kilowog.addSpecificAttribute("combateCorpoACorpo", true);
    kilowog.addSpecificAttribute("artesMarciais", true);
    kilowog.addSpecificAttribute("forcaDivina", false);
    kilowog.addSpecificAttribute("manipulacaoDeEnergia", true);
    kilowog.addSpecificAttribute("fazerFeitico", false);
    kilowog.addSpecificAttribute("Maguinetismo", false);

    Features guyGardner = new Features("Guy Gardner", "masculino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "humano", true, false,
        false, true, "");

    guyGardner.addSpecificAttribute("DCComics", true);
    guyGardner.addSpecificAttribute("ligaDaJustica", true);
    guyGardner.addSpecificAttribute("metropolis", false);
    guyGardner.addSpecificAttribute("gothamCity", false);
    guyGardner.addSpecificAttribute("themyscira", false);
    guyGardner.addSpecificAttribute("centralCity", false);
    guyGardner.addSpecificAttribute("coastCity", true);
    guyGardner.addSpecificAttribute("atlantis", false);
    guyGardner.addSpecificAttribute("apokolips", false);
    guyGardner.addSpecificAttribute("voar", true);
    guyGardner.addSpecificAttribute("superForca", false);
    guyGardner.addSpecificAttribute("superVelocidade", false);
    guyGardner.addSpecificAttribute("visaoDeRaioX", false);
    guyGardner.addSpecificAttribute("visaoDeCalor", false);
    guyGardner.addSpecificAttribute("superSopro", false);
    guyGardner.addSpecificAttribute("traje", true);
    guyGardner.addSpecificAttribute("regeneracao", false);
    guyGardner.addSpecificAttribute("controleMetal", false);
    guyGardner.addSpecificAttribute("capacete", false);
    guyGardner.addSpecificAttribute("telepatia", false);
    guyGardner.addSpecificAttribute("telecinese", false);
    guyGardner.addSpecificAttribute("absorverEnergia", false);
    guyGardner.addSpecificAttribute("inteligenciaArtificial", false);
    guyGardner.addSpecificAttribute("manipulacaoRealidade", false);
    guyGardner.addSpecificAttribute("agilidadeAprimorada", true);
    guyGardner.addSpecificAttribute("realeza", false);
    guyGardner.addSpecificAttribute("treinamentoEspecial", true);
    guyGardner.addSpecificAttribute("superSoldado", false);
    guyGardner.addSpecificAttribute("bilionario", false);
    guyGardner.addSpecificAttribute("patriota", true);
    guyGardner.addSpecificAttribute("combateCorpoACorpo", true);
    guyGardner.addSpecificAttribute("artesMarciais", true);
    guyGardner.addSpecificAttribute("forcaDivina", false);
    guyGardner.addSpecificAttribute("manipulacaoDeEnergia", true);
    guyGardner.addSpecificAttribute("fazerFeitico", false);
    guyGardner.addSpecificAttribute("Maguinetismo", false);

    Features saintWalker = new Features("Saint Walker (Lanterna Azul)", "masculino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "alienigena", false, false,
        false, true, "");

    saintWalker.addSpecificAttribute("DCComics", true);
    saintWalker.addSpecificAttribute("ligaDaJustica", false);
    saintWalker.addSpecificAttribute("metropolis", false);
    saintWalker.addSpecificAttribute("gothamCity", false);
    saintWalker.addSpecificAttribute("themyscira", false);
    saintWalker.addSpecificAttribute("centralCity", false);
    saintWalker.addSpecificAttribute("coastCity", true);
    saintWalker.addSpecificAttribute("atlantis", false);
    saintWalker.addSpecificAttribute("apokolips", false);
    saintWalker.addSpecificAttribute("voar", true);
    saintWalker.addSpecificAttribute("superForca", false);
    saintWalker.addSpecificAttribute("superVelocidade", false);
    saintWalker.addSpecificAttribute("visaoDeRaioX", false);
    saintWalker.addSpecificAttribute("visaoDeCalor", false);
    saintWalker.addSpecificAttribute("superSopro", false);
    saintWalker.addSpecificAttribute("traje", true);
    saintWalker.addSpecificAttribute("regeneracao", false);
    saintWalker.addSpecificAttribute("controleMetal", false);
    saintWalker.addSpecificAttribute("capacete", false);
    saintWalker.addSpecificAttribute("telepatia", false);
    saintWalker.addSpecificAttribute("telecinese", false);
    saintWalker.addSpecificAttribute("absorverEnergia", false);
    saintWalker.addSpecificAttribute("inteligenciaArtificial", false);
    saintWalker.addSpecificAttribute("manipulacaoRealidade", false);
    saintWalker.addSpecificAttribute("agilidadeAprimorada", true);
    saintWalker.addSpecificAttribute("realeza", false);
    saintWalker.addSpecificAttribute("treinamentoEspecial", true);
    saintWalker.addSpecificAttribute("superSoldado", false);
    saintWalker.addSpecificAttribute("bilionario", false);
    saintWalker.addSpecificAttribute("patriota", true);
    saintWalker.addSpecificAttribute("combateCorpoACorpo", true);
    saintWalker.addSpecificAttribute("artesMarciais", true);
    saintWalker.addSpecificAttribute("forcaDivina", false);
    saintWalker.addSpecificAttribute("manipulacaoDeEnergia", true);
    saintWalker.addSpecificAttribute("fazerFeitico", false);
    saintWalker.addSpecificAttribute("Maguinetismo", false);

    Features larfleeze = new Features("Larfleeze (Agente Laranja)", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "alienigena", true, false,
        false, true, "");

    larfleeze.addSpecificAttribute("DCComics", true);
    larfleeze.addSpecificAttribute("ligaDaJustica", false);
    larfleeze.addSpecificAttribute("metropolis", false);
    larfleeze.addSpecificAttribute("gothamCity", false);
    larfleeze.addSpecificAttribute("themyscira", false);
    larfleeze.addSpecificAttribute("centralCity", false);
    larfleeze.addSpecificAttribute("coastCity", true);
    larfleeze.addSpecificAttribute("atlantis", false);
    larfleeze.addSpecificAttribute("apokolips", false);
    larfleeze.addSpecificAttribute("voar", true);
    larfleeze.addSpecificAttribute("superForca", true);
    larfleeze.addSpecificAttribute("superVelocidade", false);
    larfleeze.addSpecificAttribute("visaoDeRaioX", false);
    larfleeze.addSpecificAttribute("visaoDeCalor", false);
    larfleeze.addSpecificAttribute("superSopro", false);
    larfleeze.addSpecificAttribute("traje", true);
    larfleeze.addSpecificAttribute("regeneracao", true);
    larfleeze.addSpecificAttribute("controleMetal", false);
    larfleeze.addSpecificAttribute("capacete", false);
    larfleeze.addSpecificAttribute("telepatia", false);
    larfleeze.addSpecificAttribute("telecinese", false);
    larfleeze.addSpecificAttribute("absorverEnergia", true);
    larfleeze.addSpecificAttribute("inteligenciaArtificial", false);
    larfleeze.addSpecificAttribute("manipulacaoRealidade", false);
    larfleeze.addSpecificAttribute("agilidadeAprimorada", true);
    larfleeze.addSpecificAttribute("realeza", false);
    larfleeze.addSpecificAttribute("treinamentoEspecial", true);
    larfleeze.addSpecificAttribute("superSoldado", false);
    larfleeze.addSpecificAttribute("bilionario", false);
    larfleeze.addSpecificAttribute("patriota", false);
    larfleeze.addSpecificAttribute("combateCorpoACorpo", true);
    larfleeze.addSpecificAttribute("artesMarciais", true);
    larfleeze.addSpecificAttribute("forcaDivina", false);
    larfleeze.addSpecificAttribute("manipulacaoDeEnergia", true);
    larfleeze.addSpecificAttribute("fazerFeitico", false);
    larfleeze.addSpecificAttribute("Maguinetismo", false);

    Features kyleRayner = new Features("Kyle Rayner (Lanterna Verde)", "masculino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "humano", false, false,
        false, true, "");

    kyleRayner.addSpecificAttribute("DCComics", true);
    kyleRayner.addSpecificAttribute("ligaDaJustica", true);
    kyleRayner.addSpecificAttribute("metropolis", false);
    kyleRayner.addSpecificAttribute("gothamCity", false);
    kyleRayner.addSpecificAttribute("themyscira", false);
    kyleRayner.addSpecificAttribute("centralCity", false);
    kyleRayner.addSpecificAttribute("coastCity", true);
    kyleRayner.addSpecificAttribute("atlantis", false);
    kyleRayner.addSpecificAttribute("apokolips", false);
    kyleRayner.addSpecificAttribute("voar", true);
    kyleRayner.addSpecificAttribute("superForca", false);
    kyleRayner.addSpecificAttribute("superVelocidade", false);
    kyleRayner.addSpecificAttribute("visaoDeRaioX", false);
    kyleRayner.addSpecificAttribute("visaoDeCalor", false);
    kyleRayner.addSpecificAttribute("superSopro", false);
    kyleRayner.addSpecificAttribute("traje", true);
    kyleRayner.addSpecificAttribute("regeneracao", false);
    kyleRayner.addSpecificAttribute("controleMetal", false);
    kyleRayner.addSpecificAttribute("capacete", false);
    kyleRayner.addSpecificAttribute("telepatia", false);
    kyleRayner.addSpecificAttribute("telecinese", false);
    kyleRayner.addSpecificAttribute("absorverEnergia", false);
    kyleRayner.addSpecificAttribute("inteligenciaArtificial", false);
    kyleRayner.addSpecificAttribute("manipulacaoRealidade", false);
    kyleRayner.addSpecificAttribute("agilidadeAprimorada", true);
    kyleRayner.addSpecificAttribute("realeza", false);
    kyleRayner.addSpecificAttribute("treinamentoEspecial", true);
    kyleRayner.addSpecificAttribute("superSoldado", false);
    kyleRayner.addSpecificAttribute("bilionario", false);
    kyleRayner.addSpecificAttribute("patriota", true);
    kyleRayner.addSpecificAttribute("combateCorpoACorpo", true);
    kyleRayner.addSpecificAttribute("artesMarciais", true);
    kyleRayner.addSpecificAttribute("forcaDivina", false);
    kyleRayner.addSpecificAttribute("manipulacaoDeEnergia", true);
    kyleRayner.addSpecificAttribute("fazerFeitico", false);
    kyleRayner.addSpecificAttribute("Maguinetismo", false);

    Features simonBaz = new Features("Simon Baz (Lanterna Verde)", "masculino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "humano", false, false,
        false, true, "");

    simonBaz.addSpecificAttribute("DCComics", true);
    simonBaz.addSpecificAttribute("ligaDaJustica", true);
    simonBaz.addSpecificAttribute("metropolis", false);
    simonBaz.addSpecificAttribute("gothamCity", false);
    simonBaz.addSpecificAttribute("themyscira", false);
    simonBaz.addSpecificAttribute("centralCity", false);
    simonBaz.addSpecificAttribute("coastCity", true);
    simonBaz.addSpecificAttribute("atlantis", false);
    simonBaz.addSpecificAttribute("apokolips", false);
    simonBaz.addSpecificAttribute("voar", true);
    simonBaz.addSpecificAttribute("superForca", false);
    simonBaz.addSpecificAttribute("superVelocidade", false);
    simonBaz.addSpecificAttribute("visaoDeRaioX", false);
    simonBaz.addSpecificAttribute("visaoDeCalor", false);
    simonBaz.addSpecificAttribute("superSopro", false);
    simonBaz.addSpecificAttribute("traje", true);
    simonBaz.addSpecificAttribute("regeneracao", false);
    simonBaz.addSpecificAttribute("controleMetal", false);
    simonBaz.addSpecificAttribute("capacete", false);
    simonBaz.addSpecificAttribute("telepatia", false);
    simonBaz.addSpecificAttribute("telecinese", false);
    simonBaz.addSpecificAttribute("absorverEnergia", false);
    simonBaz.addSpecificAttribute("inteligenciaArtificial", false);
    simonBaz.addSpecificAttribute("manipulacaoRealidade", false);
    simonBaz.addSpecificAttribute("agilidadeAprimorada", true);
    simonBaz.addSpecificAttribute("realeza", false);
    simonBaz.addSpecificAttribute("treinamentoEspecial", true);
    simonBaz.addSpecificAttribute("superSoldado", false);
    simonBaz.addSpecificAttribute("bilionario", false);
    simonBaz.addSpecificAttribute("patriota", true);
    simonBaz.addSpecificAttribute("combateCorpoACorpo", true);
    simonBaz.addSpecificAttribute("artesMarciais", true);
    simonBaz.addSpecificAttribute("forcaDivina", false);
    simonBaz.addSpecificAttribute("manipulacaoDeEnergia", true);
    simonBaz.addSpecificAttribute("fazerFeitico", false);
    simonBaz.addSpecificAttribute("Maguinetismo", false);

    Features jessicaCruz = new Features("Jessica Cruz (Lanterna Verde)", "feminino", false, false, "", "heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "humano", false, false,
        false, true, "");

    jessicaCruz.addSpecificAttribute("DCComics", true);
    jessicaCruz.addSpecificAttribute("ligaDaJustica", true);
    jessicaCruz.addSpecificAttribute("metropolis", false);
    jessicaCruz.addSpecificAttribute("gothamCity", false);
    jessicaCruz.addSpecificAttribute("themyscira", false);
    jessicaCruz.addSpecificAttribute("centralCity", false);
    jessicaCruz.addSpecificAttribute("coastCity", true);
    jessicaCruz.addSpecificAttribute("atlantis", false);
    jessicaCruz.addSpecificAttribute("apokolips", false);
    jessicaCruz.addSpecificAttribute("voar", true);
    jessicaCruz.addSpecificAttribute("superForca", false);
    jessicaCruz.addSpecificAttribute("superVelocidade", false);
    jessicaCruz.addSpecificAttribute("visaoDeRaioX", false);
    jessicaCruz.addSpecificAttribute("visaoDeCalor", false);
    jessicaCruz.addSpecificAttribute("superSopro", false);
    jessicaCruz.addSpecificAttribute("traje", true);
    jessicaCruz.addSpecificAttribute("regeneracao", false);
    jessicaCruz.addSpecificAttribute("controleMetal", false);
    jessicaCruz.addSpecificAttribute("capacete", false);
    jessicaCruz.addSpecificAttribute("telepatia", false);
    jessicaCruz.addSpecificAttribute("telecinese", false);
    jessicaCruz.addSpecificAttribute("absorverEnergia", false);
    jessicaCruz.addSpecificAttribute("inteligenciaArtificial", false);
    jessicaCruz.addSpecificAttribute("manipulacaoRealidade", false);
    jessicaCruz.addSpecificAttribute("agilidadeAprimorada", true);
    jessicaCruz.addSpecificAttribute("realeza", false);
    jessicaCruz.addSpecificAttribute("treinamentoEspecial", true);
    jessicaCruz.addSpecificAttribute("superSoldado", false);
    jessicaCruz.addSpecificAttribute("bilionario", false);
    jessicaCruz.addSpecificAttribute("patriota", true);
    jessicaCruz.addSpecificAttribute("combateCorpoACorpo", true);
    jessicaCruz.addSpecificAttribute("artesMarciais", true);
    jessicaCruz.addSpecificAttribute("forcaDivina", false);
    jessicaCruz.addSpecificAttribute("manipulacaoDeEnergia", true);
    jessicaCruz.addSpecificAttribute("fazerFeitico", false);
    jessicaCruz.addSpecificAttribute("Maguinetismo", false);

    Features indigo1 = new Features("Indigo-1 (Tribo Índigo)", "feminino", false, false, "", "anti-heroi",
        "coadjuvante", false, true, "",
        true, true, true,
        false, "alienigena", false, false,
        false, true, "");

    indigo1.addSpecificAttribute("DCComics", true);
    indigo1.addSpecificAttribute("ligaDaJustica", false);
    indigo1.addSpecificAttribute("metropolis", false);
    indigo1.addSpecificAttribute("gothamCity", false);
    indigo1.addSpecificAttribute("themyscira", false);
    indigo1.addSpecificAttribute("centralCity", false);
    indigo1.addSpecificAttribute("coastCity", true);
    indigo1.addSpecificAttribute("atlantis", false);
    indigo1.addSpecificAttribute("apokolips", false);
    indigo1.addSpecificAttribute("voar", true);
    indigo1.addSpecificAttribute("superForca", false);
    indigo1.addSpecificAttribute("superVelocidade", false);
    indigo1.addSpecificAttribute("visaoDeRaioX", false);
    indigo1.addSpecificAttribute("visaoDeCalor", false);
    indigo1.addSpecificAttribute("superSopro", false);
    indigo1.addSpecificAttribute("traje", true);
    indigo1.addSpecificAttribute("regeneracao", false);
    indigo1.addSpecificAttribute("controleMetal", false);
    indigo1.addSpecificAttribute("capacete", false);
    indigo1.addSpecificAttribute("telepatia", true);
    indigo1.addSpecificAttribute("telecinese", false);
    indigo1.addSpecificAttribute("absorverEnergia", true);
    indigo1.addSpecificAttribute("inteligenciaArtificial", false);
    indigo1.addSpecificAttribute("manipulacaoRealidade", false);
    indigo1.addSpecificAttribute("agilidadeAprimorada", true);
    indigo1.addSpecificAttribute("realeza", false);
    indigo1.addSpecificAttribute("treinamentoEspecial", true);
    indigo1.addSpecificAttribute("superSoldado", false);
    indigo1.addSpecificAttribute("bilionario", false);
    indigo1.addSpecificAttribute("patriota", false);
    indigo1.addSpecificAttribute("combateCorpoACorpo", true);
    indigo1.addSpecificAttribute("artesMarciais", true);
    indigo1.addSpecificAttribute("forcaDivina", false);
    indigo1.addSpecificAttribute("manipulacaoDeEnergia", true);
    indigo1.addSpecificAttribute("fazerFeitico", false);
    indigo1.addSpecificAttribute("Maguinetismo", false);

    Features arkillo = new Features("Arkillo (Lanterna Amarelo)", "masculino", false, false, "", "vilao",
        "antagonista", false, true, "",
        false, true, true,
        true, "alienigena", true, false,
        false, true, "");

    arkillo.addSpecificAttribute("DCComics", true);
    arkillo.addSpecificAttribute("ligaDaJustica", false);
    arkillo.addSpecificAttribute("metropolis", false);
    arkillo.addSpecificAttribute("gothamCity", false);
    arkillo.addSpecificAttribute("themyscira", false);
    arkillo.addSpecificAttribute("centralCity", false);
    arkillo.addSpecificAttribute("coastCity", true);
    arkillo.addSpecificAttribute("atlantis", false);
    arkillo.addSpecificAttribute("apokolips", false);
    arkillo.addSpecificAttribute("voar", true);
    arkillo.addSpecificAttribute("superForca", true);
    arkillo.addSpecificAttribute("superVelocidade", false);
    arkillo.addSpecificAttribute("visaoDeRaioX", false);
    arkillo.addSpecificAttribute("visaoDeCalor", false);
    arkillo.addSpecificAttribute("superSopro", false);
    arkillo.addSpecificAttribute("traje", true);
    arkillo.addSpecificAttribute("regeneracao", false);
    arkillo.addSpecificAttribute("controleMetal", false);
    arkillo.addSpecificAttribute("capacete", false);
    arkillo.addSpecificAttribute("telepatia", false);
    arkillo.addSpecificAttribute("telecinese", false);
    arkillo.addSpecificAttribute("absorverEnergia", false);
    arkillo.addSpecificAttribute("inteligenciaArtificial", false);
    arkillo.addSpecificAttribute("manipulacaoRealidade", false);
    arkillo.addSpecificAttribute("agilidadeAprimorada", true);
    arkillo.addSpecificAttribute("realeza", false);
    arkillo.addSpecificAttribute("treinamentoEspecial", true);
    arkillo.addSpecificAttribute("superSoldado", false);
    arkillo.addSpecificAttribute("bilionario", false);
    arkillo.addSpecificAttribute("patriota", false);
    arkillo.addSpecificAttribute("combateCorpoACorpo", true);
    arkillo.addSpecificAttribute("artesMarciais", true);
    arkillo.addSpecificAttribute("forcaDivina", false);
    arkillo.addSpecificAttribute("manipulacaoDeEnergia", true);
    arkillo.addSpecificAttribute("fazerFeitico", false);
    arkillo.addSpecificAttribute("Maguinetismo", false);

    // Adicione os personagens à lista

    listaPersonagens.add(superman);
    listaPersonagens.add(lexLuthor);
    listaPersonagens.add(loisLane);
    listaPersonagens.add(jimmyOlsen);
    listaPersonagens.add(metallo);
    listaPersonagens.add(supergirl);
    listaPersonagens.add(brainiac);
    listaPersonagens.add(steelJohnHenryIrons);
    listaPersonagens.add(livewire);
    listaPersonagens.add(perryWhite);
    listaPersonagens.add(superboy);
    listaPersonagens.add(parasite);
    listaPersonagens.add(bizarro);
    listaPersonagens.add(catGrant);
    listaPersonagens.add(toymanWinslowSchott);
    listaPersonagens.add(batman);
    listaPersonagens.add(joker);
    listaPersonagens.add(robin);
    listaPersonagens.add(catwoman);
    listaPersonagens.add(alfredPennyworth);
    listaPersonagens.add(duasCaras);
    listaPersonagens.add(pinguim);
    listaPersonagens.add(batgirl);
    listaPersonagens.add(espantalho);
    listaPersonagens.add(comissarioGordon);
    listaPersonagens.add(arlequina);
    listaPersonagens.add(hera);
    listaPersonagens.add(mrFreeze);
    listaPersonagens.add(charada);
    listaPersonagens.add(azrael);
    listaPersonagens.add(mulherMaravilha);
    listaPersonagens.add(hippolyta);
    listaPersonagens.add(antiope);
    listaPersonagens.add(artemis);
    listaPersonagens.add(nubia);
    listaPersonagens.add(philippusGeneral);
    listaPersonagens.add(epione);
    listaPersonagens.add(menalippe);
    listaPersonagens.add(ioLantern);
    listaPersonagens.add(barryAllen);
    listaPersonagens.add(irisWest);
    listaPersonagens.add(capitaoFrio);
    listaPersonagens.add(kidFlash);
    listaPersonagens.add(drHarrisonWells);
    listaPersonagens.add(ciscoRamon);
    listaPersonagens.add(caitlinSnow);
    listaPersonagens.add(reverseFlash);
    listaPersonagens.add(joeWest);
    listaPersonagens.add(zoom);
    listaPersonagens.add(jessieQuick);
    listaPersonagens.add(gorilla);
    listaPersonagens.add(mirrorMaster);
    listaPersonagens.add(heatWave);
    listaPersonagens.add(trickster);
    listaPersonagens.add(halJordan);
    listaPersonagens.add(carolFerris);
    listaPersonagens.add(sinestro);
    listaPersonagens.add(tomKalmaku);
    listaPersonagens.add(atrositusLanternaVermelho);
    listaPersonagens.add(johnStewart);
    listaPersonagens.add(kilowog);
    listaPersonagens.add(guyGardner);
    listaPersonagens.add(saintWalker);
    listaPersonagens.add(larfleeze);
    listaPersonagens.add(kyleRayner);
    listaPersonagens.add(simonBaz);
    listaPersonagens.add(jessicaCruz);
    listaPersonagens.add(kyleRayner);
    listaPersonagens.add(simonBaz);
    listaPersonagens.add(jessicaCruz);
    listaPersonagens.add(indigo1);
    listaPersonagens.add(arkillo);

  }
}
