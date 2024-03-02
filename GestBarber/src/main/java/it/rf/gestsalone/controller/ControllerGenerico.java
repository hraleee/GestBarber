package it.rf.gestsalone.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.rf.gestsalone.model.Categoria;
import it.rf.gestsalone.model.Cliente;
import it.rf.gestsalone.model.Contiene;
import it.rf.gestsalone.model.Operatore;
import it.rf.gestsalone.model.Prenotazione;
import it.rf.gestsalone.model.Servizio;
import it.rf.gestsalone.model.DTO.ClienteDto;
import it.rf.gestsalone.model.DTO.SegreteriaDto;
import it.rf.gestsalone.service.CategoriaService;
import it.rf.gestsalone.service.ClienteService;
import it.rf.gestsalone.service.ContieneService;
import it.rf.gestsalone.service.OperatoreService;
import it.rf.gestsalone.service.PrenotazioneService;
import it.rf.gestsalone.service.ServizioService;
import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
//@RequestMapping("GestSalone/")
public class ControllerGenerico {
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Autowired
	private ClienteService cS;

	@Autowired
	private OperatoreService opS;

	@Autowired
	private CategoriaService catS;

	@Autowired
	private ServizioService serS;

	@Autowired
	private PrenotazioneService prenS;

	@Autowired
	private ContieneService conS;

	///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@GetMapping("home")
	public String vaiHome(HttpSession session) {

		session.invalidate();
		return "home";
	}


	@GetMapping("registracliente")
	public String vaiRegistraCliente() {

		return "registracliente";
	}


	@GetMapping("ricercacf")
	public String vaiRicercaCf() {

		return "ricercacf";
	}


	@GetMapping("modificacliente")
	public String vaiModificaCliente() {

		return "modificacliente";
	}


	@GetMapping("operatoreregistrazione")
	public String vaiRegistraOperatore() {

		return "operatoreregistrazione";
	}


	@GetMapping("logincliente")
	public String vaiLoginCliente() {

		return "logincliente";
	}


	@GetMapping("areatitolare")
	public String vaiAreaTitolare() {

		return "areatitolare";
	}


	@GetMapping("gestionecliente")
	public String vaiGestioneCliente() {

		return "gestionecliente";
	}


	@GetMapping("gestioneoperatori")
	public String vaiGestioneOperatori() {

		return "gestioneoperatori";
	}


	@GetMapping("inseriscioperatore")
	public String vaiInserisciOperatore() {

		return "inseriscioperatore";
	}



	@GetMapping("eliminacliente")
	public String vaiEliminaCliente() {

		return "eliminacliente";
	}



	@GetMapping("ricercaoperatore")
	public String vaiRicercaoperatore() {

		return "ricercaoperatore";
	}


	@GetMapping("modificaoperatore")
	public String vaiModificaOp() {
		return "modificaoperatore";
	}







	@GetMapping("gestioneservizio")
	public String vaiGestioneServizio() {


		return "gestioneservizio";
	}


	@GetMapping("prenotazionecliente")
	public String vaiTrovaServizio(Model m) {

		List <Servizio> list = this.serS.findall();


		m.addAttribute("servizio", list);


		return "prenotazionecliente";


	}


	@GetMapping("inserisciservizio")
	public String vaiInserisciServizio() {

		return "inserisciservizio";
	}


	@GetMapping("menuclienti")
	public String vaiMenuClienti() {
		return "menuclienti";
	}

	@GetMapping("aboutus")
	public String vaiAboutUs() {
		return "aboutus";
	}

	
	@GetMapping("logout")
	public String vaiLogoutCliente(HttpSession session) {
		
		session.invalidate();
		
		
		return "redirect:home";
	}
	
	
	@GetMapping("prenotazionesegretaria")
	public String vaiPrenotazioneSegretaria(Model m) {
		
		 Date date = java.sql.Date.valueOf(LocalDate.now());
		
		 List <SegreteriaDto> listap= this.prenS.listaPrenotazione(date);
		
		 List <Operatore> listaoperazione = this.opS.listaop();
		 
		 m.addAttribute("listap", listap);
		 
		 m.addAttribute("listaoperazione", listaoperazione);
		 
		 
		return "prenotazionesegretaria";
	}
	
	@GetMapping("loginoperatore")
	public String vaiLoginOperatore() {
		return "loginoperatore";
	}
	
	
	@GetMapping("menusegreteria")
	public String vaiMenuSegreteria()
	{
		return "menusegreteria";
	}
	
