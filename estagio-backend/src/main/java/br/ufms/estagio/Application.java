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

import br.ufms.estagio.domain.entity.Concedente;
import br.ufms.estagio.domain.entity.PessoaJuridica;
import br.ufms.springbootlib.domain.ReadOnlyBaseRepository;
import br.ufms.springbootlib.service.ReadOnlyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
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

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

//    @Bean
//    public CommandLineRunner demo(AreaEstagioRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(ConcedenteInfoRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(ConcedenteRepository repository) {
//        return new RepositoryTester(repository); // NÃO PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(ConvenioRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(CursoRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(DiscenteRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(DocenteRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(EnderecoEletronicoRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(EnderecoRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(EstagioRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(FormacaoAcademicaRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(HorarioEstagiarioRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(MunicipioRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(RepresentanteLegalRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(SeguroRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(StatusEstagioRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(SupervisorRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(TelefoneRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(TextoEstagioRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(UnidadeRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(UsuarioRepository repository) {
//        return new RepositoryTester(repository); // PASSOU
//    }
//    
//    
//    // TESTE DOS SERVIÇOS
//    
//    @Bean
//    public CommandLineRunner demo(ConcedenteService service) {
//        return new RepositoryTester(service);
//    }
//
//    @Bean
//    public CommandLineRunner demo(ConvenioRepository repository) {
//        return new RepositoryTester(repository);
//    }
//
//    @Bean
//    public CommandLineRunner demo(CursoService service) {
//        return new RepositoryTester(service); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(DiscenteService service) {
//        return new RepositoryTester(service); // PASSOU
//    }
//
//    @Bean
//    public CommandLineRunner demo(DocenteService service) {
//        return new RepositoryTester(service);
//    }
//
//    @Bean
//    public CommandLineRunner demo(EstagioService service) {
//        return new RepositoryTester(service);
//    }
//
//    @Bean
//    public CommandLineRunner demo(MunicipioService service) {
//        return new RepositoryTester(service);
//    }
//
//    @Bean
//    public CommandLineRunner demo(SupervisorService service) {
//        return new RepositoryTester(service);
//    }
//
//    @Bean
//    public CommandLineRunner demo(UnidadeService service) {
//        return new RepositoryTester(service);
//    }
//
//    @Bean
//    public CommandLineRunner demo(UsuarioService repository) {
//        return new RepositoryTester(repository);
//    }

    private class RepositoryTester implements CommandLineRunner {

        private final ReadOnlyBaseRepository repository;

        public RepositoryTester(ReadOnlyBaseRepository repository) {
            this.repository = repository;
        }

        public RepositoryTester(ReadOnlyService service) {
            this.repository = service.getRepository();
        }

        @Override
        public void run(String... args) throws Exception {
            LOG.info("Entidades encontrads com findAll():");
            LOG.info("-------------------------------");
            repository.findAll().forEach((entity) -> {
                if (entity instanceof Concedente) {
                    Concedente<PessoaJuridica> c = (Concedente) entity;
                    LOG.info(c.getDados().getNome());
                }
                LOG.info(entity.toString());
            });
            LOG.info("-------------------------------\n");
        }

    }

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
