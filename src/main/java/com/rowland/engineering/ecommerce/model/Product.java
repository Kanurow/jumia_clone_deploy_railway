package com.rowland.engineering.ecommerce.model;

import com.rowland.engineering.ecommerce.model.audit.UserDateAudit;
import jakarta.persistence.*;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Slf4j
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    @Column(name = "product_name")
    private String productName;


    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private Category category;
    

    @NotNull
    @Column(name = "selling_price")
    private Double sellingPrice;

    @NotNull
    @Column(name = "amount_discounted")
    private Double amountDiscounted;


    @NotNull
    @Column(name = "percentage_discount")
    private Integer percentageDiscount;

    @NotNull
    @Positive
    private Integer quantity;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    private Long userId;

}




