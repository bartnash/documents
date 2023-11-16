# Photograph Cataloging
Use generative AI to generate captions for photos, then engage in a conversation 
with user about each image and refine the caption.  The end result could be
a simple caption, as well as a more detailed story for each image.
Groups of images could be organized into albums.

Should be great for organizing photos after a trip.  Could take as input 
all the photos from a trip, possibly from multiple sources.

Could offer option to auto-correct images as well.

The basic flow would be to tell Cataloger that you want to create a
new album.  Upload/attach images.  Cataloger performs analysis on each
image.  It would be great if it could analyze metadata, including gps, date/time, etc.
If possible, group images by source.  If we find that one source was
recording inaccurate date/time or location we should be able to adjust
all data from that source by the appropriate drift.

After initial analysis, Cataloger should begin walking through images.  
For each image:

- Display image, along with generated caption.
- User could opt to skip or discard the image.
- Converse with user about image, refining caption and forming detailed story.
  - Could include a story from each person on the trip, a summary, and publicly
    available info about the location.
- Offer user the ability to auto-correct or otherwise adjust the image.

If this is an online service, one user could create the initial album
upload their images and invite others who were on the trip to do the 
same.  Each user would go through their initial conversation about the
images they attach and then have opportunity to make comments on all
images.  Creator of the album would have editorial rights to entire 
album.

Could cataloger learn along the way?   If the user names the people in
one image, could cataloger use facial recognition to then recognize them
in later images?

For your personal cataloger, could it retain gathered knowledge for 
future catalogs?

There are definitely privacy concerns here.  This could run locally
and keep all personal info on local PC.  Could run in cloud, but keep
personal info on user's Google drive, dropbox, etc.

For security, users don't necessarily have to create a full login account,
just provide either email or phone #.  Application would send verification
code as email or text.  Might require the album owner to have full login,
at least in order to unlock certain functionality.

Allow each user to specify whether their image can be shared on social media.
  Could/should that be applied to each picture they're in, as well as the
  onse they uploaded?

Could possibly blur out people who want to remain incognito.  Cool feature or 
just ugly.

In view mode, touching a persons face might show read or play their comments
for that picture or display bio.

Would there be way to make editing the album a collaborative, realtime
experience?   All participants could be on a shared video call, talking
together.  Could system know who each person on the call is and automatically
support each uploading photos and identify their individual comments
realtime?

Could provide voting for whether or not to include specific images in the
final album.   Could vote on captions as well.
