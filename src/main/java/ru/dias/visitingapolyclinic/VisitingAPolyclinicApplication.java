package ru.dias.visitingapolyclinic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class VisitingAPolyclinicApplication {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        List<IPatientCard> patientCards;
        List<ICabinet> cabinets;

        cabinets = new ArrayList<>();
        Doctor doctor1 = context.getBean("doctor", Doctor.class);
        doctor1.setName("Терапевт");

        Doctor doctor2 = context.getBean("doctor", Doctor.class);
        doctor2.setName("Невропатолог");

        Doctor doctor3 = context.getBean("doctor", Doctor.class);
        doctor3.setName("Хирург");

        Cabinet cabinet1 = context.getBean("cabinet", Cabinet.class);
        cabinet1.setDoctor(doctor1);
        cabinet1.setNumber(201);

        Cabinet cabinet2 = context.getBean("cabinet", Cabinet.class);
        cabinet2.setDoctor(doctor2);
        cabinet2.setNumber(202);

        Cabinet cabinet3 = context.getBean("cabinet", Cabinet.class);
        cabinet3.setDoctor(doctor3);
        cabinet3.setNumber(203);

        cabinets.add(cabinet1);
        cabinets.add(cabinet2);
        cabinets.add(cabinet3);

        Patient patient1 = context.getBean("patient", Patient.class);
        patient1.setFirstName("Андрей");
        patient1.setLastName("Андреев");

        Patient patient2 = context.getBean("patient", Patient.class);
        patient2.setFirstName("Алексей");
        patient2.setLastName("Алексеев");

        Patient patient3 = context.getBean("patient", Patient.class);
        patient3.setFirstName("Иван");
        patient3.setLastName("Иванов");

        PatientCard card1 = context.getBean("patientCard", PatientCard.class);
        card1.setPatient(patient1);
        card1.setAdress("г.Москва ул. Воздвиженка д.3 кв.10");

        PatientCard card2 = context.getBean("patientCard", PatientCard.class);
        card2.setPatient(patient2);
        card2.setAdress("г.Москва ул. Воздвиженка д.5 кв.15");

        PatientCard card3 = context.getBean("patientCard", PatientCard.class);
        card3.setPatient(patient3);
        card3.setAdress("г.Москва ул. Воздвиженка д.10 кв.16");

        patientCards = new ArrayList<>();
        patientCards.add(card1);
        patientCards.add(card2);
        patientCards.add(card3);

        Registry registry = context.getBean("registry", Registry.class);
        registry.setPatientCards(patientCards);
        registry.setCabinets(cabinets);

        IPatientCard card = registry.serpCard("Алексей", "Алексеев");
        if (card != null) {
            String doctorp = "Невропатолог";
            ICabinet cabinet = registry.chooseCabinet(doctorp);
            if (cabinet != null) {
                cabinet.getDoctor().accept(card);
            }
        }
    }
}
