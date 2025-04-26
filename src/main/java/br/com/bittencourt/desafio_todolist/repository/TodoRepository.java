package br.com.bittencourt.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bittencourt.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
