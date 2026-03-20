package io.github.cottonmc.cotton.gui.impl.client;

import io.github.cottonmc.cotton.gui.impl.mixin.client.DrawnTextConsumerClickHandlerAccessor;
import net.minecraft.client.gui.ActiveTextCollector;
import net.minecraft.client.gui.Font;

public class TextStyleCapturer extends ActiveTextCollector.ClickableStyleFinder {
	public TextStyleCapturer(Font textRenderer, int clickX, int clickY) {
		super(textRenderer, clickX, clickY);
		var self = (DrawnTextConsumerClickHandlerAccessor) this;
		self.libgui$setSetStyleCallback(self::libgui$setStyle);
	}
}
