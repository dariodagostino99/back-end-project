package com.java.darioproject.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

import javax.persistence.Id;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@SolrDocument(solrCoreName = "professor")
public class Professor {

    @Id
    @Field
    private Long id;
    @Field
    private String name;
    @Field
    private String lastName;
    @Field
    private String subject;
}
