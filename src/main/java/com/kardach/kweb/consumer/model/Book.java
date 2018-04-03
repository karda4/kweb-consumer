package com.kardach.kweb.consumer.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Book {

	private Long id;
	@NonNull
	private String title;
	@NonNull
	private String author;
}
