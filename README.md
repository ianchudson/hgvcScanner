# hgvcScanner
This project is a work in progress created from the desire to not check timeshare availability every day.
Currently run from IDE, the roadmap below outlines the enhancements I'm working to make in the future.

**Link to Demo:** (Once I have an online demo, I'll add it here.)

## How It's Made:

**Tech used:** Java, Maven, Playwright

### Construction and Purpose
I started by exploring the ability to use APIs to gather the information without having to remember to check the webiste every morning.
However, I quickly realized that it would be more complicated than desirable to use Postman. I started looking for alternatives and remembered that Playwright would essentially serve the same purpose, but also allow me to get through he OIDC flow. Additionally, Playwright still exposes a fairly robust API context while still leveraging the page context/cookies. Perfect for my purposes and we were off to the races.

## Optimizations
Oddly enough, the first time I've "written an algorithm" in my own personal projects, the print availability loop with trailing start dates is about as close to a leetcode examp as I can remember for a silly side project. 



## Usage

Currently run via IDE, but will expand and simplify in the future.

### Setup

1. Copy .env.example to .env providing your login credentials to HGVC
2. (Optional) You'll see two references to `VALDORO_RESORT_ID` in the Interactor and Scanner classes, those need to be updated to the resort id you're looking to check availability for.
   1. Update those references or supplement them with the resort you're looking to query.
   2. How does that work?
      1. Currently, there's no better way than logging in and using the network tab on the resort you're looking for.
      2. Hunt for `.../api/availability/resort/8c906121-d85c-47f3-857f-914419aa73e2` in an XHR GET, that UUID is the resort id.
3. Availability Window: Currently Coded to 3, this is the minimum stay window allowable in most locations.
   1. Some of these properties probably need to become defaults and variable based on resort later.
   2. I might see if I can create a "site scraper" to grab all of this info in the future to cache the resort data.

### Run

Once configured, you can run from the HGVCAvailability Scanner.
This is setup to perform two API Requests:

0-276 days (check current booking availability)
276-365 days (check nearly available dates to plan ahead)

## Next Steps / Roadmap
- [ ] Add Tests
- [ ] Refactor into SpringBoot
  - [ ] Convert to CronJob for Runs
- [ ] Containerize
- [ ] Add Persistent Storage
  - [ ] Build Resort Database
  - [ ] Detect Availability Changes
- [ ] Implement Notifications
