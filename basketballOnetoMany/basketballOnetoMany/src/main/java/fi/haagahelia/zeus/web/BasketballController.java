package fi.haagahelia.zeus.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import org.springframework.web.bind.annotation.ResponseBody;

import fi.haagahelia.zeus.domain.Basketball;
import fi.haagahelia.zeus.domain.Basketball1;
import fi.haagahelia.zeus.domain.Basketball2;
import fi.haagahelia.zeus.domain.CategoryRepository;
import fi.haagahelia.zeus.domain.CategoryRepository1;
import fi.haagahelia.zeus.domain.CategoryRepository2;
import fi.haagahelia.zeus.domain.BasketballRepository;
import fi.haagahelia.zeus.domain.BasketballRepository1;
import fi.haagahelia.zeus.domain.BasketballRepository2;
@Controller
public class BasketballController {
	
	@Autowired
	private BasketballRepository repository; 
	
	@Autowired
	private BasketballRepository1 repository1; 
	
	@Autowired
	private BasketballRepository2 repository2; 
	
	@Autowired
	private CategoryRepository crepository; 
	
	@Autowired
	private CategoryRepository1 ccrepository; 
	
	@Autowired
	private CategoryRepository2 cccrepository; 
	
	//Show login page
	@RequestMapping(value="/login")
	public String index() {	
	    return "login";
	    }	
	
	//logout re direct to login page
	@RequestMapping(value="/logout")
	public String logout() {	
	    return "login";
	    }	
	
	//show list of choices
	@RequestMapping(value="/list")
    public String list(Model model) {	 
        return "list";        
    }
	
	//show list of games with sort and filter
	@RequestMapping(value="/fed")
	public String fed() {	
	    return "fed";
	    }
	
	//show calendar page that creates schedules
	@RequestMapping(value="/calendar")
	public String calendar() {	
	    return "calendar";
	    }
	
	//show calendar page that creates schedules
	@RequestMapping(value="/sched")
	public String sched() {	
	    return "sched";
	    }	
	
	//show list of games
    @RequestMapping(value="/gamelist")
    public String gamelist(Model model) {	
        model.addAttribute("books", repository.findAll());
        return "gamelist";
    }
  //show list of games
    @RequestMapping(value="/gamelist1")
    public String gamelist1(Model model) {	
        model.addAttribute("books1", repository1.findAll());
        return "gamelist1";
    }
  //show list of games
    @RequestMapping(value="/gamelist2")
    public String gamelist2(Model model) {	
        model.addAttribute("books2", repository2.findAll());
        return "gamelist2";
    }
    
    //redirect to add page exclusive for Admin
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/add")
    public String addBook(Model model){
    	model.addAttribute("book", new Basketball());
    	model.addAttribute("category", crepository.findAll());
        return "addgame";
    }   
    
   

  //redirect to save page exclusive for Admin
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Basketball book){
        repository.save(book);
        return "redirect:gamelist";
     
    }    
  //redirect to add page exclusive for Admin
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/add1")
    public String addBook1(Model model){
    	model.addAttribute("book1", new Basketball1());
    	model.addAttribute("category1", ccrepository.findAll());
        return "addgame1";
    }     
  //redirect to save page exclusive for Admin
    @RequestMapping(value = "/save1", method = RequestMethod.POST)
    public String save1(Basketball1 book1){
        repository1.save(book1);
        return "redirect:gamelist1";
              
    }  
  //redirect to add page exclusive for Admin
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/add2")
    public String addBook2(Model model){
    	model.addAttribute("book2", new Basketball2());
    	model.addAttribute("category2", cccrepository.findAll());
        return "addgame2";
    }     
  //redirect to save page exclusive for Admin
    @RequestMapping(value = "/save2", method = RequestMethod.POST)
    public String save2(Basketball2 book2){
        repository2.save(book2);
        return "redirect:gamelist2";
              
    }  
  //show delete button
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deletebook(@PathVariable("id") Long bookId, Model model) {
    	repository.delete(bookId);
        return "redirect:../gamelist";
    }     
  //show delete button
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/delete1/{id1}", method = RequestMethod.GET)
    public String deletebook1(@PathVariable("id1") Long bookId1, Model model1) {
    	repository1.delete(bookId1);
        return "redirect:../gamelist1";
    }    
  //show delete button
    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/delete2/{id2}", method = RequestMethod.GET)
    public String deletebook2(@PathVariable("id2") Long bookId2, Model model2) {
    	repository2.delete(bookId2);
        return "redirect:../gamelist2";
    }  
}
