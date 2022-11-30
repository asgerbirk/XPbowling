package com.example.xpbowling.reservation.service;

import com.example.xpbowling.reservation.model.*;
import com.example.xpbowling.reservation.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }

    public Reservation findById(Long id) {
        return reservationRepository.findById(id).orElseThrow(() -> new IllegalStateException("no rider with that id" + id));
    }

    public Reservation updateReservation(Long id, Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public List<Reservation> getAllBowlingReservations(){
        return reservationRepository.findAll().stream().filter(reservation -> reservation instanceof BowlingReservation).collect(Collectors.toList());
    }


    public List<Reservation> getAllAirhockeyReservations(){
        return reservationRepository.findAll().stream().filter(item -> item instanceof AirhockeyReservation).collect(Collectors.toList());
    }

    public List<Reservation> getAllDiningReservations(){
        return reservationRepository.findAll().stream().filter(item -> item instanceof DiningReservation).collect(Collectors.toList());
    }

    public BowlingReservation createBowlingReservation(BowlingReservation reservation){
        //har testet det men det virker sgu ikke

/*
        LocalTime reservation1 = reservation.getReservationStart();
        LocalTime reservation2 = reservation.getReservationEnd();
        LocalDate reservation3 = reservation.getDate();
        System.out.println(reservation1);
        System.out.println(reservation2);
        System.out.println(reservation3);


        if (checkReservationAvailability(reservation) == false) {
        if (reservation.getReservationStart().equals(reservation1) && reservation.getReservationEnd() == reservation2 && reservation.getDate() == reservation3){
            throw new IllegalStateException("That reservation is already booked! " + reservation + reservation1 + reservation3);
        } else {
            reservation.setBooked(true);
        }else{
 */
        reservation.setType(ReservationType.BOWLING.name());
            return reservationRepository.save(reservation);
        }





    public boolean checkReservationAvailability(BowlingReservation reservation) {
        List<Reservation> tempList = getAllBowlingReservations();
        List<Reservation> tempListOfTimeDuplicates = new ArrayList<>();

        //Brug en liste over alle reservationer for den enkelte dag,
        // en ny metode til at hende alle reservationer for eks d. 15

            for (int i = 0; i < tempList.size(); i++) {
                if (tempList.get(i).getReservationStart() == reservation.getReservationStart()) {
                    System.out.println("Time duplicate caught: " + tempList.get(i).getReservationStart() + " await date check on: " + tempList.get(i).getName());
                    tempListOfTimeDuplicates.add(tempList.get(i));
                }
                System.out.println("checked: " + tempList.get(i).getName() + " for time");
            }
            for (int i = 0; i < tempListOfTimeDuplicates.size(); i++) {
                if (tempListOfTimeDuplicates.get(i).getDate() == reservation.getDate()) {
                    System.out.println("The checker found matching time and date in the database and the reservation is unavailable");
                    return false;
                }
            }
            System.out.println("the checker found no duplicates on reservation");
            return true;
        }


    public AirhockeyReservation createAirhockeyReservation(AirhockeyReservation reservation){
        reservation.setType(ReservationType.AIRHOCKEY.name());
        return reservationRepository.save(reservation);
    }

    public DiningReservation createDiningReservation(DiningReservation reservation){
        reservation.setType(ReservationType.SPISNING.name());
        return reservationRepository.save(reservation);
    }


    public void deleteReservation(Long id){
        boolean checkIfReservationExists = reservationRepository.existsById(id);
        if (!checkIfReservationExists){
            throw new IllegalStateException("does not exists " + id);
        }
        reservationRepository.deleteById(id);
    }



}
