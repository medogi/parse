package com.parse.parse.Service;

import com.parse.parse.Entity.Worker;
import com.parse.parse.repository.WorkerRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class ParserService {
    private final WorkerRepository workerRepository;
    private final EntityManager entityManager;
    Worker worker = new Worker();
    int entitycounter = 1;

    public ParserService(WorkerRepository workerRepository, EntityManager entityManager) {
        this.workerRepository = workerRepository;
        this.entityManager = entityManager;
    }

    public void saveinfo(String XML) {
        int from12 = XML.indexOf("<title>");
        int to12 = XML.indexOf("</title>");
        String title=XML.substring(from12+7,to12);

        int devCounter = 0;
        for (int i = 0; i < XML.length(); i++) {
            if (i + 10 < XML.length() && XML.charAt(i) == '<' && XML.charAt(i + 9) == 'r' && XML.charAt(i + 10) == '>') {
                devCounter = devCounter + 1;
            }
        }
        while (devCounter > 0) {
            System.out.println("-------------------------");
            int from = XML.indexOf("<developer>");
            int to = XML.indexOf("</start>");
            String substr = "";
            XML = XML.substring(from+1, to + 8);
            System.out.println("-------------------------");

            int start0 = XML.indexOf("<name>");
            int end0 = XML.indexOf("</name>");
            String name = XML.substring(start0 + 6, end0);

            int start1 = XML.indexOf("<lastname>");
            int end1 = XML.indexOf("</lastname>");
            String lastname = XML.substring(start1 + 10, end1);

            int start2 = XML.indexOf("<gender>");
            int end2 = XML.indexOf("</gender>");
            String gender = XML.substring(start2 + 8, end2);

            worker.setTitle(title);
            worker.setName(name);
            worker.setLastname(lastname);
            worker.setGender(gender);

            workerRepository.save(worker);
            System.out.println("daemata " + entitycounter + " entity");
            entitycounter += 1;
            devCounter--;
        }
    }


}
