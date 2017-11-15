package edu.vt.alic.horses.breeds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.entity.Horse.Color;
import org.bukkit.entity.Horse.Style;

import edu.vt.alic.horses.Specialization;

public class GypsyVanner extends Breed {

	@Override
	public String getName() {
		return "Gypsy Vanner";
	}

	@Override
	public double getHeight() {
		return 15.0;
	}

	@Override
	public Specialization getSpecialization() {
		return Specialization.STAMINA;
	}

	@Override
	public List<Color> getSupportedColors() {
		return new ArrayList<Color>(Arrays.asList(Color.BROWN, Color.DARK_BROWN, Color.BLACK));
	}
	
	@Override
	public List<Style> getSupportedStyles() {
		return new ArrayList<Style>(Arrays.asList(Style.WHITEFIELD));
	}
}
