package net.demondev.portablejukebox.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;

public class JukeboxItem extends Item {
    public JukeboxItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);

        if (!world.isClientSide) {
            // Play a sound or start music track, for example a music disc
            world.playSound(null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.MUSIC_DISC_OTHERSIDE, SoundSource.RECORDS, 1.0F, 1.0F);

            // You can add logic to cycle through tracks or manage custom sound events here
        }

        return InteractionResultHolder.sidedSuccess(itemStack, world.isClientSide());
    }

    // Optionally, you can add a method to handle track cycling
    private void playNextTrack(Level world, Player player) {
        // Logic for playing the next track from a list of sounds
    }
}
