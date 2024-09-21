package com.Vishesh.GroundWater.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class GroundWater {
    @Id
    String district_name;
    float annual_domestic_industrial_draft;
    float annual_irrigation_draft;
    float annual_groundwater_draft_total;
    float annual_replenishable_groundwater_resources;
    float natural_discharge_during_non_monsoon;
    float net_groundwater_availability;
    float projected_demand_upto_2025;
    float groundwater_availability_for_irrigation;
    float stage_of_groundwater_development;
}