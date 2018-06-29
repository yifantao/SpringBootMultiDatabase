package indi.yftao.multidb.book;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @descriptionn:
 * @author: yftao
 * @create: 2018-06-29 16:36
 **/
@Entity
@Table(name = "book")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;
}
