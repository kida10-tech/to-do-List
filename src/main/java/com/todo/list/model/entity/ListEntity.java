package com.todo.list.model.entity;

import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@Table(name = "list")
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete(sql = "UPDATE list SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")
@Entity
public class ListEntity extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String title;

    @NotNull
    private Boolean done;
}
