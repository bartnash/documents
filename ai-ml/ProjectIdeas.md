# Agentic Support Framework

Common tools to support an application or suite of applications:

 - AI Chat agent for end users to request support.
    - Ask how to questions
    - Request status of system.
    - Should enter tickets as needed to request human support
    - Request support.
 - Agent should be able to be plugged in to slack
    - Agent should participate in conversations in slack channel, and be
      able to be interacted with via / or @
    - Separate tool for periodically generating question/answer based on slack thread, or could automatically or via prompt summarize resolution of thread and ask if it should be added to knowledgebase.  This interaction could be visible at end of thread, or could automatically create a separate dialog with support personnel to refine answer, which could then be posted back to thread as conclusion and added to knowledgebase (only after confirmation from human).
 - Supported by:
    - RAG database which contains:
        - Formal documentation
        - Answers to previous questions.
        Database should be updated periodically, either scheduled or 
        triggered by document updates.
        Database should automatically be updated based on discussions
        in slack channel.
    - MCP server(s) with tools for:
        - creating tickets
        - verifying status of application(s)
        - automatically initiate conversation (or ticket) to 
            - restart application or components.
            - update configuration
            - deploy patches or updates
            - reach out to other teams support channel.

    - Unique to each help agent instance:
        - The initial vector DB documentation source
        - Tools in MCP server specific to application under support.
    - Generic for all instances:
        - RAG database interaction
          - initial load
          - scheduled load
          - triggered load
        - Slack interface
          - Ability to summarize discussions and update knowledgebase
          - Possible ability to initiate thread with support personnel
          - Creating tickets.
          - Logic for deciding when to "page" support personnel, and how to escalate.


# Security Proxy
As agents interact with local and remote MCP servers and LLMs, there is the potential for unintentional leakage of data via prompts sent to the LLM.  There should be a huge market for a proxy that could be injected between a corporations network and all external LLMs.   The proxy could be a pass-thru or could offer filtering capabilities.  At minimum, it should raise alarms if it notices data passint through that appears to be proprietary or sensitive (customer PII, corporate IP).  It could also attempt to either block such traffic or attempt to mask it.


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
just ugly.  Could AI edit the image to either remove them, or modify the image to make
them unrecognizable, ie, look like a random stranger?

In view mode, touching a persons face might show read or play their comments
for that picture or display bio.

Would there be way to make editing the album a collaborative, realtime
experience?   All participants could be on a shared video call, talking
together.  Could system know who each person on the call is and automatically
support each uploading photos and identify their individual comments
realtime?

Could provide voting for whether or not to include specific images in the
final album.   Could vote on captions as well.

# Personal Proxy
Personal proxy-type assistant which can absorb details about you, as a person.   It should 
learn through absorbing documents like resumes, biography, maybe social media profiles.  
It should have two interfaces, one for others to interact with and one for you. It could be expanded to 
help manage calendar, answer phone calls and texts.  Could eventually be given access to email and calendar.

- WhoAmI interface should accept docs like resume, etc.  Also should have chat interface in 
which I can type in information about myself.  It would be great if it could conduct an interview and ask questions.
- WhoAreYou interface is open to public (or limited audience).  It can be used to train the model initially.  You can ask questions and it will answer as best it can.  If it needs more info, it should query the subject. And reply to querior immediately or via email/text (would require interviewer to provide contact info).

The application should have both a text and voice interface.

Should enable interactive voice in a web screen or by an actual phone call.

Need a way for both voicemail and text to immediately switch to real-time interactive mode with proxy.
Over time, this could learn more details about the subject and could be made available through voicemail options and text
- Voicemail - "I can't take your call right now, you can leave a message or speak to Waldo, my personal assistant who is available immediately"
- Text - I'm busy, text "Hey Waldo" to talk to my personal assistant.
  - Any text that starts with "Waldo,", "Hey Waldo" would start a dialog with Waldo.   All replies from Waldo should end in "-Waldo".
  - In fact, the initial "I'm busy" reply should be from Waldo.  "Bart is busy at the moment, he'll get back to you when he can, or you can talk to me.  -Waldo".  It should then react to any texts within the next n minutes as -Waldo.  Text basically becomes an interface to Waldo.


# Fediverse Moderator 
Use AI to build a moderator for Fediverse applications.  This 
could be a plugin enabled by individuals, or at the host level.

Ideally it would be able to both find items to show the end user
that match their interests, as well as filter out offensive 
materials.   

Could it intentionally provide alternative points of view?  ie,
instead of only magnifying the echo chamber, help people seek
out a counter point.

Should focus on ActivityPub to begin with?