	@GetMapping("listaservizio")
	public String vailistaServizio() {
		return "listaservizio";
	}

	
	@GetMapping("prenotazionieseguite")
	public String vaiPrenoeseguite(HttpSession session, Model m) {
		
		String cf =  (String) session.getAttribute("codiceFiscale");
		
		
		 List<ClienteDto> listaprencliente= this.prenS.prenotazioneClienteEsegeuita(cf);
		
		 m.addAttribute("listaCf", listaprencliente);
		 
		return "prenotazionieseguite";
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@PostMapping("inserisciCliente")
	public String vaiRegistraCliente(@ModelAttribute Cliente c, Model m) {

		String cf=c.getCfCliente();

		c.setAbilitatoCliente(true);

		Boolean trovato=this.cS.salvaCliente(c, cf); //Services

		if(trovato==true)
		{
			m.addAttribute("valore", "Inserimento andato a buon fine");
			return "registracliente";
		}
		else
		{
			m.addAttribute("valore", "cf gia presente");
			return  "registracliente";
		}



	}



	@PostMapping("ricercaPerCf")
	public String vaiRicercaPerCf(@RequestParam String cfImp, Model m) 
	{

		if(this.cS.RicercaCf(cfImp).isPresent()	)
		{
			Optional<Cliente> clienteTrov=this.cS.RicercaCf(cfImp);
			String nomeDaRic=clienteTrov.get().getCfCliente();
			String cognomeDaRic=clienteTrov.get().getCognomeCliente();
			String cfDaRic=clienteTrov.get().getCfCliente();
			String telDaRic=clienteTrov.get().getTelefonoCliente();
			String usernameDaRic= clienteTrov.get().getUsernameCliente();
			String passwordDaRic =clienteTrov.get().getPasswordCliente();

			m.addAttribute("nomeValore", nomeDaRic);
			m.addAttribute("cognomeValore", cognomeDaRic);
			m.addAttribute("cfValore", cfDaRic);
			m.addAttribute("telValore", telDaRic);
			m.addAttribute("usernameValore", usernameDaRic);
			m.addAttribute("passwordValore", passwordDaRic);


			return "ricercacf";


		}
		else
		{
			m.addAttribute("valoreErrorecf", "Errore, utente non trovato");
			return "ricercacf";
		}



	}



	@PostMapping("modificaPerCf")
	public String vaiModificaPerCf(@RequestParam String cfImp, Model m) 
	{

		if(this.cS.RicModCliente(cfImp).isPresent()	)
		{
			Optional<Cliente> clienteTrov=this.cS.RicercaCf(cfImp);
			String nomeDaRic=clienteTrov.get().getCfCliente();
			String cognomeDaRic=clienteTrov.get().getCognomeCliente();
			String cfDaRic=clienteTrov.get().getCfCliente();
			String telDaRic=clienteTrov.get().getTelefonoCliente();
			String usernameDaRic=clienteTrov.get().getUsernameCliente();
			String passwordDaRic=clienteTrov.get().getPasswordCliente();

			m.addAttribute("nomeValore", nomeDaRic);
			m.addAttribute("cognomeValore", cognomeDaRic);
			m.addAttribute("cfValore", cfDaRic);
			m.addAttribute("telValore", telDaRic);
			m.addAttribute("usernameValore", usernameDaRic);
			m.addAttribute("passwordValore", passwordDaRic);

			return "modificacliente";


		}
		else
		{
			m.addAttribute("valoreErrorecf", "Errore, utente non trovato");
			return "modificacliente";
		}



	}



	@PostMapping("modificaPerCfCliente")
	public String vaiModificaPerCfCliente(@RequestParam String nomeRic, String cognomeRic, String cfRic, String telefonoRic, String usernameRic, String passwordRic, Model m) 
	{


		String nuovonome= nomeRic;
		String nuovocognome= cognomeRic;
		String nuovocf= cfRic;
		String nuovotelefono= telefonoRic;
		String nuovousername= usernameRic;
		String nuovapassword= passwordRic;



		Cliente c = new  Cliente();

		c.setNomeCliente(nuovonome);
		c.setCognomeCliente(nuovocognome);
		c.setCfCliente(nuovocf);
		c.setTelefonoCliente(nuovotelefono);
		c.setUsernameCliente(nuovousername);
		c.setPasswordCliente(nuovapassword);

		this.cS.ModificaCliente(c);

		m.addAttribute("nomeValore", nuovonome);
		m.addAttribute("cognomeValore", nuovocognome);
		m.addAttribute("cfValore", nuovocf);
		m.addAttribute("telefonoValore", nuovotelefono);
		m.addAttribute("usernameValore", nuovousername);
		m.addAttribute("passwordValore", nuovapassword);

		return "modificacliente";

	}


	@PostMapping("loginclientepost")
	public String vaiLoginClientepost(@RequestParam String usernamelogin, String passwordlogin, HttpSession session, Model m  ) {

		String usernameImp = usernamelogin;
		String passwordImp = passwordlogin;

		
		Optional<Cliente> c= this.cS.LoginCliente(usernameImp, passwordImp);
		
		

		if(c.isPresent() )
		{
			

			if (c!=null && c.get().getAbilitatoCliente().equals(true))
			{
				String cfSession= c.get().getCfCliente();

				session.setAttribute("codiceFiscale", cfSession);

				return "menuclienti";
			}
			else
			{
				m.addAttribute("errore", "Errore, Username o password errati");
				
				return "logincliente";


			}
			
			

		}
		m.addAttribute("errore", "Errore, Username o password errati");
		
		return "logincliente";
		
		

	}



	@PostMapping("registraOperatore")
	public String vaiInserisciOperatori(@ModelAttribute Operatore op, @RequestParam Integer idCategoria, Model m) {




		Optional<Categoria> categoriaTrovata = catS.findByIdCategoria(idCategoria);

		op.setOpAbilitato(true);



		Categoria cate = categoriaTrovata.get();



		Boolean salvaOp = this.opS.salvaOperatore(op, cate);

		if (salvaOp==true) 
		{
			m.addAttribute("esito", "Inserimento andato a buon fine");
		} 
		else 
		{
			m.addAttribute("esito", "Operatore già presente.");
		}




		return "inseriscioperatore";




	}



	@PostMapping("ricercaCfOperatore")
	public String vaiRicercaOperatoreCf(@RequestParam String cfOpImp, Model m) {

		String cfImp= cfOpImp;

		if(this.opS.ricercaOperatore(cfImp).isPresent())
		{

			Optional<Operatore> o = this.opS.ricercaOperatore(cfImp);
			String nomeRic= o.get().getNomeOp();
			String cognomeRic= o.get().getCognomeOp();
			String cfRic= o.get().getCfOp();
			String usernameRic= o.get().getOpUsername();
			String passwordRic= o.get().getOpPassword();


			m.addAttribute("nomeValore", nomeRic);
			m.addAttribute("cognomeValore", cognomeRic);
			m.addAttribute("cfValore", cfRic);
			m.addAttribute("usernameValore", usernameRic);
			m.addAttribute("passwordValore", passwordRic);
			return "ricercaoperatore";
		}
		else
		{
			m.addAttribute("errorevalore", "Operatore non trovato");
			return "ricercaoperatore";
		}
	}




	@PostMapping("ricercaPerCfOp")
	public String vairicercaPerCfOperatore(@RequestParam String cfDaRic, Model m) {

		String cf = cfDaRic;

		if(this.opS.trovaCfOperatore(cf).isPresent()) {

			Optional<Operatore> o=this.opS.trovaCfOperatore(cf);


			String nomeRic = o.get().getNomeOp();
			String cognomeRic = o.get().getCognomeOp();
			String cfRic = o.get().getCfOp();
			String usernameRic = o.get().getOpUsername();
			String passwordRic = o.get().getOpPassword();
			Categoria categoriaRic = o.get().getCategoria();
            Boolean opAbilitato = o.get().getOpAbilitato();

            
			m.addAttribute("nomevalore", nomeRic);
			m.addAttribute("cognomevalore", cognomeRic);
			m.addAttribute("cfvalore", cfRic);
			m.addAttribute("usernamevalore", usernameRic);
			m.addAttribute("passwordvalore", passwordRic);
			m.addAttribute("categoriavalore", categoriaRic);
			m.addAttribute("abilitatovalore", opAbilitato);

			return "modificaoperatore";
		}
		else {

			return "modificaoperatore";
		}


	}


	@PostMapping("modificaCfOperatore")
	public String vaiModificaOperatore(@RequestParam String nuovoNome, String nuovoCognome, String nuovoCf, String nuovoUsername, String nuovaPassword, Categoria categoria, Boolean nuovoAbil, Model m) {



		Operatore o = new  Operatore();

		o.setNomeOp(nuovoNome);
		o.setCognomeOp(nuovoCognome);
		o.setCfOp(nuovoCf);
		o.setOpUsername(nuovoUsername);
		o.setOpPassword(nuovaPassword);
		o.setCategoria(categoria);
        o.setOpAbilitato(nuovoAbil);

		this.opS.saveOp(o);

		m.addAttribute("nomevalore", nuovoNome);
		m.addAttribute("cognomevalore", nuovoCognome);
		m.addAttribute("cfvalore", nuovoCf);
		m.addAttribute("usernamevalore", nuovoUsername);
		m.addAttribute("passwordvalore", nuovaPassword);
		m.addAttribute("categoriavalore", categoria);
		m.addAttribute("abilitatovalore", nuovoAbil);



		return "modificaoperatore";
	}








	@PostMapping("Contiene")
	public String contienevai(@RequestParam Servizio [] servizio, String cfCliente, Date dataPrenotazione,Float totalCost, Model m) {

		Prenotazione p= new Prenotazione();


		Optional<Cliente> cliente = cS.findByCf(cfCliente);

		Optional<Operatore> o = this.opS.ricercaOperatore("segreteria");


		if(cliente.isPresent()) {

			Cliente c = cliente.get();


			Date date =  java.sql.Date.valueOf(LocalDate.now());
			p.setCliente(c); 

			p.setDataPrenotazione(date);

			p.setStatoPrenotazione(false);

			p.setCostoTotalePrenotazione(totalCost);
			this.prenS.salvaPren(p);





			if(o.isPresent()) {
				int i=0;
				while(i<servizio.length)
				{
					Contiene con = new Contiene();



					con.setServizio(servizio[i]);

					con.setOperatore(o.get());


					con.setDataPrenotazioneCliente(dataPrenotazione);
					con.setStatoOperazioneContiene(false);
					con.setPrenotazione(p);


					this.conS.salvaContiene(con);
					i++;
				}

			}
		}

		List <Servizio> list = this.serS.findall();


		m.addAttribute("servizio", list);


		return "prenotazionecliente";

	}
	
	
	@PostMapping("operatorelogin")
	public String vaiOperatoreLogin(@RequestParam String usernameRic, String passwordRic, HttpSession session, Model m) {
		
		
		 Optional<Operatore> op= this.opS.loginOp(usernameRic, passwordRic);
		
		
		if(op.isPresent())
		{
			
			if(op!=null && op.get().getOpAbilitato().equals(true))
			{
				
				String CfOper= op.get().getCfOp();
				Categoria a= op.get().getCategoria();
				  
				
				if(a.getIdCategoria().equals(1))
				{
					session.setAttribute("cfAdmin", CfOper);
					
					return "areatitolare";
				}
				else
				{
					session.setAttribute("cfOperatore", CfOper);
					
					return "menusegreteria";
				}
				
				
				
			}
			
			
			
			
		}
		else
		{
			m.addAttribute("errore", "Errore, Username o password errati");
			return "loginoperatore";
		}
		
		
		
		return "home";
	}
	
	@PostMapping("servizioinserisci")
	public String vaiServizioRegistra(@ModelAttribute Servizio s, Model m) {
		
		 this.serS.SalvaServizio(s);
		
		m.addAttribute("esitoServizio", "Inserimento andato a buon fine");
		
		return "inserisciservizio";
		
		
		
		
		
	}
	
	@PostMapping("serviziolista")
	public String vaiServizioRicerca(String nomeServizio) {
		
		Servizio s = new  Servizio();
		
		List<Servizio> listaServ= this.serS.trovaListaServizio(nomeServizio);
	
		//////////////////////auuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu
		
		return "listaservizio";
	}
	
	@PostMapping("termina")
	public String termina(@RequestParam Integer valid,  Model m) {
		

		
		
		System.out.print(valid);
		
		this.conS.terminapren(valid);
		
		
		
		
		Date date = java.sql.Date.valueOf(LocalDate.now());
		
		
		
		 List <SegreteriaDto> listap= this.prenS.listaPrenotazione(date);
		
		 m.addAttribute("listap", listap);
		
		
		return "redirect:prenotazionesegretaria";
	}
	
	@PostMapping("assegnaop")
	public String assegnaOp(@RequestParam String cfOp,Integer idOp,Model m ) {
	
		System.out.print(cfOp);
		 
		System.out.print(idOp);
		 Operatore o = this.opS.trovaOp(cfOp);	 
		  Contiene c = this.conS.trovacontiene(idOp);
		
		  c.setOperatore(o);
		  
		  this.conS.salvaCon(c);
		  
		  Date date = java.sql.Date.valueOf(LocalDate.now());
			
			 List <SegreteriaDto> listap= this.prenS.listaPrenotazione(date);
			
			 List <Operatore> listaoperazione = this.opS.listaop();
			 
			 m.addAttribute("listap", listap);
			 
			 m.addAttribute("listaoperazione", listaoperazione);	  
				  
		return "prenotazionesegretaria";
	}
	
	
}