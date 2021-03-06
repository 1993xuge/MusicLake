package com.cyl.musiclake.ui.music.playlist

import android.content.Context
import com.cyl.musiclake.ui.base.BaseContract
import com.cyl.musiclake.bean.Album
import com.cyl.musiclake.bean.Artist
import com.cyl.musiclake.bean.Music
import com.cyl.musiclake.bean.Playlist

interface PlaylistDetailContract {

    interface View : BaseContract.BaseView {

        override fun getContext(): Context
        fun showPlaylistSongs(songList: MutableList<Music>?)

        fun showTitle(title: String)
        fun showCover(cover: String)
        fun showDescInfo(title: String)
        fun removeMusic(position: Int)

        fun success(type: Int)

        fun showEmptyView(msg: String)
    }

    interface Presenter : BaseContract.BasePresenter<View> {
        fun loadPlaylistSongs(playlist: Playlist)

        fun loadArtistSongs(artist: Artist)

        fun loadAlbumSongs(album: Album)

        fun deletePlaylist(playlist: Playlist)

        fun renamePlaylist(playlist: Playlist, title: String)
    }
}
