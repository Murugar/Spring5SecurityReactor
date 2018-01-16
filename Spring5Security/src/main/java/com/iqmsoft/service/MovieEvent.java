package com.iqmsoft.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.iqmsoft.data.Movie;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class MovieEvent implements Serializable {

  private static final long serialVersionUID = -983025291321071054L;

  Movie movie;
  LocalDateTime updatedAt;
}
