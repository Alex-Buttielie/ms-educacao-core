package br.com.coreeduc.aplication.records;

import java.io.Serializable;

public record NeighbordhoodRecord(String id, String description, String city) implements Serializable {
}