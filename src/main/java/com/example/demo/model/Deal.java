package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "deal")
public class Deal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "deal_unique_id")
  private long id;

  @Column(
    name = "deal_timestamp",
    columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
  )
  private String timestamp;

  @NotBlank(message = "from currency iso code must not be blank")
  @Column(name = "from_currency_iso_code", length = 3)
  private String fromCurrencyIsoCode;

  @NotBlank(message = "to currency iso code must not be blank")
  @Column(name = "to_currency_iso_code", length = 3)
  private String toCurrencyIsoCode;

  @Column(name = "deal_amount")
  private long dealAmount;
}
