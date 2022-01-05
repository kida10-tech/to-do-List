package com.todo.list.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Table(name = "list")
@AllArgsConstructor
@NoArgsConstructor
@SQLDelete(sql = "UPDATE lists SET deleted = true WHERE id=?")
@Where(clause = "deleted = false")
@Entity
public class ListEntity extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String title;
    private Boolean done;
}
