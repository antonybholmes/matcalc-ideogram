package edu.columbia.rdf.matcalc.toolbox.ideogram.app;

import org.jebtk.core.AppVersion;
import org.jebtk.modern.UIService;
import org.jebtk.modern.help.GuiAppInfo;


public class IdeogramInfo extends GuiAppInfo {

	public IdeogramInfo() {
		super("Ideogram",
				new AppVersion(2),
				"Copyright (C) 2016-${year} Antony Holmes",
				UIService.getInstance().loadIcon(IdeogramIcon.class, 32),
				UIService.getInstance().loadIcon(IdeogramIcon.class, 128),
				"Create Ideograms.");
	}

}
