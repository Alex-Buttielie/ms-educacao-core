package br.com.coreeduc.aplication.records;

public record WaterSupplyEducacensoRecord(Integer publicWaterSupply,
                                          Integer artesianWell,
                                          Integer wellCistern,
                                          Integer springRiverStream,
                                          Integer noWaterSupply) {}
