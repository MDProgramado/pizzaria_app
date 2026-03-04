package com.maicon.pizzaria.pizzaria_api.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "tenant_id")
    private UUID tenatId;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updatedAt;

    @Column(name = "deleted_at", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant deletedAt;

    public Product(String name, BigDecimal price, UUID tenatId){
        this.name = name;
        this.price = price;
        this.tenatId = tenatId;
    }
}
