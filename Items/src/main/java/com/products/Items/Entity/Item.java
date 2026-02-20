package com.products.Items.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "items", schema = "public")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "title", nullable = false, columnDefinition = "text")
    private String title;

    @Column(name = "brand", columnDefinition = "text")
    private String brand;

    @Column(name = "pack_size", nullable = false, columnDefinition = "text")
    private String packSize;

    @Column(name = "veg_type", columnDefinition = "text")
    private String vegType;  // "veg" | "non_veg" | "egg" | "unspecified"

    @NotNull
    @Column(name = "mrp", nullable = false, precision = 38, scale = 2)
    private BigDecimal mrp;

    @NotNull
    @Column(name = "selling_price", nullable = false, precision = 38, scale = 2)
    private BigDecimal sellingPrice;

    @Column(name = "main_image_url", nullable = false, columnDefinition = "text")
    private String mainImageUrl;

    // PostgreSQL text[] (Hibernate 6)
    @JdbcTypeCode(SqlTypes.ARRAY)
    @Column(name = "image_gallery", columnDefinition = "text[]")
    private List<String> imageGallery;

    @Column(name = "rating_avg")
    private Double ratingAvg;

    @Column(name = "rating_count")
    private Integer ratingCount;

    @Column(name = "stock_status", nullable = false, columnDefinition = "text")
    private String stockStatus;  // "in_stock" | "out_of_stock" | "limited"

    @Column(name = "delivery_eta_min")
    private Integer deliveryEtaMin;

    @Column(name = "delivery_eta_max")
    private Integer deliveryEtaMax;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @JdbcTypeCode(SqlTypes.ARRAY)
    @Column(name = "tags", columnDefinition = "text[]")
    private List<String> tags;

    // timestamptz -> OffsetDateTime
    @CreationTimestamp
    @Column(name = "created_at", updatable = false, columnDefinition = "timestamptz")
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "timestamptz")
    private OffsetDateTime updatedAt;
}