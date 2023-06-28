/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugh1.demo;


 @Controller
public class MyController {

    @RequestMapping("/kuromi.html")
    public ModelAndView myPage() {
        ModelAndView modelAndView = new ModelAndView("Template.nature");
        // Puedes agregar objetos al modelo para pasar datos a la plantilla
        modelAndView.addObject("message", "¡Hola desde Spring Boot!");
        return modelAndView;
    }
}
