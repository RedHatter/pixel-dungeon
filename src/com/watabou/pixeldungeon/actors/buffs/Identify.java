package com.watabou.pixeldungeon.actors.buffs;

import java.util.Iterator;

import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.items.Item;
import com.watabou.pixeldungeon.items.weapon.Weapon;
import com.watabou.pixeldungeon.items.armor.Armor;

public class Identify extends Buff {

	@Override
	public boolean act() {
		Iterator<Item> iterator = Dungeon.hero.belongings.iterator ();
		while (iterator.hasNext ()) {
			Item item = iterator.next();
			if (item instanceof Weapon)
				((Weapon) item).knowBy(0.05f);
			else if (item instanceof Armor)
				((Armor) item).knowBy(0.05f);
		}

		spend( TICK );

		return true;
	}
}
