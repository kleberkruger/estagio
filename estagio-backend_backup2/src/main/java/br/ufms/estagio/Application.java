/*
 * Copyright (C) 2017 Universidade Federal de Mato Grosso do Sul
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.ufms.estagio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Kleber Kruger
 */
@SpringBootApplication
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    private static final Logger log = LoggerFactory.getLogger(Application.class);
//
//    @Bean
//    public CommandLineRunner demo(DocenteRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Docente());
//            repository.save(new Docente());
//            repository.save(new Docente());
//            repository.save(new Docente());
//            repository.save(new Docente());
//
//            // fetch all customers
//            log.info("Customers found with findAll():");
//            log.info("-------------------------------");
//            repository.findAll().forEach((docente) -> {
//                log.info(docente.toString());
//            });
//            log.info("");
//
//            // fetch an individual customer by ID
//            Docente customer = repository.findOne(1L);
//            log.info("Customer found with findOne(1L):");
//            log.info("--------------------------------");
//            log.info(customer.toString());
//            log.info("");
//
//            // fetch customers by last name
//            log.info("Customer found with findByLastName('Bauer'):");
//            log.info("--------------------------------------------");
////            for (Docente bauer : repository.findByLastName("Bauer")) {
////                log.info(bauer.toString());
////            }
//            log.info("");
//        };
//    }
}
