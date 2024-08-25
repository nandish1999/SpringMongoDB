package com.learning.Joblisting;

import java.util.List;

public interface SearchRepository 
{
	List<Post> findByText(String text);
}
