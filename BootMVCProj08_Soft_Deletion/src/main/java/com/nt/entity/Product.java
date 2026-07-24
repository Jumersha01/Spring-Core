package com.nt.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Product_Pr_Detailses")
@SQLDelete(sql = "UPDATE Product_Pr_Detailses SET deleted = 1 WHERE id = ?")
@SQLRestriction("deleted = 0")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@AllArgsConstructor
public class Product {

    @Id
    @SequenceGenerator(
            name = "prod_seq_gen",
            sequenceName = "PRODUCT_SEQ",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "prod_seq_gen"
    )
    private Integer id;
    
    @NonNull
    private String name;

    private Double price;

    private Integer deleted=0;
    
}