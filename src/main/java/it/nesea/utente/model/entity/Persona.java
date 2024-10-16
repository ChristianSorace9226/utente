package it.nesea.utente.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    String cognome;

    @Column(nullable = false)
    String nome;

    @Column(nullable = false)
    String recapitoTelefonico;

    @Column(nullable = false, unique = true)
    String email;

    @Column(nullable = false, unique = true)
    String codiceFiscale;

    @Column(nullable = false)
    Date dataNascita;

    @Column(nullable = false)
    String luogoNascita;

    @Column(nullable = false)
    String domicilioProvincia;

    @Column(nullable = false)
    String domicilioComune;

    @Column(nullable = false)
    String domicilioCap;

    @Column(nullable = false, unique = true)
    String domicilioIndirizzo;
}