package ru.dias.visitingapolyclinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component("registry")
public class Registry implements IRegistry {

    private List<IPatientCard> patientCards;
    private List<ICabinet> cabinets;

    public void setPatientCards(List<IPatientCard> patientCards) {
        this.patientCards = patientCards;
    }

    public void setCabinets(List<ICabinet> cabinets) {
        this.cabinets = cabinets;
    }

    private IPatientCard patientCard;

    @Autowired
    public void setPatientCard(IPatientCard patientCard) {
        this.patientCard = patientCard;
    }

    private ICabinet cabinet;

    @Autowired
    public void setCabinet(ICabinet cabinet) {
        this.cabinet = cabinet;
    }

    @Override
    public IPatientCard serpCard(String firstName, String lastName) {
        if ( patientCards != null && patientCards.size() > 0) {
            for (IPatientCard card : patientCards) {
                if (card.getPatient().getFirstName().equals(firstName) &&
                        card.getPatient().getLastName().equals(lastName)) {
                    System.out.println("Пациент " + card.getPatient().getFirstName() + " " +
                            card.getPatient().getLastName() + " получил карточку в регистратуре.");
                    return card;
                }
            }
        }
        return null;
    }

    @Override
    public ICabinet chooseCabinet(String doctor) {
        if (cabinets != null && cabinets.size() > 0) {
            for (ICabinet cabinet : cabinets) {
                if (cabinet.getDoctor().getName().equals(doctor)) {
                    System.out.println("Он пошел в " + cabinet.getNumber() +
                            " кабинет к доктору - " + cabinet.getDoctor().getName());
                    return cabinet;
                }
            }
        }
        return null;
    }
}
