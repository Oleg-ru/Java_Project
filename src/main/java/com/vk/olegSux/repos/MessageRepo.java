package com.vk.olegSux.repos;

import com.vk.olegSux.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo  extends CrudRepository<Message, Integer> {
}
