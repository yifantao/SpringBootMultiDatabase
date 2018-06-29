package indi.yftao.multidb.book;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @descriptionn:
 * @author: yftao
 * @create: 2018-06-29 16:38
 **/
public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
