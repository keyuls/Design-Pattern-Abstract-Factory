
public class IMenuGeneratorEveningOnly extends IMenuGenerator {

	@Override
	createMenuCreator getMenu() {
				return new createMenuCreatorEveningOnly();
	}

}
